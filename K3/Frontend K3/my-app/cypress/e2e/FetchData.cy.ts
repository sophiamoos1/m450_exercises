describe('Fetch Studentlist', () => {
  it('Goes to inital Page and clicks on the list students button', () => {
    cy.visit('/')
    cy.get('.student-btn').click()
  })
})
