package com.enviro.assessment.grad001.KhethukuthulaSimamane.initialData;

import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.DisposalGuidelines;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.RecyclingTips;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.WasteCategory;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.repository.DisposalGuidelinesRepository;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.repository.RecyclingTipsRepository;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.repository.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private WasteCategoryRepository wasteCategoryRepository;

    @Autowired
    private DisposalGuidelinesRepository disposalGuidelinesRepository;

    @Autowired
    private RecyclingTipsRepository recyclingTipsRepository;

    @Override
    public void run(String... args) throws Exception {
        // Create the Waste Categories
        WasteCategory municipalSolidWaste = new WasteCategory(null, "Municipal Solid Waste", true, true, "General household waste", "Bin");
        WasteCategory industrialWaste = new WasteCategory(null, "Industrial Waste", false, true, "Waste from industrial activities", "Container");
        WasteCategory agriculturalWaste = new WasteCategory(null, "Agricultural Waste", true, true, "Waste from agricultural activities", "Bin");
        WasteCategory hazardousWaste = new WasteCategory(null, "Hazardous Waste", false, false, "Waste that poses substantial threats to public health or the environment", "Special Container");

        wasteCategoryRepository.saveAll(List.of(municipalSolidWaste, industrialWaste, agriculturalWaste, hazardousWaste));

        // Create the Disposal Guidelines
        DisposalGuidelines guideline1 = new DisposalGuidelines(null, municipalSolidWaste, "Place in the bin", "Household waste should be disposed of in the bin");
        DisposalGuidelines guideline2 = new DisposalGuidelines(null, industrialWaste, "Use special container", "Industrial waste should be placed in special containers");
        DisposalGuidelines guideline3 = new DisposalGuidelines(null, agriculturalWaste, "Place in the bin", "Agricultural waste should be placed in the bin");
        DisposalGuidelines guideline4 = new DisposalGuidelines(null, hazardousWaste, "Handle with care", "Hazardous waste should be handled with extreme care and placed in special containers");

        disposalGuidelinesRepository.saveAll(List.of(guideline1, guideline2, guideline3, guideline4));

        // Create the Recycling Tips
        RecyclingTips tip1 = new RecyclingTips(null, municipalSolidWaste, "Separate paper and plastic", "Recyclable materials should be separated from general waste");
        RecyclingTips tip2 = new RecyclingTips(null, industrialWaste, "Recycle metals and plastics", "Metals and plastics from industrial waste can be recycled");
        RecyclingTips tip3 = new RecyclingTips(null, agriculturalWaste, "Compost organic waste", "Organic agricultural waste can be composted");
        RecyclingTips tip4 = new RecyclingTips(null, hazardousWaste, "Cannot be recycled", "Hazardous waste should not be recycled");

        recyclingTipsRepository.saveAll(List.of(tip1, tip2, tip3, tip4));
    }
}
