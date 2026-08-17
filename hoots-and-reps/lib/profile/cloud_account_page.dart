import 'package:flutter/material.dart';

import '../data/local_history_audit.dart';
import '../data/supabase_history_import_repository.dart';
import '../data/supabase_auth_repository.dart';

const _ink = Color(0xfff7f5ef);
const _muted = Color(0xffada6c1);
const _paper = Color(0xff070615);
const _card = Color(0xff151127);
const _border = Color(0xff4b3a78);
const _fire = Color(0xffa855f7);
const _cyan = Color(0xff56d7ff);

String? validateCloudAccountCredentials({
  required String email,
  required String password,
  required bool creatingAccount,
  String? passwordConfirmation,
}) {
  if (email.trim().isEmpty || password.isEmpty) {
    return 'Enter an email address and password.';
  }
  if (creatingAccount && password != passwordConfirmation) {
    return 'The two passwords do not match.';
  }
  return null;
}

String friendlyCloudAuthError(Object error) {
  final value = error.toString();
  if (value.toLowerCase().contains('invalid login credentials')) {
    return 'That email or password did not match an account.';
  }
  if (value.contains('429') ||
      value.toLowerCase().contains('over_email_send_rate_limit')) {
    return 'Email sending is temporarily limited. Supabase’s starter email '
        'service allows two messages per hour for this project. Wait about '
        'an hour, then try once.';
  }
  return value
      .replaceFirst('AuthException(message: ', '')
      .replaceFirst(', statusCode: null)', '');
}

/// Account entry point for a multi-athlete cloud. It never blocks offline
/// training, and deliberately shows the import inventory before any data is
/// allowed to leave the device.
class CloudAccountPage extends StatefulWidget {
  const CloudAccountPage({
    required this.auth,
    required this.historyAudit,
    this.importLocalHistory,
    super.key,
  });

  final SupabaseAuthRepository auth;
  final Future<LocalHistoryAudit> Function() historyAudit;
  final Future<CloudHistoryImportResult> Function()? importLocalHistory;

  @override
  State<CloudAccountPage> createState() => _CloudAccountPageState();
}

class _CloudAccountPageState extends State<CloudAccountPage> {
  final _email = TextEditingController();
  final _password = TextEditingController();
  final _passwordConfirmation = TextEditingController();
  final _displayName = TextEditingController();
  late final Future<LocalHistoryAudit>? _audit = widget.auth.isEnabled
      ? widget.historyAudit()
      : null;
  var _creatingAccount = false;
  var _submitting = false;
  var _passwordVisible = false;
  var _passwordConfirmationVisible = false;
  String? _message;

  @override
  void dispose() {
    _email.dispose();
    _password.dispose();
    _passwordConfirmation.dispose();
    _displayName.dispose();
    super.dispose();
  }

  Future<void> _submit() async {
    final validationMessage = validateCloudAccountCredentials(
      email: _email.text,
      password: _password.text,
      creatingAccount: _creatingAccount,
      passwordConfirmation: _passwordConfirmation.text,
    );
    if (validationMessage != null) {
      setState(() => _message = validationMessage);
      return;
    }
    setState(() {
      _submitting = true;
      _message = null;
    });
    final creatingAccount = _creatingAccount;
    try {
      final result = creatingAccount
          ? await widget.auth.signUp(
              email: _email.text.trim(),
              password: _password.text,
              displayName: _displayName.text,
            )
          : await widget.auth.signInWithPassword(
              email: _email.text.trim(),
              password: _password.text,
            );
      if (!mounted) return;
      setState(() {
        if (result.session == null && creatingAccount) {
          _creatingAccount = false;
          _password.clear();
          _passwordConfirmation.clear();
          _displayName.clear();
          _passwordVisible = false;
          _passwordConfirmationVisible = false;
          _message =
              'Account created. Confirm the email, then sign in with this email and password.';
        } else {
          _message = 'Signed in. Your cloud history is ready for review.';
        }
      });
    } catch (error) {
      if (!mounted) return;
      setState(() => _message = friendlyCloudAuthError(error));
    } finally {
      if (mounted) {
        setState(() => _submitting = false);
      }
    }
  }

  Future<void> _signOut() async {
    await widget.auth.signOut();
    if (mounted) {
      setState(
        () => _message = 'Signed out. Local training remains on this device.',
      );
    }
  }

