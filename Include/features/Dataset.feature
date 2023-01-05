
@Datasetmanager
Feature:Create dataset in dataset manager page
  

  @Datasetmanager
  Scenario: Create dataset in dataset manager page 

    When User Click On The Create Dataset User Should Be Redirected To Create Dataset Pannel
    Then User should be redirected to create dataset pannel
  
    When check whether User can Create Dataset Without Filling Required Input
    Then user should not create dataset without filling required info 
    When Check whether User can create Two Dataset With Same Name
    Then user should not be create two dataset with same name
    When Check Dataset Description Accept Special Character
    Then Description should aceept special characters
    When Check User Can Select Modality From The Dropdown In Dataset Upload Panel
    Then user can select modality from dropdown
    When Check If User Can Select More Than One Modality At One Time
    Then user should not select multiple modalitys in one
    When Check If User Choose Ct Modality Only Ct Data Can Be Uploded
    Then If user selected ct modalities only ct data can be upload else it should give a error massage
    When Check If User Choose Mr Modality Only Mr Data Can Be Uploded
    Then If user selected Mr modalities only mr data can be upload else it should give a error massage
    When Check If User Choose MG Modality Only MG Data Can Be Uploded
    Then If user selected Mg modalities only mg data can be upload else it should give a error massage
    When Check If User Choose Dx|Cr|Xc Modality Only Dx|Cr|Xc Data Can Be Uploded
    Then If user selected Dx|Cr|Xc modalities only ct data can be upload else it should give a error massage
    When Check If User Choose Us Modality Only Us Data Can Be Uploded
    Then If user selected Us modalities only us data can be upload else it should give a error massage

    
   
    