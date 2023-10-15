function showPopup() {
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const genderElements = document.querySelectorAll('input[name="gender"]:checked');
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;

    if (
        firstName && lastName && dob && country && genderElements.length > 0 &&
        profession && email && mobile
    ) {
        const gender = Array.from(genderElements).map(element => element.value).join(', ');

        const popupContent = `
            <p><strong>First Name:</strong> ${firstName}</p>
            <p><strong>Last Name:</strong> ${lastName}</p>
            <p><strong>Date of Birth:</strong> ${dob}</p>
            <p><strong>Country:</strong> ${country}</p>
            <p><strong>Gender:</strong> ${gender}</p>
            <p><strong>Profession:</strong> ${profession}</p>
            <p><strong>Email:</strong> ${email}</p>
            <p><strong>Mobile Number:</strong> ${mobile}</p>
        `;

        document.getElementById("popup-content").innerHTML = popupContent;
        document.getElementById("popup").style.display = "block";
        return false;
    } else {
        alert("Please fill in all the required fields.");
        return false;
    }
}

function closePopup() {
    document.getElementById("popup").style.display = "none";
}

function resetForm() {
    document.getElementById("popup").style.display = "none";
}
