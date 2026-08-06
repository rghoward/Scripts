package defpackage;

import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d6d implements i7d {
    public final d6d t;
    public final UUID u;
    public final String v;
    public final String w;
    public Thread x;

    public d6d(String str, d6d d6dVar, h7d h7dVar) {
        this.w = str;
        this.t = d6dVar;
        this.u = d6dVar.u;
        this.v = d6dVar.v;
        this.x = Thread.currentThread();
    }

    public static String h(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.i7d
    public final Thread a() {
        return this.x;
    }

    @Override // defpackage.i7d
    public final i7d b() {
        return this.t;
    }

    @Override // defpackage.i7d
    public final UUID c() {
        return this.u;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        h7d h7dVarC = m6d.c();
        i7d i7dVar = h7dVarC.b;
        String str = this.w;
        if (i7dVar == null) {
            throw new j6d(w27.a(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == i7dVar) {
            m6d.b(h7dVarC, i7dVar.b());
            this.x = null;
            return;
        }
        String strE = i7dVar.e();
        StringBuilder sb = new StringBuilder(str.length() + 79 + String.valueOf(strE).length() + 1);
        ux1.b(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", strE);
        sb.append(".");
        throw new k6d(sb.toString());
    }

    @Override // defpackage.i7d
    public final String d() {
        return this.v;
    }

    @Override // defpackage.i7d
    public final String e() {
        return this.w;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0208  */
    public final String toString() {
        int i;
        int i2;
        f7d f7dVar;
        Iterator it;
        d7d d7dVar;
        int i3;
        e7d e7dVar;
        AtomicReference atomicReference = m6d.a;
        i7d i7dVarB = this;
        int i4 = 0;
        int length = 0;
        while (i7dVarB != null) {
            i4++;
            length += i7dVarB.e().length();
            i7dVarB = i7dVarB.b();
            if (i7dVarB != null) {
                length += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            i7d i7dVarB2 = this;
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                strArr[i5] = i7dVarB2.e();
                i7dVarB2 = i7dVarB2.b();
            }
            m95.a aVarA = m95.a();
            int i6 = 1;
            w2b it2 = (i4 != 0 ? i4 != 1 ? q95.o(i4, (Object[]) strArr.clone()) : new xq9(strArr[0]) : wl8.C).iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                aVarA.b(it2.next(), Integer.valueOf(i7));
                i7++;
            }
            vl8 vl8VarA = aVarA.a(true);
            int i8 = i4 >> 2;
            if (vl8VarA.y > i8) {
                f7dVar = null;
            } else {
                int i9 = i4 + 1;
                int[] iArr = new int[i9];
                for (int i10 = 0; i10 < i4; i10++) {
                    iArr[i10] = ((Integer) vl8VarA.get(strArr[i10])).intValue();
                }
                iArr[i4] = vl8VarA.y;
                g7d g7dVar = new g7d(iArr);
                int i11 = 0;
                while (true) {
                    int i12 = -1;
                    if (i11 >= i9) {
                        break;
                    }
                    g7dVar.f += i6;
                    int i13 = iArr[i11];
                    while (true) {
                        e7d e7dVar2 = null;
                        while (true) {
                            if (g7dVar.f <= 0) {
                                i3 = i6;
                                break;
                            }
                            int i14 = g7dVar.e;
                            e7dVar = g7dVar.c;
                            i3 = i6;
                            if (i14 == 0) {
                                break;
                            }
                            int i15 = ((e7d) e7dVar.d.get(Integer.valueOf(iArr[g7dVar.d]))).a;
                            int i16 = g7dVar.e;
                            if (iArr[i15 + i16] == i13) {
                                if (e7dVar2 != null) {
                                    e7dVar2.c = g7dVar.c;
                                }
                                g7dVar.e = i16 + 1;
                                g7dVar.a();
                                break;
                            }
                            e7d e7dVar3 = (e7d) g7dVar.c.d.get(Integer.valueOf(iArr[g7dVar.d]));
                            int i17 = e7dVar3.a;
                            int i18 = i12;
                            e7d e7dVar4 = new e7d(i17, (g7dVar.e + i17) - 1);
                            g7dVar.c.d.put(Integer.valueOf(iArr[g7dVar.d]), e7dVar4);
                            int i19 = e7dVar4.b + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i19]);
                            HashMap map = e7dVar4.d;
                            map.put(numValueOf, e7dVar3);
                            e7dVar3.a = i19;
                            if (e7dVar2 != null) {
                                e7dVar2.c = e7dVar4;
                            }
                            map.put(Integer.valueOf(i13), new e7d(i11, 1073741824));
                            g7dVar.f--;
                            g7dVar.b();
                            e7dVar2 = e7dVar4;
                            i6 = i3;
                            i12 = i18;
                        }
                        HashMap map2 = e7dVar.d;
                        Integer numValueOf2 = Integer.valueOf(i13);
                        if (map2.containsKey(numValueOf2)) {
                            if (e7dVar2 != null) {
                                e7dVar2.c = g7dVar.c;
                            }
                            g7dVar.d = i11;
                            g7dVar.e++;
                            g7dVar.a();
                            break;
                        }
                        g7dVar.c.d.put(numValueOf2, new e7d(i11, 1073741824));
                        if (e7dVar2 != null) {
                            e7dVar2.c = g7dVar.c;
                        }
                        g7dVar.f += i12;
                        g7dVar.b();
                        i6 = i3;
                    }
                    i11++;
                    i6 = i3;
                }
                int i20 = i6;
                ArrayDeque arrayDeque = new ArrayDeque();
                e7d e7dVar5 = g7dVar.b;
                d7d d7dVar2 = new d7d(e7dVar5, 0, -1, -1);
                arrayDeque.push(d7dVar2);
                while (!arrayDeque.isEmpty()) {
                    d7d d7dVar3 = (d7d) arrayDeque.pop();
                    Iterator it3 = d7dVar3.d.d.values().iterator();
                    while (it3.hasNext()) {
                        e7d e7dVar6 = (e7d) it3.next();
                        int i21 = d7dVar3.b;
                        int i22 = d7dVar3.c;
                        int i23 = e7dVar6.a;
                        e7d e7dVar7 = e7dVar5;
                        int i24 = e7dVar6.b;
                        if (g7dVar.d(i21, i22, i23, i24)) {
                            it = it3;
                        } else {
                            if (e7dVar6.d.isEmpty()) {
                                int i25 = e7dVar6.a;
                                it = it3;
                                if (g7dVar.d(i21, i22, i25, (i25 + i22) - i21)) {
                                }
                                if (d7dVar2.a < d7dVar.a) {
                                    d7dVar2 = d7dVar;
                                }
                                arrayDeque.push(d7dVar);
                                e7dVar5 = e7dVar7;
                                it3 = it;
                                i20 = 1;
                            } else {
                                it = it3;
                            }
                            d7dVar = new d7d(e7dVar6, i20, e7dVar6.a, i24);
                            if (d7dVar2.a < d7dVar.a) {
                                d7dVar2 = d7dVar;
                            }
                            arrayDeque.push(d7dVar);
                            e7dVar5 = e7dVar7;
                            it3 = it;
                            i20 = 1;
                        }
                        d7dVar = new d7d(e7dVar6, d7dVar3.a + i20, i21, i22);
                        if (d7dVar2.a < d7dVar.a) {
                            d7dVar2 = d7dVar;
                        }
                        arrayDeque.push(d7dVar);
                        e7dVar5 = e7dVar7;
                        it3 = it;
                        i20 = 1;
                    }
                    i20 = 1;
                }
                int iMin = Math.min(iArr.length, d7dVar2.c + 1);
                int i26 = 0;
                loop9: while (true) {
                    i = d7dVar2.b;
                    i2 = iMin - i;
                    e7dVar5 = (e7d) e7dVar5.d.get(Integer.valueOf(iArr[(i26 % i2) + i]));
                    if (e7dVar5 == null) {
                        break;
                    }
                    for (int i27 = e7dVar5.a; i27 < e7dVar5.b + 1 && i27 < iArr.length; i27++) {
                        if (iArr[(i26 % i2) + i] != iArr[i27]) {
                            break loop9;
                        }
                        i26++;
                    }
                }
                int i28 = i26 / i2;
                f7d f7dVar2 = new f7d(i, iMin, i28);
                if (i2 * i28 < i8) {
                    f7dVar = null;
                } else {
                    f7dVar = f7dVar2;
                }
            }
            String strConcat = BuildConfig.FLAVOR;
            if (f7dVar != null) {
                int i29 = f7dVar.a;
                String strConcat2 = i29 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i29))).concat(" -> ") : BuildConfig.FLAVOR;
                int i30 = f7dVar.b;
                int i31 = f7dVar.c;
                int i32 = ((i30 - i29) * i31) + i29;
                if (i32 < i4) {
                    strConcat = " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i32, i4))));
                }
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i29, i30));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i31 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        i7d i7dVarB3 = this;
        while (i7dVarB3 != null) {
            String strE = i7dVarB3.e();
            length -= strE.length();
            strE.getChars(0, strE.length(), cArr, length);
            i7dVarB3 = i7dVarB3.b();
            if (i7dVarB3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    public d6d(String str, UUID uuid, String str2, h7d h7dVar) {
        this.w = str;
        this.t = null;
        this.u = uuid;
        this.v = str2;
        h7dVar.getClass();
        this.x = Thread.currentThread();
    }
}
