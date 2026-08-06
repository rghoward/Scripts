package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tcc extends bec {
    public final /* synthetic */ Context x;
    public final /* synthetic */ Bundle y;
    public final /* synthetic */ mec z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcc(mec mecVar, Context context, Bundle bundle) {
        super(mecVar, true);
        this.x = context;
        this.y = bundle;
        this.z = mecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        Boolean boolValueOf;
        try {
            Context context = this.x;
            a78.g(context);
            String strA = wjc.a(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = wjc.a(context);
            }
            int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
            lbc lbcVarAsInterface = null;
            if (identifier == 0) {
                boolValueOf = null;
            } else {
                try {
                    boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                } catch (Resources.NotFoundException unused) {
                    boolValueOf = null;
                }
            }
            mec mecVar = this.z;
            boolean z = boolValueOf == null || !boolValueOf.booleanValue();
            mecVar.getClass();
            try {
                lbcVarAsInterface = kbc.asInterface(DynamiteModule.c(context, z ? DynamiteModule.c : DynamiteModule.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.a e) {
                mecVar.d(e, true, false);
            }
            mecVar.f = lbcVarAsInterface;
            if (mecVar.f == null) {
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            int iD = DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false);
            int iMax = Math.max(iA, iD);
            boolean z2 = Boolean.TRUE.equals(boolValueOf) || iD < iA;
            long j = iMax;
            mecVar.g = j;
            jcc jccVar = new jcc(161000L, j, z2, this.y, wjc.a(context));
            boolean z3 = mecVar.g >= 169;
            lbc lbcVar = mecVar.f;
            if (z3) {
                a78.g(lbcVar);
                lbcVar.initializeWithElapsedTime(new se7(context), jccVar, this.t, this.u);
            } else {
                a78.g(lbcVar);
                lbcVar.initialize(new se7(context), jccVar, this.t);
            }
        } catch (Exception e2) {
            this.z.d(e2, true, false);
        }
    }
}
