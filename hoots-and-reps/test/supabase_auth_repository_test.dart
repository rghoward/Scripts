import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/data/supabase_auth_repository.dart';

void main() {
  test('email confirmation returns to the registered native callback', () {
    expect(
      SupabaseAuthRepository.emailConfirmationRedirectUrl,
      'com.rhoward.hootsandreps://auth/callback',
    );
  });
}
