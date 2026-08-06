package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nr2 implements yy4 {
    public static final int[] e = {8, 13, 11, 2, 0, 1, 7};
    public z4a.a a;
    public boolean b;
    public int c;
    public final boolean d;

    public nr2(boolean z) {
        this.d = z;
        this.a = new zt2();
    }

    public static void c(int i, ArrayList arrayList) {
        if (ek5.k1(e, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    @Override // defpackage.yy4
    public final xy0 a(Uri uri, id4 id4Var, List list, apa apaVar, Map map, zq2 zq2Var) {
        xy0 xy0Var;
        apa apaVar2;
        int i;
        int i2;
        js3 d3Var;
        boolean z;
        boolean zD;
        int i3;
        List listSingletonList;
        List list2;
        int i4;
        id4 id4Var2 = id4Var;
        int iA = w20.a(id4Var2.o);
        List list3 = (List) map.get("Content-Type");
        int iA2 = w20.a((list3 == null || list3.isEmpty()) ? null : (String) list3.get(0));
        int iB = w20.b(uri);
        int i5 = 7;
        ArrayList arrayList = new ArrayList(7);
        c(iA, arrayList);
        c(iA2, arrayList);
        c(iB, arrayList);
        for (int i6 = 0; i6 < 7; i6++) {
            c(e[i6], arrayList);
        }
        zq2Var.f = 0;
        int i7 = 0;
        js3 js3Var = null;
        while (i7 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i7)).intValue();
            if (iIntValue == 0) {
                apaVar2 = apaVar;
                i = iIntValue;
                i2 = 11;
                d3Var = new d3();
            } else if (iIntValue == 1) {
                apaVar2 = apaVar;
                i = iIntValue;
                i2 = 11;
                d3Var = new h3();
            } else if (iIntValue == 2) {
                apaVar2 = apaVar;
                i = iIntValue;
                i2 = 11;
                d3Var = new zd(0);
            } else if (iIntValue != i5) {
                z4a.a aVar = z4a.a.a;
                if (iIntValue == 8) {
                    apaVar2 = apaVar;
                    i = iIntValue;
                    i2 = 11;
                    z4a.a aVar2 = this.a;
                    boolean z2 = this.b;
                    int i8 = this.c;
                    if (z2) {
                        aVar = aVar2;
                        i3 = 4;
                    } else {
                        i3 = 36;
                    }
                    byte[] bArr = bh4.N;
                    int i9 = (i8 & 1) != 0 ? 64 : 0;
                    if ((i8 & 2) != 0) {
                        i9 |= 128;
                    }
                    d3Var = new bh4(aVar, i3 | i9, apaVar2, list != null ? list : ul8.x);
                } else if (iIntValue == 11) {
                    z4a.a aVar3 = this.a;
                    boolean z3 = this.b;
                    if (list != null) {
                        i4 = 48;
                        list2 = list;
                    } else {
                        if (this.d) {
                            id4.a aVar4 = new id4.a();
                            aVar4.n = fv6.n("application/cea-608");
                            listSingletonList = Collections.singletonList(new id4(aVar4));
                        } else {
                            listSingletonList = Collections.EMPTY_LIST;
                        }
                        list2 = listSingletonList;
                        i4 = 16;
                    }
                    String str = id4Var2.k;
                    if (!TextUtils.isEmpty(str)) {
                        if (fv6.b(str, "audio/mp4a-latm") == null) {
                            i4 |= 2;
                        }
                        if (fv6.b(str, "video/avc") == null) {
                            i4 |= 4;
                        }
                    }
                    if (!z3) {
                        aVar3 = aVar;
                    }
                    int i10 = !z3 ? 1 : 0;
                    fv2 fv2Var = new fv2(i4, list2);
                    i = iIntValue;
                    apaVar2 = apaVar;
                    i2 = 11;
                    d3Var = new oya(2, i10, aVar3, apaVar2, fv2Var);
                } else if (iIntValue != 13) {
                    apaVar2 = apaVar;
                    i = iIntValue;
                    i2 = 11;
                    d3Var = null;
                } else {
                    apaVar2 = apaVar;
                    d3Var = new llb(id4Var2.d, apaVar, this.a, this.b);
                    i = iIntValue;
                    i2 = 11;
                }
            } else {
                apaVar2 = apaVar;
                i = iIntValue;
                i2 = 11;
                d3Var = new pz6(0L);
            }
            d3Var.getClass();
            js3 js3Var2 = d3Var;
            try {
                zD = js3Var2.d(zq2Var);
                z = false;
                zq2Var.f = 0;
            } catch (EOFException unused) {
                z = false;
                zq2Var.f = 0;
                zD = false;
            } catch (Throwable th) {
                zq2Var.f = 0;
                throw th;
            }
            if (zD) {
                xy0Var = new xy0(js3Var2, id4Var, apaVar2, this.a, this.b);
                return xy0Var;
            }
            if (js3Var == null && (i == iA || i == iA2 || i == iB || i == i2)) {
                js3Var = js3Var2;
            }
            i7++;
            id4Var2 = id4Var;
            i5 = 7;
        }
        js3Var.getClass();
        xy0Var = new xy0(js3Var, id4Var, apaVar, this.a, this.b);
        return xy0Var;
    }

    @Override // defpackage.yy4
    public final id4 b(id4 id4Var) {
        if (!this.b || !this.a.f(id4Var)) {
            return id4Var;
        }
        id4.a aVarA = id4Var.a();
        String str = id4Var.k;
        aVarA.n = fv6.n("application/x-media3-cues");
        aVarA.L = this.a.h(id4Var);
        StringBuilder sb = new StringBuilder();
        sb.append(id4Var.o);
        sb.append(str != null ? " ".concat(str) : BuildConfig.FLAVOR);
        aVarA.j = sb.toString();
        aVarA.s = Long.MAX_VALUE;
        return new id4(aVarA);
    }

    public nr2() {
        this(true);
        this.c = 3;
    }
}
