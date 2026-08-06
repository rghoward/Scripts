package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mi6 extends msa {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int[] b;
        public final gsa[] c;
        public final int[] d;
        public final int[][][] e;
        public final gsa f;

        public a(int[] iArr, gsa[] gsaVarArr, int[] iArr2, int[][][] iArr3, gsa gsaVar) {
            this.b = iArr;
            this.c = gsaVarArr;
            this.e = iArr3;
            this.d = iArr2;
            this.f = gsaVar;
            this.a = iArr.length;
        }
    }

    @Override // defpackage.msa
    public final void c(Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.msa
    public final nsa e(l[] lVarArr, gsa gsaVar, bq6.b bVar, toa toaVar) {
        final cv2.d dVar;
        final String str;
        long j;
        ul8 ul8VarG;
        ul8 ul8VarV;
        int i;
        int[] iArr;
        int[] iArr2;
        final String languageTag;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pairR;
        final boolean z;
        Context context;
        int[] iArr3;
        gsa gsaVar2 = gsaVar;
        int i2 = 1;
        int[] iArr4 = new int[lVarArr.length + 1];
        int length = lVarArr.length + 1;
        esa[][] esaVarArr = new esa[length][];
        int[][][] iArr5 = new int[lVarArr.length + 1][][];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = gsaVar2.a;
            esaVarArr[i3] = new esa[i4];
            iArr5[i3] = new int[i4][];
        }
        int length2 = lVarArr.length;
        final int[] iArr6 = new int[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            iArr6[i5] = lVarArr[i5].x();
        }
        int i6 = 0;
        while (i6 < gsaVar2.a) {
            esa esaVarA = gsaVar2.a(i6);
            int i7 = esaVarA.c == 5 ? i2 : 0;
            int length3 = lVarArr.length;
            int i8 = i2;
            int i9 = 0;
            int i10 = 0;
            while (i9 < lVarArr.length) {
                l lVar = lVarArr[i9];
                int i11 = i2;
                int iMax = 0;
                for (int i12 = 0; i12 < esaVarA.a; i12++) {
                    iMax = Math.max(iMax, lVar.f(esaVarA.d[i12]) & 7);
                }
                int i13 = iArr4[i9] == 0 ? i11 : 0;
                if (iMax > i10 || (iMax == i10 && i7 != 0 && i8 == 0 && i13 != 0)) {
                    i8 = i13;
                    i10 = iMax;
                    length3 = i9;
                }
                i9++;
                i2 = i11;
            }
            int i14 = i2;
            if (length3 == lVarArr.length) {
                iArr3 = new int[esaVarA.a];
            } else {
                l lVar2 = lVarArr[length3];
                int[] iArr7 = new int[esaVarA.a];
                for (int i15 = 0; i15 < esaVarA.a; i15++) {
                    iArr7[i15] = lVar2.f(esaVarA.d[i15]);
                }
                iArr3 = iArr7;
            }
            int i16 = iArr4[length3];
            esaVarArr[length3][i16] = esaVarA;
            iArr5[length3][i16] = iArr3;
            iArr4[length3] = i16 + 1;
            i6++;
            gsaVar2 = gsaVar;
            i2 = i14;
        }
        int i17 = i2;
        gsa[] gsaVarArr = new gsa[lVarArr.length];
        String[] strArr = new String[lVarArr.length];
        int[] iArr8 = new int[lVarArr.length];
        for (int i18 = 0; i18 < lVarArr.length; i18++) {
            int i19 = iArr4[i18];
            gsaVarArr[i18] = new gsa((esa[]) n6b.P(i19, esaVarArr[i18]));
            iArr5[i18] = (int[][]) n6b.P(i19, iArr5[i18]);
            strArr[i18] = lVarArr[i18].getName();
            iArr8[i18] = ((androidx.media3.exoplayer.a) lVarArr[i18]).u;
        }
        a aVar = new a(iArr8, gsaVarArr, iArr6, iArr5, new gsa((esa[]) n6b.P(iArr4[lVarArr.length], esaVarArr[lVarArr.length])));
        final cv2 cv2Var = (cv2) this;
        synchronized (cv2Var.c) {
            cv2Var.g = Thread.currentThread();
            dVar = cv2Var.f;
        }
        if (cv2Var.j == null && (context = cv2Var.d) != null) {
            cv2Var.j = Boolean.valueOf(n6b.M(context));
        }
        if (dVar.C && Build.VERSION.SDK_INT >= 32 && cv2Var.h == null) {
            cv2Var.h = new ix9(cv2Var.d, new Runnable() { // from class: uu2
                @Override // java.lang.Runnable
                public final void run() {
                    cv2Var.o();
                }
            }, cv2Var.j);
        }
        int i20 = aVar.a;
        fq3.a[] aVarArr = new fq3.a[i20];
        cv2.k(aVar, dVar, aVarArr);
        cv2.i(aVar, dVar, aVarArr);
        cv2.j(aVar, dVar, aVarArr);
        Context context2 = cv2Var.d;
        int i21 = aVar.a;
        Pair<fq3.a, Integer> pairM = cv2.m(aVarArr, i17);
        if (pairM == null) {
            int i22 = 0;
            while (true) {
                if (i22 >= i21) {
                    z = false;
                    break;
                }
                if (2 == iArr8[i22] && gsaVarArr[i22].a > 0) {
                    z = true;
                    break;
                }
                i22++;
            }
            pairM = cv2.r(1, aVar, iArr5, new cv2.g.a() { // from class: yu2
                @Override // cv2.g.a
                public final ul8 b(int i23, esa esaVar, int[] iArr9) {
                    cv2 cv2Var2 = cv2Var;
                    cv2Var2.getClass();
                    cv2.d dVar2 = dVar;
                    tu2 tu2Var = new tu2(cv2Var2, dVar2);
                    int i24 = iArr6[i23];
                    k95.b bVar2 = k95.u;
                    k95.a aVar2 = new k95.a();
                    for (int i25 = 0; i25 < esaVar.a; i25++) {
                        aVar2.c(new cv2.a(i23, esaVar, i25, dVar2, iArr9[i25], z, tu2Var, i24));
                    }
                    return aVar2.g();
                }
            }, new zu2());
            if (pairM != null) {
                aVarArr[((Integer) pairM.second).intValue()] = (fq3.a) pairM.first;
            }
        }
        if (pairM == null) {
            str = null;
        } else {
            fq3.a aVar2 = (fq3.a) pairM.first;
            str = aVar2.a.d[aVar2.b[0]].d;
        }
        Pair<fq3.a, Integer> pairM2 = cv2.m(aVarArr, 2);
        Pair<fq3.a, Integer> pairM3 = cv2.m(aVarArr, 4);
        if (pairM2 == null && pairM3 == null) {
            dVar.q.getClass();
            final Point pointV = (!dVar.g || context2 == null) ? null : n6b.v(context2);
            Pair pairR2 = cv2.r(2, aVar, iArr5, new cv2.g.a() { // from class: wu2
                /* JADX WARN: Code duplicated, block: B:28:0x0048  */
                @Override // cv2.g.a
                public final ul8 b(int i23, esa esaVar, int[] iArr9) {
                    int i24;
                    int i25;
                    int i26;
                    int i27;
                    esa esaVar2 = esaVar;
                    int i28 = iArr6[i23];
                    cv2.d dVar2 = dVar;
                    Point point = pointV;
                    int i29 = point != null ? point.x : dVar2.e;
                    int i30 = point != null ? point.y : dVar2.f;
                    boolean z2 = dVar2.h;
                    if (i29 == Integer.MAX_VALUE || i30 == Integer.MAX_VALUE) {
                        i24 = Integer.MAX_VALUE;
                    } else {
                        int i31 = Integer.MAX_VALUE;
                        for (int i32 = 0; i32 < esaVar2.a; i32++) {
                            id4 id4Var = esaVar2.d[i32];
                            int i33 = id4Var.v;
                            int i34 = id4Var.w;
                            if (i33 > 0 && i34 > 0) {
                                if (!z2) {
                                    i26 = i30;
                                    i27 = i29;
                                } else if ((i33 > i34) != (i29 > i30)) {
                                    i27 = i30;
                                    i26 = i29;
                                } else {
                                    i26 = i30;
                                    i27 = i29;
                                }
                                int i35 = i33 * i26;
                                int i36 = i34 * i27;
                                Point point2 = i35 >= i36 ? new Point(i27, n6b.g(i36, i33)) : new Point(n6b.g(i35, i34), i26);
                                int i37 = id4Var.v;
                                int i38 = i37 * i34;
                                if (i37 >= ((int) (point2.x * 0.98f)) && i34 >= ((int) (point2.y * 0.98f)) && i38 < i31) {
                                    i31 = i38;
                                }
                            }
                        }
                        i24 = i31;
                    }
                    k95.a aVar3 = new k95.a();
                    int i39 = 0;
                    while (i39 < esaVar2.a) {
                        id4 id4Var2 = esaVar2.d[i39];
                        int i40 = id4Var2.v;
                        int i41 = (i40 == -1 || (i25 = id4Var2.w) == -1) ? -1 : i40 * i25;
                        aVar3.c(new cv2.h(i23, esaVar2, i39, dVar2, iArr9[i39], str, i28, i24 == Integer.MAX_VALUE || (i41 != -1 && i41 <= i24)));
                        i39++;
                        esaVar2 = esaVar;
                    }
                    return aVar3.g();
                }
            }, new xu2());
            if (pairR2 == null) {
                dVar.q.getClass();
                pairR = cv2.r(4, aVar, iArr5, new z20(dVar), new vu2());
            } else {
                pairR = null;
            }
            if (pairR != null) {
                aVarArr[((Integer) pairR.second).intValue()] = (fq3.a) pairR.first;
            } else if (pairR2 != null) {
                aVarArr[((Integer) pairR2.second).intValue()] = (fq3.a) pairR2.first;
            }
        }
        if (cv2.m(aVarArr, 3) == null) {
            dVar.q.getClass();
            if (!dVar.t || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = n6b.a;
                languageTag = locale.toLanguageTag();
            }
            Pair pairR3 = cv2.r(3, aVar, iArr5, new cv2.g.a() { // from class: av2
                @Override // cv2.g.a
                public final ul8 b(int i23, esa esaVar, int[] iArr9) {
                    k95.b bVar2 = k95.u;
                    k95.a aVar3 = new k95.a();
                    for (int i24 = 0; i24 < esaVar.a; i24++) {
                        aVar3.c(new cv2.f(i23, esaVar, i24, dVar, iArr9[i24], str, languageTag));
                    }
                    return aVar3.g();
                }
            }, new bv2());
            if (pairR3 != null) {
                aVarArr[((Integer) pairR3.second).intValue()] = (fq3.a) pairR3.first;
            }
        }
        dVar.q.getClass();
        int i23 = q95.v;
        q95.a aVar3 = new q95.a(4);
        int iR = l.r(0, 0, 0, 0);
        int i24 = 0;
        while (i24 < i20) {
            fq3.a aVar4 = aVarArr[i24];
            if (aVar4 != null) {
                esa esaVar = aVar4.a;
                if (dVar.G.get(i24) || dVar.w.contains(Integer.valueOf(esaVar.c))) {
                    iArr2 = iArr8;
                } else {
                    aVar3.a(esaVar.b);
                    int i25 = 0;
                    while (true) {
                        int[] iArr9 = aVar4.b;
                        iArr2 = iArr8;
                        if (i25 < iArr9.length) {
                            String str3 = esaVar.d[iArr9[i25]].m;
                            if (str3 != null) {
                                aVar3.c(str3);
                            }
                            i25++;
                            iArr8 = iArr2;
                        }
                    }
                }
            } else {
                iArr2 = iArr8;
            }
            i24++;
            iArr8 = iArr2;
        }
        int[] iArr10 = iArr8;
        q95 q95VarG = aVar3.g();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i26 = 0;
        while (i26 < i21) {
            if (iArr10[i26] == 5) {
                gsa gsaVar3 = gsaVarArr[i26];
                int i27 = 0;
                while (i27 < gsaVar3.a) {
                    esa esaVarA2 = gsaVar3.a(i27);
                    arrayList.add(esaVarA2);
                    gsa[] gsaVarArr2 = gsaVarArr;
                    int[] iArr11 = (int[]) iArr5[i26][i27].clone();
                    int i28 = i26;
                    int[][][] iArr12 = iArr5;
                    for (int i29 = 0; i29 < iArr11.length; i29++) {
                        String str4 = esaVarA2.d[i29].m;
                        if (str4 != null && !q95VarG.contains(str4)) {
                            iArr11[i29] = iR;
                        }
                    }
                    arrayList2.add(iArr11);
                    i27++;
                    i26 = i28;
                    gsaVarArr = gsaVarArr2;
                    iArr5 = iArr12;
                }
            }
            i26++;
            gsaVarArr = gsaVarArr;
            iArr5 = iArr5;
        }
        gsa[] gsaVarArr3 = gsaVarArr;
        int[][][] iArr13 = iArr5;
        int size = arrayList.size();
        esa[] esaVarArr2 = new esa[size];
        xl7.r(arrayList.size() == size);
        arrayList.toArray(esaVarArr2);
        gsa gsaVar4 = new gsa(esaVarArr2);
        int size2 = arrayList2.size();
        int[][] iArr14 = new int[size2][];
        xl7.r(arrayList2.size() == size2);
        arrayList2.toArray(iArr14);
        for (int i30 = 0; i30 < i21; i30++) {
            if (iArr10[i30] == 5) {
                fq3.a aVarQ = cv2.q(gsaVar4, iArr14, dVar);
                aVarArr[i30] = aVarQ;
                if (aVarQ == null) {
                    break;
                }
                Arrays.fill(iArr14[gsaVar4.b(aVarQ.a)], iR);
            }
        }
        for (int i31 = 0; i31 < i21; i31++) {
            int i32 = iArr10[i31];
            if (i32 != 2 && i32 != 1) {
                if (i32 != 3 && i32 != 4) {
                    if (i32 != 5 && aVarArr[i31] == null) {
                        aVarArr[i31] = cv2.q(gsaVarArr3[i31], iArr13[i31], dVar);
                    }
                }
            }
        }
        cv2.k(aVar, dVar, aVarArr);
        cv2.i(aVar, dVar, aVarArr);
        cv2.j(aVar, dVar, aVarArr);
        ab.b bVar2 = cv2Var.e;
        cj0 cj0Var = cv2Var.b;
        cj0Var.getClass();
        bVar2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (fq3.a aVar5 : aVarArr) {
            if (aVar5 == null || aVar5.b.length <= 1) {
                arrayList3.add(null);
            } else {
                k95.b bVar3 = k95.u;
                k95.a aVar6 = new k95.a();
                aVar6.c(new ab.a(0L, 0L));
                arrayList3.add(aVar6);
            }
        }
        int length4 = aVarArr.length;
        long[][] jArr = new long[length4][];
        int i33 = 0;
        while (true) {
            j = -1;
            if (i33 >= aVarArr.length) {
                break;
            }
            fq3.a aVar7 = aVarArr[i33];
            if (aVar7 == null) {
                jArr[i33] = new long[0];
            } else {
                int[] iArr15 = aVar7.b;
                jArr[i33] = new long[iArr15.length];
                for (int i34 = 0; i34 < iArr15.length; i34++) {
                    long j2 = aVar7.a.d[iArr15[i34]].j;
                    long[] jArr2 = jArr[i33];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i34] = j2;
                }
                Arrays.sort(jArr[i33]);
            }
            i33++;
        }
        int[] iArr16 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i35 = 0; i35 < length4; i35++) {
            long[] jArr4 = jArr[i35];
            jArr3[i35] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        ab.e(arrayList3, jArr3);
        n47 n47Var = n47.t;
        n47Var.getClass();
        zg1.b(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(n47Var);
        k17 k17Var = new k17();
        l17 l17Var = new l17(treeMap);
        l17Var.y = k17Var;
        int i36 = 0;
        loop19: while (true) {
            if (i36 >= length4) {
                int[] iArr17 = iArr16;
                Collection aVar8 = l17Var.u;
                if (aVar8 == null) {
                    aVar8 = new b2.a(l17Var);
                    l17Var.u = aVar8;
                }
                k95 k95VarQ = k95.q(aVar8);
                for (int i37 = 0; i37 < k95VarQ.size(); i37++) {
                    int iIntValue = ((Integer) k95VarQ.get(i37)).intValue();
                    int i38 = iArr17[iIntValue] + 1;
                    iArr17[iIntValue] = i38;
                    jArr3[iIntValue] = jArr[iIntValue][i38];
                    ab.e(arrayList3, jArr3);
                }
                for (int i39 = 0; i39 < aVarArr.length; i39++) {
                    if (arrayList3.get(i39) != null) {
                        jArr3[i39] = jArr3[i39] * 2;
                    }
                }
                ab.e(arrayList3, jArr3);
                k95.a aVar9 = new k95.a();
                for (int i40 = 0; i40 < arrayList3.size(); i40++) {
                    k95.a aVar10 = (k95.a) arrayList3.get(i40);
                    aVar9.c(aVar10 == null ? ul8.x : aVar10.g());
                }
                ul8VarG = aVar9.g();
                break;
            }
            long[] jArr5 = jArr[i36];
            long j3 = j;
            if (jArr5.length <= 1) {
                i = length4;
                iArr = iArr16;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i41 = 0;
                while (true) {
                    long[] jArr6 = jArr[i36];
                    i = length4;
                    double dLog = 0.0d;
                    if (i41 >= jArr6.length) {
                        break;
                    }
                    int[] iArr18 = iArr16;
                    long j4 = jArr6[i41];
                    if (j4 != j3) {
                        dLog = Math.log(j4);
                    }
                    dArr[i41] = dLog;
                    i41++;
                    length4 = i;
                    iArr16 = iArr18;
                }
                iArr = iArr16;
                int i42 = length5 - 1;
                double d = dArr[i42] - dArr[0];
                int i43 = 0;
                while (i43 < i42) {
                    double d2 = dArr[i43];
                    i43++;
                    Object objValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i43]) * 0.5d) - dArr[0]) / d);
                    double d3 = d;
                    Integer numValueOf = Integer.valueOf(i36);
                    Map<K, Collection<V>> map = l17Var.w;
                    int i44 = i36;
                    Collection collection = (Collection) map.get(objValueOf);
                    if (collection == null) {
                        Collection<V> collectionE = l17Var.e();
                        if (!collectionE.add(numValueOf)) {
                            sx0.a("New Collection violated the Collection spec");
                            ul8VarG = null;
                            break loop19;
                        }
                        l17Var.x++;
                        map.put((K) objValueOf, collectionE);
                    } else if (collection.add(numValueOf)) {
                        l17Var.x++;
                    }
                    d = d3;
                    i36 = i44;
                }
            }
            i36++;
            j = j3;
            length4 = i;
            iArr16 = iArr;
        }
        fq3[] fq3VarArr = new fq3[aVarArr.length];
        for (int i45 = 0; i45 < aVarArr.length; i45++) {
            fq3.a aVar11 = aVarArr[i45];
            if (aVar11 != null) {
                int[] iArr19 = aVar11.b;
                if (iArr19.length != 0) {
                    int length6 = iArr19.length;
                    esa esaVar2 = aVar11.a;
                    fq3VarArr[i45] = length6 == 1 ? new n34(esaVar2, new int[]{iArr19[0]}) : new ab(esaVar2, iArr19, cj0Var, (k95) ul8VarG.get(i45));
                }
            }
        }
        mn8[] mn8VarArr = new mn8[i20];
        for (int i46 = 0; i46 < i20; i46++) {
            mn8VarArr[i46] = (dVar.G.get(i46) || dVar.w.contains(Integer.valueOf(aVar.b[i46])) || (aVar.b[i46] != -2 && fq3VarArr[i46] == null)) ? null : mn8.c;
        }
        dVar.q.getClass();
        Pair pairCreate = Pair.create(mn8VarArr, fq3VarArr);
        jsa[] jsaVarArr = (jsa[]) pairCreate.second;
        int length7 = jsaVarArr.length;
        List[] listArr = new List[length7];
        for (int i47 = 0; i47 < jsaVarArr.length; i47++) {
            jsa jsaVar = jsaVarArr[i47];
            if (jsaVar != null) {
                ul8VarV = k95.v(jsaVar);
            } else {
                k95.b bVar4 = k95.u;
                ul8VarV = ul8.x;
            }
            listArr[i47] = ul8VarV;
        }
        k95.a aVar12 = new k95.a();
        int i48 = 0;
        while (true) {
            int i49 = aVar.a;
            gsa[] gsaVarArr4 = aVar.c;
            if (i48 >= i49) {
                break;
            }
            gsa gsaVar5 = gsaVarArr4[i48];
            int i50 = 0;
            while (i50 < gsaVar5.a) {
                esa esaVarA3 = gsaVar5.a(i50);
                int i51 = gsaVarArr4[i48].a(i50).a;
                int[] iArr20 = new int[i51];
                int i52 = 0;
                for (int i53 = 0; i53 < i51; i53++) {
                    if ((aVar.e[i48][i50][i53] & 7) == 4) {
                        iArr20[i52] = i53;
                        i52++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr20, i52);
                int iMin = 16;
                List[] listArr2 = listArr;
                int i54 = 0;
                boolean z2 = false;
                int i55 = 0;
                String str5 = null;
                while (i54 < iArrCopyOf.length) {
                    String str6 = gsaVarArr4[i48].a(i50).d[iArrCopyOf[i54]].o;
                    int i56 = i55 + 1;
                    if (i55 == 0) {
                        str5 = str6;
                    } else {
                        z2 = (!Objects.equals(str5, str6)) | z2;
                    }
                    iMin = Math.min(iMin, aVar.e[i48][i50][i54] & 24);
                    i54++;
                    i55 = i56;
                }
                if (z2) {
                    iMin = Math.min(iMin, aVar.d[i48]);
                }
                boolean z3 = iMin != 0;
                int i57 = esaVarA3.a;
                int[] iArr21 = new int[i57];
                boolean[] zArr = new boolean[i57];
                for (int i58 = 0; i58 < esaVarA3.a; i58++) {
                    iArr21[i58] = aVar.e[i48][i50][i58] & 7;
                    boolean z4 = false;
                    int i59 = 0;
                    while (i59 < length7) {
                        List list = listArr2[i59];
                        int i60 = length7;
                        gsa gsaVar6 = gsaVar5;
                        int i61 = 0;
                        while (i61 < list.size()) {
                            jsa jsaVar2 = (jsa) list.get(i61);
                            int i62 = i61;
                            if (jsaVar2.a().equals(esaVarA3) && jsaVar2.d(i58) != -1) {
                                z4 = true;
                                break;
                            }
                            i61 = i62 + 1;
                        }
                        i59++;
                        gsaVar5 = gsaVar6;
                        length7 = i60;
                    }
                    zArr[i58] = z4;
                }
                aVar12.c(new vua.a(esaVarA3, z3, iArr21, zArr));
                i50++;
                listArr = listArr2;
                length7 = length7;
            }
            i48++;
        }
        gsa gsaVar7 = aVar.f;
        for (int i63 = 0; i63 < gsaVar7.a; i63++) {
            esa esaVarA4 = gsaVar7.a(i63);
            int[] iArr22 = new int[esaVarA4.a];
            Arrays.fill(iArr22, 0);
            aVar12.c(new vua.a(esaVarA4, false, iArr22, new boolean[esaVarA4.a]));
        }
        return new nsa((mn8[]) pairCreate.first, (fq3[]) pairCreate.second, new vua(aVar12.g()), aVar);
    }
}
