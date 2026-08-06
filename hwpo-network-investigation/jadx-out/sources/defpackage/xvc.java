package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.intercom.twig.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xvc extends fyc {
    public final HashMap d;
    public final tic e;
    public final tic f;
    public final tic g;
    public final tic h;
    public final tic i;
    public final tic j;

    public xvc(lzc lzcVar) {
        super(lzcVar);
        this.d = new HashMap();
        zic zicVar = this.a.e;
        tkc.k(zicVar);
        this.e = new tic(zicVar, "last_delete_stale", 0L);
        zic zicVar2 = this.a.e;
        tkc.k(zicVar2);
        this.f = new tic(zicVar2, "last_delete_stale_batch", 0L);
        zic zicVar3 = this.a.e;
        tkc.k(zicVar3);
        this.g = new tic(zicVar3, "backoff", 0L);
        zic zicVar4 = this.a.e;
        tkc.k(zicVar4);
        this.h = new tic(zicVar4, "last_upload", 0L);
        zic zicVar5 = this.a.e;
        tkc.k(zicVar5);
        this.i = new tic(zicVar5, "last_upload_attempt", 0L);
        zic zicVar6 = this.a.e;
        tkc.k(zicVar6);
        this.j = new tic(zicVar6, "midnight_offset", 0L);
    }

    public final Pair k(q1d q1dVar, nnc nncVar) {
        String str = q1dVar.t;
        a78.d(str);
        return (nncVar.i(lnc.AD_STORAGE) && q1dVar.G) ? l(str) : new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    @Deprecated
    public final Pair l(String str) {
        be.a aVarA;
        vvc vvcVar;
        g();
        tkc tkcVar = this.a;
        mq2 mq2Var = tkcVar.k;
        t7c t7cVar = tkcVar.d;
        mq2Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.d;
        vvc vvcVar2 = (vvc) map.get(str);
        if (vvcVar2 != null && jElapsedRealtime < vvcVar2.c) {
            return new Pair(vvcVar2.a, Boolean.valueOf(vvcVar2.b));
        }
        long jO = t7cVar.o(str, wfc.b) + jElapsedRealtime;
        try {
            try {
                aVarA = be.a(tkcVar.a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (vvcVar2 != null && jElapsedRealtime < vvcVar2.c + t7cVar.o(str, wfc.c)) {
                    return new Pair(vvcVar2.a, Boolean.valueOf(vvcVar2.b));
                }
                aVarA = null;
            }
            if (aVarA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = aVarA.a;
            vvcVar = str2 != null ? new vvc(jO, str2, aVarA.b) : new vvc(jO, BuildConfig.FLAVOR, aVarA.b);
            map.put(str, vvcVar);
            return new Pair(vvcVar.a, Boolean.valueOf(vvcVar.b));
        } catch (Exception e) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.m.b(e, "Unable to get advertising id");
            vvcVar = new vvc(jO, BuildConfig.FLAVOR, false);
        }
    }

    public final String m(q1d q1dVar, nnc nncVar) {
        String str = q1dVar.t;
        a78.d(str);
        if (!nncVar.i(lnc.AD_STORAGE) || !q1dVar.G) {
            return BuildConfig.FLAVOR;
        }
        g();
        String str2 = (String) l(str).first;
        MessageDigest messageDigestZ = yzc.z();
        if (messageDigestZ == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZ.digest(str2.getBytes())));
    }

    @Override // defpackage.fyc
    public final void j() {
    }
}
