package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w4c implements v4c {
    public static final xza a = new xza(t4c.c, 81);

    @Override // defpackage.v4c
    public final long A() {
        return ((Long) a.b(33, 10000L, "measurement.upload.realtime_upload_interval").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long B() {
        return ((Long) a.b(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long C() {
        return ((Long) a.b(18, 1L, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long D() {
        return ((Long) a.b(63, 43200000L, "measurement.upload.backoff_period").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String E() {
        return (String) a.c(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
    }

    @Override // defpackage.v4c
    public final long F() {
        return ((Long) a.b(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long G() {
        return ((Long) a.b(41, 1800000L, "measurement.sgtm.batch.retry_interval").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long H() {
        return ((Long) a.b(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String I() {
        return (String) a.c(60, "measurement.rb.attribution.uri_scheme", "https").get();
    }

    @Override // defpackage.v4c
    public final long J() {
        return ((Long) a.b(77, 1800000L, "measurement.upload.retry_time").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long K() {
        return ((Long) a.b(30, 3000L, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long L() {
        return ((Long) a.b(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long M() {
        return ((Long) a.b(15, 605000L, "measurement.upload.google_signal_max_queue_time").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long N() {
        return ((Long) a.b(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long O() {
        return ((Long) a.b(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue();
    }

    @Override // defpackage.v4c
    public final boolean P() {
        return ((Boolean) a.a(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get()).booleanValue();
    }

    @Override // defpackage.v4c
    public final long Q() {
        return ((Long) a.b(51, 600000L, "measurement.sgtm.upload.retry_interval").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long R() {
        return ((Long) a.b(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long S() {
        return ((Long) a.b(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String T() {
        return (String) a.c(78, "measurement.upload.url", "https://app-measurement.com/a").get();
    }

    @Override // defpackage.v4c
    public final long U() {
        return ((Long) a.b(67, 100L, "measurement.upload.max_bundles").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long V() {
        return ((Long) a.b(38, 1000L, "measurement.service_client.reconnect_millis").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String W() {
        return (String) a.c(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
    }

    @Override // defpackage.v4c
    public final long X() {
        return ((Long) a.b(75, 65536L, "measurement.upload.max_batch_size").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long Y() {
        return ((Long) a.b(28, 500L, "measurement.upload.minimum_delay").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long Z() {
        return ((Long) a.b(21, 50L, "measurement.experiment.max_ids").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long a() {
        return ((Long) a.b(0, 10000L, "measurement.ad_id_cache_time").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long a0() {
        return ((Long) a.b(48, 600000L, "measurement.sgtm.upload.min_delay_after_background").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long b() {
        return ((Long) a.b(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long b0() {
        return ((Long) a.b(68, 10000L, "measurement.upload.max_conversions_per_day").get()).longValue();
    }

    @Override // defpackage.v4c
    public final boolean c() {
        return ((Boolean) a.a(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get()).booleanValue();
    }

    @Override // defpackage.v4c
    public final String c0() {
        return (String) a.c(13, "measurement.rb.attribution.event_params", "value|currency").get();
    }

    @Override // defpackage.v4c
    public final long d() {
        return ((Long) a.b(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long d0() {
        return ((Long) a.b(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String e() {
        return (String) a.c(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
    }

    @Override // defpackage.v4c
    public final long e0() {
        return ((Long) a.b(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long f() {
        return ((Long) a.b(5, 86400000L, "measurement.config.cache_time").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String f0() {
        return (String) a.c(59, "measurement.rb.attribution.query_parameters_to_remove", BuildConfig.FLAVOR).get();
    }

    @Override // defpackage.v4c
    public final String g() {
        return (String) a.c(8, "measurement.config.url_scheme", "https").get();
    }

    @Override // defpackage.v4c
    public final long g0() {
        return ((Long) a.b(76, 6L, "measurement.upload.retry_count").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String h() {
        return (String) a.c(7, "measurement.config.url_authority", "app-measurement.com").get();
    }

    @Override // defpackage.v4c
    public final long h0() {
        return ((Long) a.b(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long i() {
        return ((Long) a.b(12, 3600000L, "measurement.session.engagement_interval").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long i0() {
        return ((Long) a.b(29, 86400000L, "measurement.monitoring.sample_period_millis").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long j() {
        return ((Long) a.b(9, 1000L, "measurement.upload.debug_upload_interval").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long j0() {
        return ((Long) a.b(65, 3600000L, "measurement.upload.interval").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String k() {
        return (String) a.c(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
    }

    @Override // defpackage.v4c
    public final String k0() {
        return (String) a.c(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
    }

    @Override // defpackage.v4c
    public final boolean l() {
        return ((Boolean) a.a(10, "measurement.config.default_flag_values", true).get()).booleanValue();
    }

    @Override // defpackage.v4c
    public final String l0() {
        return (String) a.c(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
    }

    @Override // defpackage.v4c
    public final long m() {
        return ((Long) a.b(11, 3600000L, "45769094").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long m0() {
        return ((Long) a.b(73, 518400000L, "measurement.upload.max_queue_time").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long n() {
        return ((Long) a.b(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long n0() {
        return ((Long) a.b(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long o() {
        return ((Long) a.b(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long o0() {
        return ((Long) a.b(54, 16L, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String p() {
        return (String) a.c(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
    }

    @Override // defpackage.v4c
    public final long p0() {
        return ((Long) a.b(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long q() {
        return ((Long) a.b(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long q0() {
        return ((Long) a.b(46, 5L, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String r() {
        return (String) a.c(32, "measurement.rb.attribution.app_allowlist", BuildConfig.FLAVOR).get();
    }

    @Override // defpackage.v4c
    public final long r0() {
        return ((Long) a.b(64, 15000L, "measurement.upload.initial_upload_delay_time").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long s() {
        return ((Long) a.b(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long s0() {
        return ((Long) a.b(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long t() {
        return ((Long) a.b(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long t0() {
        return ((Long) a.b(36, 5000L, "measurement.service_client.idle_disconnect_millis").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long u() {
        return ((Long) a.b(62, 7200000L, "measurement.redaction.app_instance_id.ttl").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long u0() {
        return ((Long) a.b(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long v() {
        return ((Long) a.b(79, 3600000L, "measurement.upload.window_interval").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long v0() {
        return ((Long) a.b(57, 864000000L, "measurement.rb.attribution.max_queue_time").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long w() {
        return ((Long) a.b(17, 4L, "measurement.lifetimevalue.max_currency_tracked").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long w0() {
        return ((Long) a.b(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue();
    }

    @Override // defpackage.v4c
    public final String x() {
        return (String) a.c(44, "measurement.sgtm.service_upload_apps_list", BuildConfig.FLAVOR).get();
    }

    @Override // defpackage.v4c
    public final long x0() {
        return ((Long) a.b(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long y() {
        return ((Long) a.b(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long y0() {
        return ((Long) a.b(27, 60000L, "measurement.alarm_manager.minimum_interval").get()).longValue();
    }

    @Override // defpackage.v4c
    public final long z() {
        return ((Long) a.b(72, 50000L, "measurement.upload.max_public_events_per_day").get()).longValue();
    }
}
