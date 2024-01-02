package com.project.ElegantCraftsEmporium.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    @GetMapping("/CraftsEmporium/login")
    public String getLoginPage() {
        return "login"; // returns the logical view name (index.jsp)
    }
    
    @GetMapping("/CraftsEmporium/")
    public String getIndexPage() {
        return "index"; // returns the logical view name (index.jsp)
    }
    
    @GetMapping("/CraftsEmporium/SignUp")
    public String getSignUp() {
        return "registration"; // returns the logical view name (index.jsp)
    }
    
//    @GetMapping("/CureInSync/printDiseases")
//    public String printDiseases() {
//        return "printDiseases"; // returns the logical view name (index.jsp)
//    }
    
    @GetMapping("/CraftsEmporium/drugCat")
    public String getDrugCat() {
        return "drugCatalog"; // returns the logical view name (index.jsp)
    }
    
    @GetMapping("/CraftsEmporium/SelfAssessmentPatient")
    public String getSelfAssessmentPatient() {
        return "self_assessment_patient"; // returns the logical view name (index.jsp)
    }
}

