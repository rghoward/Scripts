package io.intercom.android.sdk.m5.conversation.utils.audio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bl7;
import defpackage.c9;
import defpackage.eh6;
import defpackage.g2b;
import defpackage.h37;
import defpackage.hf8;
import defpackage.ia;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.nr1;
import defpackage.oh4;
import defpackage.t9;
import defpackage.u;
import defpackage.u30;
import defpackage.vz1;
import defpackage.xj5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioPermissionHandlerKt;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;
import io.intercom.android.sdk.utilities.Phrase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioPermissionHandlerKt {
    public static final PermissionResult checkAudioPermissionStatus(Context context, Activity activity) {
        context.getClass();
        if (!hasRecordAudioPermissionInManifest(context)) {
            return PermissionResult.NotRequired.INSTANCE;
        }
        int iA = vz1.a(context, "android.permission.RECORD_AUDIO");
        if (iA != -1) {
            return iA != 0 ? PermissionResult.Denied.INSTANCE : PermissionResult.Granted.INSTANCE;
        }
        return shouldShowRequestPermissionRationale(activity) ? PermissionResult.PermanentlyDenied.INSTANCE : PermissionResult.Denied.INSTANCE;
    }

    public static final boolean hasRecordAudioPermissionInManifest(Context context) {
        context.getClass();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                return u30.t("android.permission.RECORD_AUDIO", strArr);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static final mh4<g2b> rememberAudioPermissionHandler(final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, jt1 jt1Var, int i) {
        mh4Var.getClass();
        mh4Var2.getClass();
        jt1Var.K(2051621013);
        hf8 hf8Var = AndroidCompositionLocals_androidKt.b;
        final Context context = (Context) jt1Var.F(hf8Var);
        Object objF = jt1Var.F(hf8Var);
        final Activity activity = objF instanceof Activity ? (Activity) objF : null;
        jt1Var.K(826581858);
        Object objF2 = jt1Var.f();
        Object obj = jt1.a.a;
        if (objF2 == obj) {
            objF2 = bl7.i(Boolean.FALSE);
            jt1Var.C(objF2);
        }
        final h37 h37Var = (h37) objF2;
        jt1Var.B();
        t9 t9Var = new t9();
        jt1Var.K(826587403);
        boolean z = true;
        int i2 = (i & 112) ^ 48;
        boolean z2 = ((((i & 14) ^ 6) > 4 && jt1Var.J(mh4Var)) || (i & 6) == 4) | ((i2 > 32 && jt1Var.J(mh4Var2)) || (i & 48) == 32);
        Object objF3 = jt1Var.f();
        if (z2 || objF3 == obj) {
            objF3 = new oh4() { // from class: n80
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    return AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$4$lambda$3(mh4Var, mh4Var2, ((Boolean) obj2).booleanValue());
                }
            };
            jt1Var.C(objF3);
        }
        jt1Var.B();
        final eh6 eh6VarF = ia.f(t9Var, (oh4) objF3, jt1Var);
        jt1Var.K(826595565);
        Object objF4 = jt1Var.f();
        if (objF4 == obj) {
            Object obj2 = new mh4() { // from class: o80
                @Override // defpackage.mh4
                public final Object invoke() {
                    return AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$6$lambda$5(context, activity, mh4Var, eh6VarF, h37Var);
                }
            };
            jt1Var.C(obj2);
            objF4 = obj2;
        }
        mh4<g2b> mh4Var3 = (mh4) objF4;
        jt1Var.B();
        if (rememberAudioPermissionHandler$lambda$1(h37Var)) {
            String string = Phrase.from(context, R.string.intercom_need_microphone_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
            String strF = nr1.f(jt1Var, R.string.intercom_settings);
            String strF2 = nr1.f(jt1Var, R.string.intercom_not_now);
            Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_microphone);
            jt1Var.K(826635487);
            if ((i2 <= 32 || !jt1Var.J(mh4Var2)) && (i & 48) != 32) {
                z = false;
            }
            Object objF5 = jt1Var.f();
            if (z || objF5 == obj) {
                objF5 = new mh4() { // from class: p80
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$8$lambda$7(mh4Var2, h37Var);
                    }
                };
                jt1Var.C(objF5);
            }
            mh4 mh4Var4 = (mh4) objF5;
            jt1Var.B();
            jt1Var.K(826639536);
            boolean zJ = jt1Var.j(context);
            Object objF6 = jt1Var.f();
            if (zJ || objF6 == obj) {
                objF6 = new mh4() { // from class: q80
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$10$lambda$9(context, h37Var);
                    }
                };
                jt1Var.C(objF6);
            }
            jt1Var.B();
            PermissionDeniedDialogKt.PermissionDeniedDialog(null, string, strF, strF2, numValueOf, mh4Var4, (mh4) objF6, jt1Var, 0, 1);
        }
        jt1Var.B();
        return mh4Var3;
    }

    private static final boolean rememberAudioPermissionHandler$lambda$1(h37<Boolean> h37Var) {
        return h37Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b rememberAudioPermissionHandler$lambda$10$lambda$9(Context context, h37 h37Var) {
        rememberAudioPermissionHandler$lambda$2(h37Var, false);
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null)));
        return g2b.a;
    }

    private static final void rememberAudioPermissionHandler$lambda$2(h37<Boolean> h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b rememberAudioPermissionHandler$lambda$4$lambda$3(mh4 mh4Var, mh4 mh4Var2, boolean z) {
        if (z) {
            mh4Var.invoke();
        } else {
            mh4Var2.invoke();
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b rememberAudioPermissionHandler$lambda$6$lambda$5(Context context, Activity activity, mh4 mh4Var, eh6 eh6Var, h37 h37Var) {
        PermissionResult permissionResultCheckAudioPermissionStatus = checkAudioPermissionStatus(context, activity);
        if (xj5.a(permissionResultCheckAudioPermissionStatus, PermissionResult.Granted.INSTANCE) || xj5.a(permissionResultCheckAudioPermissionStatus, PermissionResult.NotRequired.INSTANCE)) {
            mh4Var.invoke();
        } else if (xj5.a(permissionResultCheckAudioPermissionStatus, PermissionResult.Denied.INSTANCE)) {
            eh6Var.a("android.permission.RECORD_AUDIO");
        } else {
            if (!xj5.a(permissionResultCheckAudioPermissionStatus, PermissionResult.PermanentlyDenied.INSTANCE)) {
                u.b();
                return null;
            }
            rememberAudioPermissionHandler$lambda$2(h37Var, true);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b rememberAudioPermissionHandler$lambda$8$lambda$7(mh4 mh4Var, h37 h37Var) {
        rememberAudioPermissionHandler$lambda$2(h37Var, false);
        mh4Var.invoke();
        return g2b.a;
    }

    public static final boolean shouldShowRequestPermissionRationale(Activity activity) {
        if (activity != null) {
            return c9.f(activity, "android.permission.RECORD_AUDIO");
        }
        return false;
    }
}