  Future<void> _import() async {
    final action = widget.importLocalHistory;
    final audit = _audit == null ? null : await _audit;
    if (action == null || audit == null) return;
    if (audit.hasBlockingIssues) {
      setState(
        () => _message =
            'Resolve the blocking local-history issue before importing.',
      );
      return;
    }
    if (!mounted) return;
    final confirmed = await showDialog<bool>(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: _card,
        title: const Text('Import this local history?'),
        content: Text(
          'This uploads ${audit.programs.length} program versions and ${audit.completedWorkoutCount} completed workouts to this signed-in account. It does not remove device data. Sequence-only conditioning scores stay on this phone for a later mapping review.',
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context, false),
            child: const Text('CANCEL'),
          ),
          FilledButton(
            onPressed: () => Navigator.pop(context, true),
            child: const Text('IMPORT HISTORY'),
          ),
        ],
      ),
    );
    if (confirmed != true) return;
    setState(() {
      _submitting = true;
      _message = 'Importing and verifying your history…';
    });
    try {
      final result = await action();
      if (!mounted) return;
      setState(() {
        _message = result.wasAlreadyImported
            ? 'This device history was already imported and verified.'
            : 'Imported ${result.importedPrograms} program versions, '
                  '${result.importedAssignments} assignments, and '
                  '${result.importedCompletions} completions. '
                  'Conditioning scores remain local for review.';
      });
    } catch (error) {
      if (!mounted) return;
      setState(
        () => _message =
            'Import stopped safely: $error. You can retry; '
            'completed rows are idempotent.',
      );
    } finally {
      if (mounted) setState(() => _submitting = false);
    }
  }

  @override
  Widget build(BuildContext context) => Scaffold(
    backgroundColor: _paper,
    appBar: AppBar(title: const Text('CLOUD ACCOUNT'), backgroundColor: _paper),
    body: SafeArea(
      child: StreamBuilder(
        stream: widget.auth.onAuthStateChange,
        initialData: widget.auth.currentSession,
        builder: (context, _) {
          final user = widget.auth.currentUser;
          return ListView(
            padding: const EdgeInsets.fromLTRB(20, 12, 20, 32),
            children: [
              const Text(
                'YOUR TRAINING, YOUR ACCOUNT',
                style: TextStyle(
                  color: _ink,
                  fontSize: 25,
                  fontWeight: FontWeight.w900,
                ),
              ),
              const SizedBox(height: 8),
              const Text(
                'Programs, completions, benchmarks, and PRs are isolated to the signed-in athlete. Training stays available offline while cloud sync is being set up.',
                style: TextStyle(color: _muted, height: 1.4),
              ),
              const SizedBox(height: 18),
              if (!widget.auth.isEnabled)
                _cloudNotConfiguredCard()
              else if (user == null)
                _signInCard()
              else ...[
                _signedInCard(user.email ?? 'Signed-in athlete'),
                const SizedBox(height: 12),
                _historyPreview(),
              ],
              if (_message != null) ...[
                const SizedBox(height: 14),
                Text(
                  _message!,
                  style: const TextStyle(color: _cyan, height: 1.35),
                ),
              ],
            ],
          );
        },
      ),
    ),
  );

  Widget _cloudNotConfiguredCard() => _panel(
    title: 'OFFLINE MODE',
    child: const Text(
      'This build has no cloud project settings yet. Your workouts are still saved locally. A configured build will let you sign in and review a safe import preview.',
      style: TextStyle(color: _muted, height: 1.4),
    ),
  );

  Widget _signInCard() => _panel(
    title: _creatingAccount ? 'CREATE ACCOUNT' : 'SIGN IN',
    child: Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        if (_creatingAccount) ...[
          _field(_displayName, 'Display name', TextInputType.name),
          const SizedBox(height: 10),
        ],
        _field(_email, 'Email', TextInputType.emailAddress),
        const SizedBox(height: 10),
        _passwordField(
          controller: _password,
          label: 'Password',
          visible: _passwordVisible,
          onVisibilityChanged: () =>
              setState(() => _passwordVisible = !_passwordVisible),
        ),
        if (_creatingAccount) ...[
          const SizedBox(height: 10),
          _passwordField(
            controller: _passwordConfirmation,
            label: 'Confirm password',
            visible: _passwordConfirmationVisible,
            onVisibilityChanged: () => setState(
              () =>
                  _passwordConfirmationVisible = !_passwordConfirmationVisible,
            ),
          ),
        ],
        const SizedBox(height: 16),
        SizedBox(
          width: double.infinity,
          child: FilledButton(
            onPressed: _submitting ? null : _submit,
            child: Text(
              _submitting
                  ? 'PLEASE WAIT…'
                  : _creatingAccount
                  ? 'CREATE ACCOUNT'
                  : 'SIGN IN',
            ),
          ),
        ),
        Align(
          alignment: Alignment.centerRight,
          child: TextButton(
            onPressed: _submitting
                ? null
                : () => setState(() {
                    _creatingAccount = !_creatingAccount;
                    _passwordConfirmation.clear();
                    _passwordVisible = false;
                    _passwordConfirmationVisible = false;
                    _message = null;
                  }),
            child: Text(
              _creatingAccount
                  ? 'I ALREADY HAVE AN ACCOUNT'
                  : 'CREATE AN ACCOUNT',
            ),
          ),
        ),
      ],
    ),
  );

  Widget _signedInCard(String email) => _panel(
    title: 'SIGNED IN',
    child: Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(
          email,
          style: const TextStyle(
            color: _ink,
            fontSize: 17,
            fontWeight: FontWeight.w700,
          ),
        ),
        const SizedBox(height: 8),
        const Text(
          'Your history stays on this phone unless you confirm a reviewed import. The import is retry-safe and never deletes local data.',
          style: TextStyle(color: _muted, height: 1.35),
        ),
        const SizedBox(height: 12),
        if (widget.importLocalHistory != null) ...[
          SizedBox(
            width: double.infinity,
            child: FilledButton.icon(
              onPressed: _submitting ? null : _import,
              icon: const Icon(Icons.cloud_upload_outlined),
              label: const Text('REVIEW & IMPORT LOCAL HISTORY'),
            ),
          ),
          const SizedBox(height: 8),
        ],
        OutlinedButton.icon(
          onPressed: _submitting ? null : _signOut,
          icon: const Icon(Icons.logout),
          label: const Text('SIGN OUT'),
        ),
      ],
    ),
  );

  Widget _historyPreview() => _panel(
    title: 'LOCAL HISTORY PREVIEW',
    child: FutureBuilder<LocalHistoryAudit>(
      future: _audit,
      builder: (context, snapshot) {
        if (snapshot.connectionState != ConnectionState.done) {
          return const Padding(
            padding: EdgeInsets.all(12),
            child: Center(child: CircularProgressIndicator(color: _cyan)),
          );
        }
        if (snapshot.hasError) {
          return const Text(
            'Could not read the local history inventory.',
            style: TextStyle(color: _muted),
          );
        }
        final audit = snapshot.requireData;
        return Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              '${audit.programs.length} local program${audit.programs.length == 1 ? '' : 's'} • ${audit.completedWorkoutCount} completed workout${audit.completedWorkoutCount == 1 ? '' : 's'}',
              style: const TextStyle(color: _ink, fontWeight: FontWeight.w700),
            ),
            const SizedBox(height: 8),
            for (final program in audit.programs)
              Text(
                '${program.title}: ${program.prescriptionCount} workouts, ${program.assignmentCounts['completed'] ?? 0} complete',
                style: const TextStyle(color: _muted, height: 1.35),
              ),
            if (audit.issues.isNotEmpty) ...[
              const SizedBox(height: 10),
              const Text(
                'REVIEW BEFORE IMPORT',
                style: TextStyle(color: _cyan, fontWeight: FontWeight.w900),
              ),
              const SizedBox(height: 4),
              for (final issue in audit.issues)
                Text(
                  '• $issue',
                  style: const TextStyle(color: _muted, height: 1.35),
                ),
            ],
          ],
        );
      },
    ),
  );

  Widget _field(
    TextEditingController controller,
    String label,
    TextInputType type,
  ) => TextField(
    controller: controller,
    keyboardType: type,
    autocorrect: false,
    decoration: _inputDecoration(label),
  );

  Widget _passwordField({
    required TextEditingController controller,
    required String label,
    required bool visible,
    required VoidCallback onVisibilityChanged,
  }) => TextField(
    controller: controller,
    obscureText: !visible,
    autocorrect: false,
    enableSuggestions: false,
    decoration: _inputDecoration(label).copyWith(
      suffixIcon: IconButton(
        tooltip: visible ? 'Hide password' : 'Show password',
        icon: Icon(visible ? Icons.visibility_off : Icons.visibility),
        onPressed: onVisibilityChanged,
      ),
    ),
  );

  InputDecoration _inputDecoration(String label) => InputDecoration(
    labelText: label,
    labelStyle: const TextStyle(color: _muted),
    enabledBorder: const OutlineInputBorder(
      borderSide: BorderSide(color: _border),
    ),
    focusedBorder: const OutlineInputBorder(
      borderSide: BorderSide(color: _fire),
    ),
  );

  Widget _panel({required String title, required Widget child}) => Container(
    padding: const EdgeInsets.all(16),
    decoration: BoxDecoration(
      color: _card,
      borderRadius: BorderRadius.circular(16),
      border: Border.all(color: _border),
    ),
    child: Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(
          title,
          style: const TextStyle(color: _cyan, fontWeight: FontWeight.w900),
        ),
        const SizedBox(height: 12),
        child,
      ],
    ),
  );
}
