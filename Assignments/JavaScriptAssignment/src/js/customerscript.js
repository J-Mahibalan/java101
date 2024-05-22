
        function addCustomer() {
            // Clear previous errors
            clearErrors();
 
            // Retrieve form values
            var name = document.getElementById("name").value.trim();
            var email = document.getElementById("email").value.trim();
            var contact = document.getElementById("contact").value.trim();
            var accountType = document.getElementById("account-type").value.trim();
            
            const customers = [];
            
            // Validation
            var isValid = true;
            if (!/^[a-zA-Z ]+$/.test(name)) {
                document.getElementById("nameError").innerText = "Please enter only alphabets.";
                isValid = false;
            }
            if (!isValidEmail(email)) {
                document.getElementById("emailError").innerText = "Please enter a valid email.";
                isValid = false;
            }
            if (!/^[7-9]\d{9}$/.test(contact)) {
                document.getElementById("contactError").innerText = "Please enter a valid 10-digit contact number.";
                isValid = false;
            }
            if (accountType === "") {
                document.getElementById("accountTypeError").innerText = "Please select an account type.";
                isValid = false;
            }
 
            if (isValid) {
                // Create customer object
                var customer = {
                    name: name,
                    email: email,
                    contact: contact,
                    accountType: accountType
                };
                customers.push(customer);
                console.log(customers);
                // Add customer to table
                displayCustomer(customer);
            
                // Reset form
                document.getElementById("customerForm").reset();
            }
        }
 
        function isValidEmail(email) {
            // Simple email validation regex
            return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
        }
 
        function displayCustomer(customer) {
            var table = document.getElementById("customers");
            var row = table.insertRow(-1);
            var nameCell = row.insertCell(0);
            var emailCell = row.insertCell(1);
            var contactCell = row.insertCell(2);
            var accountTypeCell = row.insertCell(3);
 
            nameCell.innerHTML = customer.name;
            emailCell.innerHTML = customer.email;
            contactCell.innerHTML = customer.contact;
            accountTypeCell.innerHTML = customer.accountType;
 
            document.getElementById("customerTable").style.display = "block";
        }
 
        function clearErrors() {
            document.getElementById("nameError").innerText = "";
            document.getElementById("emailError").innerText = "";
            document.getElementById("contactError").innerText = "";
            document.getElementById("accountTypeError").innerText = "";
        }
