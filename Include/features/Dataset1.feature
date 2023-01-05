
@Datasetmanager
Feature: Create dataset and search dataset in dataset manager page
  

  @Datasetmanager
  Scenario: Create dataset and search dataset in dataset manager page
  
     When Check Dataset Name Is Same As The User Input
    Then dataset name should be same
    When Check Total Study Is Showing In Top Of The Dataset Page
    When Check Modality Is Showing In Top Of The Dataset Page
    Then Modality should be same as enters 
    When Check The Search In Dataset Is Working Or Not 
    Then search button should work as per the specificaion
    When Check User Have Function To Upload A Single File Or An Folder
    Then user should upload both single file and folder
    When Check For Modality Dx|Cr|Xc Only Dicom, Png, Jpg, Jpeg Are Accepted
    Then user should not be upload other format as given 
    When Check If User Upload Any Other Format Rather Than Dicom, Png, Jpg, Jpeg, Rvg Give An Error
    Then system should give an error if user try to upload dicom in other format
    When Check The Upload Speed Panel Shows The Exact No. Or Failed And Passed Studies While Upload
    Then count should be same on both places for fail and pass uploads
    When Check In Browser Annonymization Is Working Before We Upload Studies
    Then Browser Annonymization should be work before upload 
   
    When Check whether the Diacom Reciver Button Is Working Or Not
    Then user should have use this feature to annonyize study after upload 
    When Verify When Diacom Receiver Button Is On Ae Title And Port No. Will Shown in front end
    Then user should have use this feature to annonyize study after upload