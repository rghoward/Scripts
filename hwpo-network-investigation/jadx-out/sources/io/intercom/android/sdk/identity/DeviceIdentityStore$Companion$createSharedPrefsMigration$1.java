package io.intercom.android.sdk.identity;

import android.content.Context;
import android.content.SharedPreferences;
import com.intercom.twig.BuildConfig;
import defpackage.fi2;
import defpackage.g2b;
import defpackage.o7a;
import defpackage.r02;
import defpackage.ss5;
import defpackage.t78;
import defpackage.x27;
import defpackage.ze2;
import io.intercom.android.sdk.utilities.CryptoHelper;
import io.intercom.android.sdk.utilities.PreferenceKeys;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeviceIdentityStore$Companion$createSharedPrefsMigration$1 implements ze2<t78> {
    private final ss5 legacyPrefs$delegate;

    public DeviceIdentityStore$Companion$createSharedPrefsMigration$1(Context context) {
        this.legacyPrefs$delegate = new o7a(new fi2(1, context));
    }

    private final SharedPreferences getLegacyPrefs() {
        return (SharedPreferences) this.legacyPrefs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences legacyPrefs_delegate$lambda$0(Context context) {
        return context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
    }

    @Override // defpackage.ze2
    public Object cleanUp(r02<? super g2b> r02Var) {
        getLegacyPrefs().edit().remove("device_identifier").apply();
        return g2b.a;
    }

    @Override // defpackage.ze2
    public Object migrate(t78 t78Var, r02<? super t78> r02Var) {
        x27 x27VarC = t78Var.c();
        SharedPreferences legacyPrefs = getLegacyPrefs();
        String str = BuildConfig.FLAVOR;
        String string = legacyPrefs.getString("device_identifier", BuildConfig.FLAVOR);
        if (string != null) {
            str = string;
        }
        if (str.length() > 0) {
            x27VarC.g(DeviceIdentityStore.Companion.getKEY_DEVICE_IDENTIFIER$intercom_sdk_base_release(), CryptoHelper.INSTANCE.encrypt$intercom_sdk_base_release(str));
        }
        return x27VarC.d();
    }

    /* JADX INFO: renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(t78 t78Var, r02<? super Boolean> r02Var) {
        return t78Var.b(DeviceIdentityStore.Companion.getKEY_DEVICE_IDENTIFIER$intercom_sdk_base_release()) != null ? Boolean.FALSE : Boolean.valueOf(getLegacyPrefs().contains("device_identifier"));
    }

    @Override // defpackage.ze2
    public /* bridge */ /* synthetic */ Object shouldMigrate(t78 t78Var, r02 r02Var) {
        return shouldMigrate2(t78Var, (r02<? super Boolean>) r02Var);
    }
}
