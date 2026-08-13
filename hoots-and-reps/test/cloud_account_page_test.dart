import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/data/local_history_audit.dart';
import 'package:hoots_and_reps/data/supabase_auth_repository.dart';
import 'package:hoots_and_reps/profile/cloud_account_page.dart';

void main() {
  testWidgets('keeps cloud account optional in an offline build', (
    tester,
  ) async {
    await tester.pumpWidget(
      MaterialApp(
        home: CloudAccountPage(
          auth: SupabaseAuthRepository.disabled(),
          historyAudit: () async => const LocalHistoryAudit(
            programs: [],
            snapshotIds: [],
            activeSnapshotId: null,
            archivedProgress: [],
            sequenceScopedConditioningResults: 0,
            benchmarkEventCount: 0,
            personalRecordCount: 0,
            trainingMaxCount: 0,
            issues: [],
          ),
        ),
      ),
    );

    expect(find.text('OFFLINE MODE'), findsOneWidget);
    expect(find.textContaining('no cloud project settings'), findsOneWidget);
    expect(find.text('SIGN IN'), findsNothing);
  });

  test('requires matching passwords before creating an account', () {
    expect(
      validateCloudAccountCredentials(
        email: 'athlete@example.com',
        password: 'correct-horse',
        passwordConfirmation: 'different-password',
        creatingAccount: true,
      ),
      'The two passwords do not match.',
    );
    expect(
      validateCloudAccountCredentials(
        email: 'athlete@example.com',
        password: 'correct-horse',
        passwordConfirmation: 'correct-horse',
        creatingAccount: true,
      ),
      isNull,
    );
  });

  test('explains Supabase email rate limits without raw status text', () {
    expect(
      friendlyCloudAuthError(Exception('AuthException statusCode: 429')),
      contains('two messages per hour'),
    );
  });
}
