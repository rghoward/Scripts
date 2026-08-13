import 'package:supabase_flutter/supabase_flutter.dart';

/// Build-time Supabase settings. The publishable/anon key identifies the
/// project but is not a secret; authorization is enforced by database RLS.
///
/// Run with:
/// `flutter run --dart-define=SUPABASE_URL=https://PROJECT.supabase.co
///              --dart-define=SUPABASE_PUBLISHABLE_KEY=PROJECT_KEY`
///
/// Keeping this optional lets the existing SQLite-first app work unchanged
/// until a production project is connected.
class SupabaseConfig {
  const SupabaseConfig._();

  static const url = String.fromEnvironment('SUPABASE_URL');
  static const publishableKey = String.fromEnvironment(
    'SUPABASE_PUBLISHABLE_KEY',
  );

  static bool get isConfigured {
    final endpoint = Uri.tryParse(url);
    return endpoint != null &&
        endpoint.hasScheme &&
        endpoint.host.isNotEmpty &&
        publishableKey.isNotEmpty;
  }

  /// Initializes the SDK only when this build was given a project. Returning
  /// false is an expected offline/local-only mode, not an initialization error.
  static Future<bool> initializeIfConfigured() async {
    if (!isConfigured) return false;
    await Supabase.initialize(url: url, publishableKey: publishableKey);
    return true;
  }
}
