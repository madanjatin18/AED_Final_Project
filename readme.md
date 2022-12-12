
# Community Welfare Application

#### AKHILESH DONGRE  002784651
#### JATIN MADAN          002727159
#### SHIVANI SHEKHAWAT  002656554 

### *“Let us remember: One book, one pen, one child, and one teacher can change the world.”* &nbsp; &nbsp; ~ Malala Yousafzai



A Community is dependant on the authorities for social services and we provide an 
application that is available for responsible citizens to be socially helpful and contribute to the society.
A centralized application that leverages potential of a society to help itself.

The aim is to develop an application that enables in providing 
help to the less privileged, old age homes, orphanages. 
The
concept is based on connecting different people by providing 
an opportunity to help community by donating the basic necassities like food, clothing,
study materials which aid to the people in need through this Application.

### Key Functionalities:
A.	Social Service Enterprise: 

•	Providing help to needy people through Help Provider Organization. 

•	Requesting help through Help Seekers Organization. 

•	Working as an inter-mediatory between needy people and volunteers, suppliers with the help of NGO.

•	Providing manpower with the help of Volunteer Organization to NGOs as per their work type and requests.

B.	Supplier Enterprise: 

•	Supplying the materials requested by help seekers towards the NGO.

•	Donating the materials with the help of Donor Organization to Suppliers which in turn is provided to the NGOs.

C. NGO Enterprise:

•	Plan events and the Assigning necessary requirements for the events.



D. Hospital Enterprise:

•	Assigning Doctors their respective credentials to deal with any Medical aid required.

•	Dealing with the requirements where the need of medical 
equipment or facilities is needed.

•	Recording Vitals for a patient.




## APPROACH




### MODEL OBJECT 
![AED_Object_Model](https://user-images.githubusercontent.com/114017380/206821254-02d4a7f4-e64d-46a8-b775-cc6973352a47.jpg)
### CLASS DIAGRAM

![classdiagram](https://user-images.githubusercontent.com/114017380/206961194-e6ba4974-b681-402a-bef5-e6242dcb5f24.png)

### OBJECTIVE

![AED pic 1](https://user-images.githubusercontent.com/114017380/206821196-df57862e-521d-4adc-b71f-7df8e7623edf.jpeg)

### USECASE

![AED PIC USE CASE)](https://user-images.githubusercontent.com/114017380/206890831-53ebde4f-6a13-4a4e-bf1d-b84472896279.jpeg)

### COVER PAGE

![CoverLoginPage](https://user-images.githubusercontent.com/114017380/206959833-00134b61-0053-4648-957a-41e252fb9504.png)

### HELP SEEKER POSTING A WORK REQUEST

![HelpSeekRequest](https://user-images.githubusercontent.com/114017380/206959975-66cc48c5-784d-47d0-b7c0-b78672c0360f.png)

### HELP PROVIDER ACCEPTING A WORK REQUEST

![HelpProviderApproveRequestNGO](https://user-images.githubusercontent.com/114017380/206959854-b2161819-596d-4ef4-9404-844a5d78a3f2.png)
  
### HELP PROVIDER FORWARDING THE WORK REQUEST TO NGO REQUESTED BY HELP SEEKER

![HelpProvidersendingRequesttoHospital](https://user-images.githubusercontent.com/114017380/206959876-380fac86-a2eb-41df-a638-6074792d73e2.png)

### NGO COMPLETING A REQUEST FORWARDED BY HELP PROVIDER

![NGOApprovingRequest](https://user-images.githubusercontent.com/114017380/206960123-f12803d2-90de-4e71-9e1f-003ceeeb2e6b.png)

### HELP PROVIDER FORWARDING THE HOSPITAL RELATED WORK REQUEST TO DOCTOR
![HelpProvidersendingRequesttoHospital (1)](https://user-images.githubusercontent.com/114017380/206960191-775d99bc-d823-423a-bf06-503be9a5dc41.png)

### DOCTOR COMPLETING THE HOSPITAL RELATED WORK REQUEST FORWARDED BY HELP PROVIDER
![DoctorCompleteRequestFinal](https://user-images.githubusercontent.com/114017380/206960292-e54889d9-f336-4e92-aca1-c04c962a6108.png)

### NGO CREATING AN EVENT
![NGOCreatingEvent](https://user-images.githubusercontent.com/114017380/206960360-43f4186c-d3db-4246-9377-c007e082b003.png)

### VOLUNTEER REGISTERING FOR AN EVENT CREATED BY NGO
![VolunteerJoinEventFinal](https://user-images.githubusercontent.com/114017380/206960496-2b02b7bf-34f3-4f1a-8d02-3a062ddaf720.png)

### NGO CREATING REQUEST FOR SUPPLIER
![NGOCreateRequestForSupply](https://user-images.githubusercontent.com/114017380/206960533-32f82045-e8d0-4519-8d36-bb583abea147.png)

### SUPPLIER CREATING DONATION REQUEST FOR DONORS
![SupplierCreateRequesttoDoners](https://user-images.githubusercontent.com/114017380/206960578-b8a28dfc-9d0a-4ffa-925e-4b98c9776090.png)

### DONOR FULFULLING THE DONATION REQUEST FORWARDED BY SUPPLIER
![DonerCompletingRequest](https://user-images.githubusercontent.com/114017380/206960713-d77cb51b-8de6-419e-b962-0dc2ad7aa4e6.png)

### SUPPLY DASHBOARD
![SupplyDashboard](https://user-images.githubusercontent.com/114017380/206960937-6a2188c8-2ef7-4b7b-9a58-ad58f1f2a910.png)





CONTRIBUTIONS:
1) AKHILESH : 
CRUD DONOR, README, UI,
Enterprise, Employee,
UI.SocialServiceEnterprise, UI.SupplierEnterprise,
Ui.Donor, Ui.Donor.DonorUser,
Ui.Volunteer,
Business.Donor, Business.Volunteer

2) SHIVANI : 
UI, URL FEATURE, CRUD,Network, Organization
UserInterface, UI.SysAdmin,
BusinessModel.Role,
UI.SupplierManager, UI.NGOManager,
Ui.HelpProvider, Ui.HelpProviderUser,
Ui.HelpSeeker, Ui.HelpSeekerUser,
Business.HelpSeeker, Business.HelpProvider,
Business.Supplier

3) JATIN : 
CAMERA FEATURE, CRUD,WorkQueue, UI.SysAdministrator
UI.NGOEnterprise, UI.HospitalEnterprise
Ui.Doctor, UI.Doctor.DoctorUser
Business.NGO, Business.Doctor
