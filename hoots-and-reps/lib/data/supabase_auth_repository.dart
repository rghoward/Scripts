import 'package:supabase_flutter/supabase_flutter.dart';

/// Narrow authentication boundary for the SQLite-first application.
///
/// UI and sync code depend on this repository rather than Supabase directly,
/// so a missing project configuration keeps all training features available
/// offline. The app will add account screens in the next vertical slice.
class SupabaseAuthRepository {
  const SupabaseAuthRepository._(this._client);

  /// The native callback that completes email confirmation inside the app.
  ///
  /// The readable page source at `supabase/storage/email-confirmed.html` must
  /// be deployed to an HTML-capable host before changing this URL. Supabase
  /// Edge Functions and Storage dashboard uploads serve GET HTML as plain text
  /// and must not be used for that host.
  /// This URL must be allowed in Supabase Authentication > URL Configuration.
  static const emailConfirmationRedirectUrl =
      'com.rhoward.hootsandreps://auth/callback';

  final SupabaseClient? _client;

  factory SupabaseAuthRepository.disabled() =>
      const SupabaseAuthRepository._(null);

  factory SupabaseAuthRepository.connected(SupabaseClient client) =>
      SupabaseAuthRepository._(client);

  bool get isEnabled => _client != null;
  User? get currentUser => _client?.auth.currentUser;
  Session? get currentSession => _client?.auth.currentSession;

  Stream<AuthState> get onAuthStateChange =>
      _client?.auth.onAuthStateChange ?? const Stream.empty();

  Future<AuthResponse> signUp({
    required String email,
    required String password,
    String? displayName,
  }) => _requireClient().auth.signUp(
    email: email,
    password: password,
    emailRedirectTo: emailConfirmationRedirectUrl,
    data: displayName == null || displayName.trim().isEmpty
        ? null
        : {'display_name': displayName.trim()},
  );

  Future<AuthResponse> signInWithPassword({
    required String email,
    required String password,
  }) => _requireClient().auth.signInWithPassword(
    email: email,
    password: password,
  );

  Future<void> signOut() => _requireClient().auth.signOut();

  SupabaseClient _requireClient() {
    final client = _client;
    if (client == null) {
      throw StateError(
        'Cloud accounts are not configured for this build. '
        'Supply SUPABASE_URL and SUPABASE_PUBLISHABLE_KEY.',
      );
    }
    return client;
  }
}
