Feature: Nightly update

  """
  Description of the nightly update.
  """

  Scenario: Update to the new version (Origin REQ-59)

    Given There is update function in Redlike Helper
    When As POS admin want run update in night hours
    Then There will be new option in Helper for run update only in specific hours

  Scenario: Update to the new version (workshop version)
    Given System is not updated
    When Time is 9 PM
    Then Update is triggred

  Scenario: Update to the new version (workshop version 2)
    Given Update is triggred
    When Update with "version" is available on R2W
    Then RM is updated with "version"