package com.application.suchidetailsservice;

import com.application.suchidetailsservice.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;

    @GetMapping("/candidate/{candidate_id}")
    public ResponseEntity<Candidate> getCandidateById(@PathVariable(value = "candidate_id") String candidateId) throws ResourceNotFoundException {
        Candidate candidate = candidateRepository.findById(candidateId)
                .orElseThrow(() -> new ResourceNotFoundException("Candidate not found for this id :: " + candidateId));
        return ResponseEntity.ok().body(candidate);
    }

    @PostMapping("/candidate")
    public Candidate createCandidate(@Valid @RequestBody Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @PutMapping("/candidate/{candidate_id}")
    public ResponseEntity<Candidate> updateCandidate(@PathVariable(value = "candidate_id") String candidateId,
        @Valid @RequestBody Candidate candidateDetails) throws ResourceNotFoundException {
        Candidate candidate = candidateRepository.findById(candidateId)
                .orElseThrow(() -> new ResourceNotFoundException("Candidate not found for this id :: " + candidateId));

        //candidate.setSuchiId(candidateDetails.getSuchiId());
        candidate.setSalary(candidateDetails.getSalary());
        candidate.setExpectations(candidateDetails.getExpectations());
        candidate.setAssetDetails(candidateDetails.getAssetDetails());
        final Candidate updatedCandidate = candidateRepository.save(candidate);
        return ResponseEntity.ok(updatedCandidate);
    }

    @DeleteMapping("/candidate/{candidate_id}")
    public Map<String, Boolean> deleteCandidate(@PathVariable(value = "candidate_id") String candidateId) throws ResourceNotFoundException {
        Candidate candidate = candidateRepository.findById(candidateId)
                .orElseThrow(() -> new ResourceNotFoundException("Candidate not found for id :: " + candidateId));

        candidateRepository.delete(candidate);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
