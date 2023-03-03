package sg.edu.nus.iss.ssf_assessment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.ssf_assessment.models.Quotation;

@Service
public class QuotationService {
    
    public Quotation getQuotation (List<String> items) {

        Quotation quotation = new Quotation();

        return quotation;
    }
}
