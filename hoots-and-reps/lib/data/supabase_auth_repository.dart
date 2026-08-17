import 'package:supabase_flutter/supabase_flutter.dart';

/// Narrow authentication boundary for the SQLite-first application.
///
/// UI and sync code depend on this repository rather than Supabase directly,
/// so a missing project configuration keeps all training features available
/// offline. The app will add account screens in the next vertical slice.
class SupabaseAuthRepository {
  const SupabaseAuthRepository._(this._client);

  /// A readable public confirmation page served as static HTML from the
  /// version-controlled Hoots & Reps source through jsDelivr.
  ///
  /// The page confirms success in every email browser and forwards its query
  /// or fragment to the native callback only when the athlete selects the
  /// button. Edge Functions cannot serve this page because Supabase serves GET
  /// HTML from them as plain text.
  /// This URL must be allowed in Supabase Authentication > URL Configuration.
  static const emailConfirmationRedirectUrl =
      'https://cdn.jsdelivr.net/gh/rghoward/Scripts@main/hoots-and-reps/supabase/storage/email-confirmed.html';

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
