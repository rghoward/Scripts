package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s7 implements jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ s7 u = new s7();

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:15:0x0050
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static final defpackage.pw9 b(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7.b(java.lang.String):pw9");
    }

    public static s78 c(String str, un8 un8Var, oh4 oh4Var, int i) {
        if ((i & 2) != 0) {
            un8Var = null;
        }
        if ((i & 4) != 0) {
            oh4Var = new q78(0);
        }
        et2 et2Var = i23.a;
        wr2 wr2Var = wr2.v;
        k5a k5aVarB = od3.b();
        wr2Var.getClass();
        return new s78(str, un8Var, oh4Var, u72.a(h72.a.C0100a.c(wr2Var, k5aVarB)));
    }

    public static String d(Context context, String str) {
        a78.g(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = wjc.a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String e(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return u4c.u.get().h();
    }
}
