package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zic extends cnc {
    public static final Pair z = new Pair(BuildConfig.FLAVOR, 0L);
    public SharedPreferences c;
    public SharedPreferences d;
    public vic e;
    public final tic f;
    public final xic g;
    public String h;
    public boolean i;
    public long j;
    public final tic k;
    public final pic l;
    public final xic m;
    public final ric n;
    public final pic o;
    public final tic p;
    public final tic q;
    public boolean r;
    public final pic s;
    public final pic t;
    public final tic u;
    public final xic v;
    public final xic w;
    public final tic x;
    public final ric y;

    public zic(tkc tkcVar) {
        super(tkcVar);
        this.k = new tic(this, "session_timeout", 1800000L);
        this.l = new pic(this, "start_new_session", true);
        this.p = new tic(this, "last_pause_time", 0L);
        this.q = new tic(this, "session_id", 0L);
        this.m = new xic(this, "non_personalized_ads");
        this.n = new ric(this, "last_received_uri_timestamps_by_source");
        this.o = new pic(this, "allow_remote_dynamite", false);
        this.f = new tic(this, "first_open_time", 0L);
        a78.d("app_install_time");
        this.g = new xic(this, "app_instance_id");
        this.s = new pic(this, "app_backgrounded", false);
        this.t = new pic(this, "deep_link_retrieval_complete", false);
        this.u = new tic(this, "deep_link_retrieval_attempts", 0L);
        this.v = new xic(this, "firebase_feature_rollouts");
        this.w = new xic(this, "deferred_attribution_cache");
        this.x = new tic(this, "deferred_attribution_cache_timestamp", 0L);
        this.y = new ric(this, "default_event_parameters");
    }

    @Override // defpackage.cnc
    public final boolean h() {
        return true;
    }

    public final SharedPreferences k() {
        g();
        i();
        a78.g(this.c);
        return this.c;
    }

    public final SharedPreferences l() {
        g();
        i();
        if (this.d == null) {
            tkc tkcVar = this.a;
            String strValueOf = String.valueOf(tkcVar.a.getPackageName());
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            phc phcVar = thcVar.n;
            String strConcat = strValueOf.concat("_preferences");
            phcVar.b(strConcat, "Default prefs file");
            this.d = tkcVar.a.getSharedPreferences(strConcat, 0);
        }
        return this.d;
    }

    public final SparseArray m() {
        Bundle bundleA = this.n.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.f.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final nnc n() {
        g();
        return nnc.c(k().getInt("consent_source", 100), k().getString("consent_settings", "G1"));
    }

    public final void o(boolean z2) {
        g();
        thc thcVar = this.a.f;
        tkc.m(thcVar);
        thcVar.n.b(Boolean.valueOf(z2), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = k().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z2);
        editorEdit.apply();
    }

    public final boolean p(long j) {
        return j - this.k.a() > this.p.a();
    }
}
