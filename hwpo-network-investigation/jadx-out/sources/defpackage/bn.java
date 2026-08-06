package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bn implements as2, View.OnAttachStateChangeListener {
    public e27 B;
    public long C;
    public final e27<vb9> D;
    public vb9 E;
    public boolean F;
    public final an G;
    public final cm t;
    public final cm.e u;
    public yy1 v;
    public final ArrayList w = new ArrayList();
    public final long x = 100;
    public a y = a.t;
    public boolean z = true;
    public final zx0 A = da1.a(1, 6, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final /* synthetic */ a[] v;

        static {
            a aVar = new a("SHOW_ORIGINAL", 0);
            t = aVar;
            a aVar2 = new a("SHOW_TRANSLATED", 1);
            u = aVar2;
            v = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) v.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static void a(bn bnVar, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            xb9 xb9VarB;
            ub9 ub9Var;
            oh4 oh4Var;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = longSparseArray.keyAt(i);
                ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
                if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (xb9VarB = bnVar.c().b((int) jKeyAt)) != null && (ub9Var = xb9VarB.a) != null) {
                    Object objD = ub9Var.d.t.d(kb9.l);
                    if (objD == null) {
                        objD = null;
                    }
                    k3 k3Var = (k3) objD;
                    if (k3Var != null && (oh4Var = (oh4) k3Var.b) != null) {
                    }
                }
            }
        }

        public static void b(bn bnVar, long[] jArr, Consumer consumer) {
            ub9 ub9Var;
            for (long j : jArr) {
                xb9 xb9VarB = bnVar.c().b((int) j);
                if (xb9VarB != null && (ub9Var = xb9VarB.a) != null) {
                    ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(bnVar.t.getAutofillId(), ub9Var.f);
                    Object objD = ub9Var.d.t.d(ac9.C);
                    if (objD == null) {
                        objD = null;
                    }
                    List list = (List) objD;
                    if (list != null) {
                        builder.setValue("android:text", TranslationRequestValue.forText(new iw(ab6.a(list, "\n", null, 62))));
                        consumer.accept(builder.build());
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements oh4<ub9, Boolean> {
        public static final c u = new c(1);

        @Override // defpackage.oh4
        public final Boolean invoke(ub9 ub9Var) {
            lb9 lb9VarK = ub9Var.k();
            return Boolean.valueOf(lb9VarK.t.b(ac9.B));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements ci4<Integer, ub9, g2b> {
        public final /* synthetic */ vb9 u;
        public final /* synthetic */ bn v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vb9 vb9Var, bn bnVar) {
            super(2);
            this.u = vb9Var;
            this.v = bnVar;
        }

        @Override // defpackage.ci4
        public final g2b invoke(Integer num, ub9 ub9Var) {
            int iIntValue = num.intValue();
            ub9 ub9Var2 = ub9Var;
            if (!this.u.b.c(ub9Var2.f)) {
                bn bnVar = this.v;
                bnVar.i(iIntValue, ub9Var2);
                bnVar.A.n(g2b.a);
            }
            return g2b.a;
        }
    }

    public bn(cm cmVar, cm.e eVar) {
        this.t = cmVar;
        this.u = eVar;
        new Handler(Looper.getMainLooper());
        e27 e27Var = ag5.a;
        e27Var.getClass();
        this.B = e27Var;
        this.D = new e27<>();
        this.E = new vb9(cmVar.getSemanticsOwner().a(), e27Var);
        this.G = new an(0, this);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[PHI: r1
      0x0046: PHI (r1v3 ca1) = (r1v1 ca1), (r1v2 ca1), (r1v5 ca1) binds: [B:16:0x0039, B:30:0x0082, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[PHI: r1 r8
      0x0051: PHI (r1v2 ca1) = (r1v3 ca1), (r1v4 ca1) binds: [B:18:0x004e, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r8v3 java.lang.Object) = (r8v10 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x004e, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.u02 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dn
            if (r0 == 0) goto L13
            r0 = r8
            dn r0 = (defpackage.dn) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dn r0 = new dn
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            ca1 r1 = r0.t
            defpackage.dv8.b(r8)
            goto L46
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            r7 = 0
            return r7
        L33:
            ca1 r1 = r0.t
            defpackage.dv8.b(r8)
            goto L51
        L39:
            defpackage.dv8.b(r8)
            zx0 r8 = r7.A
            r8.getClass()
            zx0$a r1 = new zx0$a
            r1.<init>()
        L46:
            r0.t = r1
            r0.w = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L51
            goto L84
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L85
            r1.next()
            boolean r8 = r7.d()
            if (r8 == 0) goto L65
            r7.e()
        L65:
            cm r8 = r7.t
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.F
            if (r5 != 0) goto L78
            if (r8 == 0) goto L78
            r7.F = r3
            an r5 = r7.G
            r8.post(r5)
        L78:
            r0.t = r1
            r0.w = r2
            long r5 = r7.x
            java.lang.Object r8 = defpackage.bw2.b(r5, r0)
            if (r8 != r4) goto L46
        L84:
            return r4
        L85:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn.a(u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[EDGE_INSN: B:105:0x0173->B:80:0x0173 BREAK  A[LOOP:4: B:48:0x00e9->B:79:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:2: B:21:0x006f->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[LOOP:4: B:48:0x00e9->B:79:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d4 A[EDGE_INSN: B:99:0x00d4->B:44:0x00d4 BREAK  A[LOOP:2: B:21:0x006f->B:42:0x00cb], SYNTHETIC] */
    public final void b(zf5<xb9> zf5Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c2;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        zf5<xb9> zf5Var2 = zf5Var;
        int[] iArr3 = zf5Var2.b;
        long[] jArr = zf5Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c3 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c2 = c3;
                        vb9 vb9VarB = this.D.b(i7);
                        xb9 xb9VarB = zf5Var2.b(i7);
                        ub9 ub9Var = xb9VarB != null ? xb9VarB.a : null;
                        if (ub9Var == null) {
                            throw ik.a("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = ub9Var.f;
                        c37<gc9<?>, Object> c37Var = ub9Var.d.t;
                        if (vb9VarB == null) {
                            Object[] objArr = c37Var.b;
                            long[] jArr2 = c37Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c2) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                gc9 gc9Var = (gc9) objArr[(i10 << 3) + i12];
                                                gc9<List<iw>> gc9Var2 = ac9.C;
                                                if (xj5.a(gc9Var, gc9Var2)) {
                                                    Object objD = c37Var.d(gc9Var2);
                                                    if (objD == null) {
                                                        objD = null;
                                                    }
                                                    List list = (List) objD;
                                                    g(i8, String.valueOf(list != null ? (iw) th1.A(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = c37Var.b;
                            long[] jArr3 = c37Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c2) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                gc9 gc9Var3 = (gc9) objArr2[(i13 << 3) + i15];
                                                gc9<List<iw>> gc9Var4 = ac9.C;
                                                if (xj5.a(gc9Var3, gc9Var4)) {
                                                    Object objD2 = vb9VarB.a.t.d(gc9Var4);
                                                    if (objD2 == null) {
                                                        objD2 = null;
                                                    }
                                                    List list2 = (List) objD2;
                                                    iw iwVar = list2 != null ? (iw) th1.A(list2) : null;
                                                    Object objD3 = c37Var.d(gc9Var4);
                                                    if (objD3 == null) {
                                                        objD3 = null;
                                                    }
                                                    List list3 = (List) objD3;
                                                    iw iwVar2 = list3 != null ? (iw) th1.A(list3) : null;
                                                    if (!xj5.a(iwVar, iwVar2)) {
                                                        g(i8, String.valueOf(iwVar2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c2 = c3;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c3 = c2;
                    j6 = j2;
                    iArr3 = iArr2;
                    zf5Var2 = zf5Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            zf5Var2 = zf5Var;
            iArr3 = iArr;
        }
    }

    public final zf5<xb9> c() {
        if (this.z) {
            this.z = false;
            this.B = zb9.c(this.t.getSemanticsOwner(), c.u);
            this.C = System.currentTimeMillis();
        }
        return this.B;
    }

    public final boolean d() {
        return this.v != null;
    }

    public final void e() {
        yy1 yy1Var = this.v;
        if (yy1Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.w;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                uy1 uy1Var = (uy1) arrayList.get(i);
                int iOrdinal = uy1Var.c.ordinal();
                if (iOrdinal == 0) {
                    nib nibVar = uy1Var.d;
                    if (nibVar != null) {
                        yy1Var.b(nibVar.a);
                    }
                } else if (iOrdinal != 1) {
                    u.b();
                    return;
                } else {
                    AutofillId autofillIdC = yy1Var.c(uy1Var.a);
                    if (autofillIdC != null) {
                        yy1Var.d(autofillIdC);
                    }
                }
            }
            yy1Var.flush();
            arrayList.clear();
        }
    }

    public final void f(ub9 ub9Var, vb9 vb9Var) {
        d dVar = new d(vb9Var, this);
        ub9Var.getClass();
        List listJ = ub9.j(4, ub9Var);
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (c().a(((ub9) obj).f)) {
                dVar.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listJ2 = ub9.j(4, ub9Var);
        int size2 = listJ2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ub9 ub9Var2 = (ub9) listJ2.get(i3);
            zf5<xb9> zf5VarC = c();
            int i4 = ub9Var2.f;
            if (zf5VarC.a(i4)) {
                e27<vb9> e27Var = this.D;
                if (e27Var.a(i4)) {
                    vb9 vb9VarB = e27Var.b(i4);
                    if (vb9VarB == null) {
                        throw ik.a("node not present in pruned tree before this change");
                    }
                    f(ub9Var2, vb9VarB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void g(int i, String str) {
        yy1 yy1Var;
        if (Build.VERSION.SDK_INT >= 29 && (yy1Var = this.v) != null) {
            AutofillId autofillIdC = yy1Var.c(i);
            if (autofillIdC == null) {
                throw ik.a("Invalid content capture ID");
            }
            yy1Var.e(autofillIdC, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0180  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public final void i(int i, ub9 ub9Var) {
        oh4 oh4Var;
        nf0 nf0VarA;
        AutofillId autofillIdA;
        sk8 sk8VarA;
        nib nibVar;
        String strC;
        oh4 oh4Var2;
        if (d()) {
            c37<gc9<?>, Object> c37Var = ub9Var.d.t;
            Object objD = c37Var.d(ac9.E);
            if (objD == null) {
                objD = null;
            }
            Boolean bool = (Boolean) objD;
            if (this.y == a.t && xj5.a(bool, Boolean.TRUE)) {
                Object objD2 = c37Var.d(kb9.m);
                if (objD2 == null) {
                    objD2 = null;
                }
                k3 k3Var = (k3) objD2;
                if (k3Var != null && (oh4Var2 = (oh4) k3Var.b) != null) {
                }
            } else if (this.y == a.u && xj5.a(bool, Boolean.FALSE)) {
                Object objD3 = c37Var.d(kb9.m);
                if (objD3 == null) {
                    objD3 = null;
                }
                k3 k3Var2 = (k3) objD3;
                if (k3Var2 != null && (oh4Var = (oh4) k3Var2.b) != null) {
                }
            }
            int i2 = ub9Var.f;
            yy1 yy1Var = this.v;
            if (yy1Var == null || Build.VERSION.SDK_INT < 29 || (nf0VarA = fgb.a(this.t)) == null) {
                nibVar = null;
            } else {
                ub9 ub9VarL = ub9Var.l();
                int i3 = ub9Var.f;
                if (ub9VarL != null) {
                    autofillIdA = yy1Var.c(ub9VarL.f);
                    if (autofillIdA == null) {
                        nibVar = null;
                    }
                } else {
                    autofillIdA = nf0VarA.a();
                }
                nib nibVarA = yy1Var.a(autofillIdA, i3);
                if (nibVarA == null) {
                    nibVar = null;
                } else {
                    ViewStructure viewStructure = nibVarA.a;
                    lb9 lb9Var = ub9Var.d;
                    gc9<g2b> gc9Var = ac9.L;
                    c37<gc9<?>, Object> c37Var2 = lb9Var.t;
                    if (c37Var2.b(gc9Var)) {
                        nibVar = null;
                    } else {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.C);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objD4 = c37Var2.d(ac9.A);
                        if (objD4 == null) {
                            objD4 = null;
                        }
                        String str = (String) objD4;
                        if (str != null) {
                            viewStructure.setId(i3, null, null, str);
                        }
                        Object objD5 = c37Var2.d(ac9.n);
                        if (objD5 == null) {
                            objD5 = null;
                        }
                        if (((Boolean) objD5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objD6 = c37Var2.d(ac9.C);
                        if (objD6 == null) {
                            objD6 = null;
                        }
                        List list = (List) objD6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(ab6.a(list, "\n", null, 62));
                        }
                        Object objD7 = c37Var2.d(ac9.G);
                        if (objD7 == null) {
                            objD7 = null;
                        }
                        iw iwVar = (iw) objD7;
                        if (iwVar != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(iwVar);
                        }
                        Object objD8 = c37Var2.d(ac9.a);
                        if (objD8 == null) {
                            objD8 = null;
                        }
                        List list2 = (List) objD8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(ab6.a(list2, "\n", null, 62));
                        }
                        Object objD9 = c37Var2.d(ac9.z);
                        if (objD9 == null) {
                            objD9 = null;
                        }
                        ex8 ex8Var = (ex8) objD9;
                        if (ex8Var != null && (strC = kc9.c(ex8Var.a)) != null) {
                            viewStructure.setClassName(strC);
                        }
                        ria riaVarA = kc9.a(lb9Var);
                        if (riaVarA != null) {
                            qia qiaVar = riaVarA.a;
                            wja wjaVar = qiaVar.b;
                            tx2 tx2Var = qiaVar.g;
                            viewStructure.setTextStyle(tx2Var.N0() * tx2Var.getDensity() * bka.c(wjaVar.a.b), 0, 0, 0);
                        }
                        mb7 mb7VarD = ub9Var.d();
                        if (mb7VarD == null) {
                            sk8VarA = sk8.e;
                        } else {
                            mb7 mb7Var = mb7VarD.g1().G ? mb7VarD : null;
                            if (mb7Var != null) {
                                sk8VarA = ub9Var.a(mb7Var);
                            } else {
                                sk8VarA = sk8.e;
                            }
                        }
                        float f = sk8VarA.a;
                        float f2 = sk8VarA.b;
                        viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (sk8VarA.c - f), (int) (sk8VarA.d - f2));
                        nibVar = nibVarA;
                    }
                }
            }
            if (nibVar != null) {
                this.w.add(new uy1(i2, this.C, vy1.t, nibVar));
            }
            List listJ = ub9.j(4, ub9Var);
            int size = listJ.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listJ.get(i5);
                if (c().a(((ub9) obj).f)) {
                    i(i4, (ub9) obj);
                    g2b g2bVar = g2b.a;
                    i4++;
                }
            }
        }
    }

    public final void j(ub9 ub9Var) {
        if (d()) {
            this.w.add(new uy1(ub9Var.f, this.C, vy1.u, null));
            List listJ = ub9.j(4, ub9Var);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                j((ub9) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void k() {
        e27<vb9> e27Var = this.D;
        e27Var.c();
        zf5<xb9> zf5VarC = c();
        int[] iArr = zf5VarC.b;
        Object[] objArr = zf5VarC.c;
        long[] jArr = zf5VarC.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            e27Var.i(iArr[i4], new vb9(((xb9) objArr[i4]).a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.E = new vb9(this.t.getSemanticsOwner().a(), c());
    }

    @Override // defpackage.as2
    public final void onStart(m76 m76Var) {
        this.v = (yy1) this.u.invoke();
        i(-1, this.t.getSemanticsOwner().a());
        e();
    }

    @Override // defpackage.as2
    public final void onStop(m76 m76Var) {
        j(this.t.getSemanticsOwner().a());
        e();
        this.v = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.t.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.G);
        this.v = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
