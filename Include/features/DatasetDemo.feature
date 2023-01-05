
@datasetdemo
Feature: Dataset demo session 

  @Datasetdemo
  Scenario: Functional flow of Dataset

    When Check In Browser Annonymization Is Working Before We Upload Studies
    Then Browser Annonymization should be work before upload
    When Check User Can Delete Study
    Then user should delete the study that he uploaded
    When Check If User Choose Ct Modality Only Ct Data Can Be Uploded
    Then If user selected ct modalities only ct data can be upload else it should give a error massage
    When Check User Can Select Modality From The Dropdown In Dataset Upload Panel
    Then user can select modality from dropdown
    When Check Dataset Description Accept Special Character
    Then Description should aceept special characters
    When check whether User can Create Dataset Without Filling Required Input
    Then user should not create dataset without filling required info
     