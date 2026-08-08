# Hoots & Reps implementation notes

## Text input in modal sheets and dialogs

Android can keep an `EditableText` mounted while a modal route and the IME are
finishing their exit transitions. Do **not** dispose a `TextEditingController`
from the `Future` returned by `showModalBottomSheet` or `showDialog`, including
after a fixed delay. Doing so has caused Flutter's framework assertion
`_dependents.isEmpty` when an athlete taps out of a score field.

For one-shot score-entry sheets, call `_releaseSheetTextControllers(...)` after
the route returns; it intentionally does not dispose the controllers. They are
unreachable after the route completes and are reclaimed safely after Flutter
has detached the text fields. For a reusable sheet widget, prefer state-owned
controllers and dispose them from that widget's `State.dispose` method.

Before shipping a new score or form sheet, manually verify this sequence on a
physical Android device: focus a numeric field, enter a value, tap outside the
field to hide the keyboard, and then save or dismiss the sheet.
