import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/data/supabase_auth_repository.dart';

void main() {
  test('email confirmation opens the hosted success page', () {
    expect(
      SupabaseAuthRepository.emailConfirmationRedirectUrl,
      'https://hoots-reps-confirmed-page.rghoward1988.workers.dev/email-confirmed',
    );
  });
}
