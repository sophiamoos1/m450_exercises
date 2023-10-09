import {visit} from "@angular/compiler-cli/src/ngtsc/util/src/visitor";

describe('Create new student', () => {
  it('Navigates to the addstudents Page and checks if the form is accessable', () => {
    //navigate to add students page
    cy.visit('/addstudents')
    //checks for components
    cy.contains("Name")
    cy.contains("Email")
    cy.contains("Submit")
  })
  it('Enter Data to Form and submit form', () => {
    //navigate to add students page
    cy.visit('/addstudents')
    //fills out the form
    cy.get('#name').type("Test User")
    cy.get('#email').type("testuser@example.com")
    //clicks submit button
    cy.get('#submit-btn').click()
  });
})
