import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/data/supabase_auth_repository.dart';

void main() {
  test('email confirmation opens the hosted success page', () {
    expect(
      SupabaseAuthRepository.emailConfirmationRedirectUrl,
      'https://cdn.jsdelivr.net/gh/rghoward/Scripts@main/hoots-and-reps/supabase/storage/email-confirmed.html',
    );
  });
}
