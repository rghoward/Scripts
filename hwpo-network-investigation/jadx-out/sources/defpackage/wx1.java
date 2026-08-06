package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wx1 extends bmb {
    public int A0;
    public int B0;
    public e61[] C0;
    public e61[] D0;
    public int E0;
    public boolean F0;
    public boolean G0;
    public WeakReference<sx1> H0;
    public WeakReference<sx1> I0;
    public WeakReference<sx1> J0;
    public WeakReference<sx1> K0;
    public final HashSet<vx1> L0;
    public final ll0.a M0;
    public final ll0 s0 = new ll0(this);
    public final ey2 t0;
    public int u0;
    public ll0.b v0;
    public boolean w0;
    public final j86 x0;
    public int y0;
    public int z0;

    public wx1() {
        ey2 ey2Var = new ey2();
        ey2Var.b = true;
        ey2Var.c = true;
        ey2Var.e = new ArrayList<>();
        new ArrayList();
        ey2Var.f = null;
        ey2Var.g = new ll0.a();
        ey2Var.h = new ArrayList<>();
        ey2Var.a = this;
        ey2Var.d = this;
        this.t0 = ey2Var;
        this.v0 = null;
        this.w0 = false;
        this.x0 = new j86();
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new e61[4];
        this.D0 = new e61[4];
        this.E0 = 257;
        this.F0 = false;
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = null;
        this.L0 = new HashSet<>();
        this.M0 = new ll0.a();
    }

    public static void R(vx1 vx1Var, ll0.b bVar, ll0.a aVar) {
        int i;
        int i2;
        if (bVar == null) {
            return;
        }
        int i3 = vx1Var.i0;
        int[] iArr = vx1Var.t;
        if (i3 == 8 || (vx1Var instanceof vp4) || (vx1Var instanceof rj0)) {
            aVar.e = 0;
            aVar.f = 0;
            return;
        }
        vx1.a[] aVarArr = vx1Var.U;
        aVar.a = aVarArr[0];
        aVar.b = aVarArr[1];
        aVar.c = vx1Var.o();
        aVar.d = vx1Var.i();
        aVar.i = false;
        aVar.j = 0;
        vx1.a aVar2 = aVar.a;
        vx1.a aVar3 = vx1.a.v;
        boolean z = aVar2 == aVar3;
        boolean z2 = aVar.b == aVar3;
        boolean z3 = z && vx1Var.Y > 0.0f;
        boolean z4 = z2 && vx1Var.Y > 0.0f;
        vx1.a aVar4 = vx1.a.u;
        vx1.a aVar5 = vx1.a.t;
        if (z && vx1Var.r(0) && vx1Var.r == 0 && !z3) {
            aVar.a = aVar4;
            if (z2 && vx1Var.s == 0) {
                aVar.a = aVar5;
            }
            z = false;
        }
        if (z2 && vx1Var.r(1) && vx1Var.s == 0 && !z4) {
            aVar.b = aVar4;
            if (z && vx1Var.r == 0) {
                aVar.b = aVar5;
            }
            z2 = false;
        }
        if (vx1Var.y()) {
            aVar.a = aVar5;
            z = false;
        }
        if (vx1Var.z()) {
            aVar.b = aVar5;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                aVar.a = aVar5;
            } else if (!z2) {
                if (aVar.b == aVar5) {
                    i2 = aVar.d;
                } else {
                    aVar.a = aVar4;
                    ((ConstraintLayout.b) bVar).b(vx1Var, aVar);
                    i2 = aVar.f;
                }
                aVar.a = aVar5;
                aVar.c = (int) (vx1Var.Y * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                aVar.b = aVar5;
            } else if (!z) {
                if (aVar.a == aVar5) {
                    i = aVar.c;
                } else {
                    aVar.b = aVar4;
                    ((ConstraintLayout.b) bVar).b(vx1Var, aVar);
                    i = aVar.e;
                }
                aVar.b = aVar5;
                int i4 = vx1Var.Z;
                float f = vx1Var.Y;
                if (i4 == -1) {
                    aVar.d = (int) (i / f);
                } else {
                    aVar.d = (int) (f * i);
                }
            }
        }
        ((ConstraintLayout.b) bVar).b(vx1Var, aVar);
        vx1Var.K(aVar.e);
        vx1Var.H(aVar.f);
        vx1Var.E = aVar.h;
        int i5 = aVar.g;
        vx1Var.c0 = i5;
        vx1Var.E = i5 > 0;
        aVar.j = 0;
    }

    @Override // defpackage.bmb, defpackage.vx1
    public final void A() {
        this.x0.t();
        this.y0 = 0;
        this.z0 = 0;
        super.A();
    }

    @Override // defpackage.vx1
    public final void L(boolean z, boolean z2) {
        super.L(z, z2);
        int size = this.r0.size();
        for (int i = 0; i < size; i++) {
            this.r0.get(i).L(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:336:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:338:0x0606  */
    /* JADX WARN: Code duplicated, block: B:345:0x061f  */
    /* JADX WARN: Code duplicated, block: B:346:0x0626  */
    /* JADX WARN: Code duplicated, block: B:352:0x0639  */
    /* JADX WARN: Code duplicated, block: B:358:0x0651  */
    /* JADX WARN: Code duplicated, block: B:361:0x0657  */
    /* JADX WARN: Code duplicated, block: B:363:0x065f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:366:0x066d  */
    /* JADX WARN: Code duplicated, block: B:372:0x067d  */
    /* JADX WARN: Code duplicated, block: B:376:0x0688  */
    /* JADX WARN: Code duplicated, block: B:379:0x0693 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:381:0x0699  */
    /* JADX WARN: Code duplicated, block: B:384:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:388:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:391:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:393:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:397:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:402:0x06e2 A[Catch: Exception -> 0x06f0, LOOP:12: B:401:0x06e0->B:402:0x06e2, LOOP_END, TryCatch #1 {Exception -> 0x06f0, blocks: (B:400:0x06d8, B:402:0x06e2, B:405:0x06fa), top: B:528:0x06d8 }] */
    /* JADX WARN: Code duplicated, block: B:410:0x0707 A[Catch: Exception -> 0x0736, TRY_LEAVE, TryCatch #8 {Exception -> 0x0736, blocks: (B:408:0x0701, B:410:0x0707), top: B:542:0x0701 }] */
    /* JADX WARN: Code duplicated, block: B:427:0x073c  */
    /* JADX WARN: Code duplicated, block: B:430:0x0746 A[Catch: Exception -> 0x0726, TRY_ENTER, TryCatch #7 {Exception -> 0x0726, blocks: (B:415:0x071f, B:430:0x0746, B:432:0x074c, B:435:0x076a, B:437:0x0770, B:441:0x0786), top: B:540:0x071f }] */
    /* JADX WARN: Code duplicated, block: B:435:0x076a A[Catch: Exception -> 0x0726, TRY_ENTER, TryCatch #7 {Exception -> 0x0726, blocks: (B:415:0x071f, B:430:0x0746, B:432:0x074c, B:435:0x076a, B:437:0x0770, B:441:0x0786), top: B:540:0x071f }] */
    /* JADX WARN: Code duplicated, block: B:447:0x0795 A[Catch: Exception -> 0x07ba, TryCatch #5 {Exception -> 0x07ba, blocks: (B:428:0x0742, B:433:0x0766, B:445:0x0791, B:447:0x0795, B:449:0x079b), top: B:536:0x0742 }] */
    /* JADX WARN: Code duplicated, block: B:456:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:466:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:468:0x0808  */
    /* JADX WARN: Code duplicated, block: B:470:0x081e  */
    /* JADX WARN: Code duplicated, block: B:472:0x0822  */
    /* JADX WARN: Code duplicated, block: B:475:0x082e  */
    /* JADX WARN: Code duplicated, block: B:477:0x0837 A[LOOP:15: B:476:0x0835->B:477:0x0837, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:481:0x084a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:496:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:499:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:502:0x08da  */
    /* JADX WARN: Code duplicated, block: B:503:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:505:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:507:0x08ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:510:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:513:0x0903 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:517:0x0917 A[PHI: r15 r25
      0x0917: PHI (r15v10 ??) = (r15v9 ??), (r15v14 ??), (r15v14 ??), (r15v14 ??) binds: [B:504:0x08e5, B:512:0x0901, B:513:0x0903, B:515:0x0909] A[DONT_GENERATE, DONT_INLINE]
      0x0917: PHI (r25v9 boolean) = (r25v8 boolean), (r25v11 boolean), (r25v11 boolean), (r25v11 boolean) binds: [B:504:0x08e5, B:512:0x0901, B:513:0x0903, B:515:0x0909] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:519:0x091d  */
    /* JADX WARN: Code duplicated, block: B:523:0x092f  */
    /* JADX WARN: Code duplicated, block: B:542:0x0701 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x091e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r33v0, types: [bmb, vx1, wx1] */
    @Override // defpackage.bmb
    public final void N() {
        sx1 sx1Var;
        int i;
        int i2;
        vx1.a aVar;
        vx1.a aVar2;
        sx1 sx1Var2;
        vx1.a aVar3;
        j86 j86Var;
        vx1.a aVar4;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i3;
        int i4;
        boolean zS;
        boolean z4;
        int i5;
        ?? r15;
        boolean z5;
        int i6;
        vx1.a aVar5;
        sx1 sx1Var3;
        boolean z6;
        sx1 sx1Var4;
        ?? r16;
        boolean[] zArr;
        boolean[] zArr2;
        int i7;
        boolean z7;
        int iMax;
        boolean z8;
        int iMax2;
        ?? r14;
        ?? r17;
        int i8;
        ?? r18;
        boolean zS2;
        int size;
        int i9;
        boolean z9;
        vx1 vx1Var;
        ?? r19;
        int i10;
        sx1 sx1Var5;
        WeakReference<sx1> weakReference;
        WeakReference<sx1> weakReference2;
        WeakReference<sx1> weakReference3;
        WeakReference<sx1> weakReference4;
        sx1 sx1Var6;
        vx1 vx1Var2;
        int i11;
        vx1.a aVar6;
        vx1.a aVar7;
        cmb cmbVar;
        cmb cmbVar2;
        int i12;
        int iO;
        int i13;
        int i14;
        int size2;
        int i15;
        int i16;
        cmb cmbVar3;
        int iB;
        cmb cmbVar4;
        cmb cmbVar5;
        int i17;
        sx1 sx1Var7;
        this.a0 = 0;
        this.b0 = 0;
        this.F0 = false;
        this.G0 = false;
        int size3 = this.r0.size();
        int iMax3 = Math.max(0, o());
        int iMax4 = Math.max(0, i());
        vx1.a[] aVarArr = this.U;
        vx1.a aVar8 = aVarArr[1];
        vx1.a aVar9 = aVarArr[0];
        int i18 = this.u0;
        vx1.a aVar10 = vx1.a.v;
        sx1 sx1Var8 = this.K;
        sx1 sx1Var9 = this.J;
        vx1.a aVar11 = vx1.a.t;
        if (i18 == 0 && lk7.b(this.E0, 1)) {
            ll0.b bVar = this.v0;
            vx1.a aVar12 = aVarArr[0];
            vx1.a aVar13 = aVarArr[1];
            B();
            ArrayList<vx1> arrayList = this.r0;
            int size4 = arrayList.size();
            for (int i19 = 0; i19 < size4; i19++) {
                arrayList.get(i19).B();
            }
            boolean z10 = this.w0;
            if (aVar12 == aVar11) {
                F(0, o());
            } else {
                sx1Var9.i(0);
                this.a0 = 0;
            }
            boolean z11 = false;
            int i20 = 0;
            boolean z12 = false;
            while (i20 < size4) {
                boolean z13 = z11;
                vx1 vx1Var3 = arrayList.get(i20);
                int i21 = i20;
                if (vx1Var3 instanceof vp4) {
                    vp4 vp4Var = (vp4) vx1Var3;
                    sx1Var7 = sx1Var9;
                    if (vp4Var.v0 == 1) {
                        int i22 = vp4Var.s0;
                        if (i22 != -1) {
                            vp4Var.N(i22);
                        } else if (vp4Var.t0 != -1 && y()) {
                            vp4Var.N(o() - vp4Var.t0);
                        } else if (y()) {
                            vp4Var.N((int) ((vp4Var.r0 * o()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    sx1Var7 = sx1Var9;
                    if ((vx1Var3 instanceof rj0) && ((rj0) vx1Var3).P() == 0) {
                        z11 = z13;
                        z12 = true;
                    }
                    i20 = i21 + 1;
                    sx1Var9 = sx1Var7;
                }
                z11 = z13;
                i20 = i21 + 1;
                sx1Var9 = sx1Var7;
            }
            sx1Var = sx1Var9;
            if (z11) {
                for (int i23 = 0; i23 < size4; i23 = i17 + 1) {
                    vx1 vx1Var4 = arrayList.get(i23);
                    if (vx1Var4 instanceof vp4) {
                        vp4 vp4Var2 = (vp4) vx1Var4;
                        i17 = i23;
                        if (vp4Var2.v0 == 1) {
                            u03.b(0, bVar, vp4Var2, z10);
                        }
                    } else {
                        i17 = i23;
                    }
                }
            }
            u03.b(0, bVar, this, z10);
            if (z12) {
                for (int i24 = 0; i24 < size4; i24++) {
                    vx1 vx1Var5 = arrayList.get(i24);
                    if (vx1Var5 instanceof rj0) {
                        rj0 rj0Var = (rj0) vx1Var5;
                        if (rj0Var.P() == 0 && rj0Var.O()) {
                            u03.b(1, bVar, rj0Var, z10);
                        }
                    }
                }
            }
            if (aVar13 == aVar11) {
                G(0, i());
            } else {
                sx1Var8.i(0);
                this.b0 = 0;
            }
            int i25 = 0;
            boolean z14 = false;
            boolean z15 = false;
            while (i25 < size4) {
                vx1 vx1Var6 = arrayList.get(i25);
                int i26 = i25;
                if (vx1Var6 instanceof vp4) {
                    vp4 vp4Var3 = (vp4) vx1Var6;
                    if (vp4Var3.v0 == 0) {
                        int i27 = vp4Var3.s0;
                        if (i27 != -1) {
                            vp4Var3.N(i27);
                        } else if (vp4Var3.t0 != -1 && z()) {
                            vp4Var3.N(i() - vp4Var3.t0);
                        } else if (z()) {
                            vp4Var3.N((int) ((vp4Var3.r0 * i()) + 0.5f));
                        }
                        z14 = true;
                    }
                } else if ((vx1Var6 instanceof rj0) && ((rj0) vx1Var6).P() == 1) {
                    z15 = true;
                }
                i25 = i26 + 1;
            }
            if (z14) {
                for (int i28 = 0; i28 < size4; i28++) {
                    vx1 vx1Var7 = arrayList.get(i28);
                    if (vx1Var7 instanceof vp4) {
                        vp4 vp4Var4 = (vp4) vx1Var7;
                        if (vp4Var4.v0 == 0) {
                            u03.g(1, bVar, vp4Var4);
                        }
                    }
                }
            }
            u03.g(0, bVar, this);
            if (z15) {
                for (int i29 = 0; i29 < size4; i29++) {
                    vx1 vx1Var8 = arrayList.get(i29);
                    if (vx1Var8 instanceof rj0) {
                        rj0 rj0Var2 = (rj0) vx1Var8;
                        if (rj0Var2.P() == 1 && rj0Var2.O()) {
                            u03.g(1, bVar, rj0Var2);
                        }
                    }
                }
            }
            for (int i30 = 0; i30 < size4; i30++) {
                vx1 vx1Var9 = arrayList.get(i30);
                if (vx1Var9.x() && u03.a(vx1Var9)) {
                    R(vx1Var9, bVar, u03.a);
                    if (!(vx1Var9 instanceof vp4)) {
                        u03.b(0, bVar, vx1Var9, z10);
                        u03.g(0, bVar, vx1Var9);
                    } else if (((vp4) vx1Var9).v0 == 0) {
                        u03.g(0, bVar, vx1Var9);
                    } else {
                        u03.b(0, bVar, vx1Var9, z10);
                    }
                }
            }
            for (int i31 = 0; i31 < size3; i31++) {
                vx1 vx1Var10 = this.r0.get(i31);
                if (vx1Var10.x() && !(vx1Var10 instanceof vp4) && !(vx1Var10 instanceof rj0) && !(vx1Var10 instanceof kjb) && !vx1Var10.G) {
                    vx1.a aVarH = vx1Var10.h(0);
                    vx1.a aVarH2 = vx1Var10.h(1);
                    if (aVarH != aVar10 || vx1Var10.r == 1 || aVarH2 != aVar10 || vx1Var10.s == 1) {
                        R(vx1Var10, this.v0, new ll0.a());
                    }
                }
            }
        } else {
            iMax4 = iMax4;
            sx1Var = sx1Var9;
        }
        vx1.a aVar14 = vx1.a.u;
        j86 j86Var2 = this.x0;
        if (size3 <= 2 || !((aVar9 == aVar14 || aVar8 == aVar14) && lk7.b(this.E0, 1024))) {
            i = iMax3;
            i2 = size3;
            aVar = aVar14;
            aVar2 = aVar9;
            sx1Var2 = sx1Var8;
            aVar3 = aVar11;
            j86Var = j86Var2;
            aVar4 = aVar8;
        } else {
            ll0.b bVar2 = this.v0;
            ArrayList<vx1> arrayList2 = this.r0;
            int size5 = arrayList2.size();
            int i32 = 0;
            while (true) {
                if (i32 < size5) {
                    vx1 vx1Var11 = arrayList2.get(i32);
                    vx1.a aVar15 = aVarArr[0];
                    int i33 = i32;
                    vx1.a aVar16 = aVarArr[1];
                    vx1.a[] aVarArr2 = vx1Var11.U;
                    sx1Var2 = sx1Var8;
                    if (rp4.b(aVar15, aVar16, aVarArr2[0], aVarArr2[1])) {
                        i32 = i33 + 1;
                        sx1Var8 = sx1Var2;
                    } else {
                        i11 = iMax3;
                        i2 = size3;
                        aVar = aVar14;
                        aVar6 = aVar8;
                        aVar7 = aVar9;
                        aVar3 = aVar11;
                        j86Var = j86Var2;
                    }
                } else {
                    sx1Var2 = sx1Var8;
                    i11 = iMax3;
                    i2 = size3;
                    aVar6 = aVar8;
                    ArrayList arrayList3 = null;
                    int i34 = 0;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i34 < size5) {
                        int i35 = i34;
                        vx1 vx1Var12 = arrayList2.get(i34);
                        vx1.a aVar17 = aVar9;
                        vx1.a aVar18 = aVarArr[0];
                        vx1.a aVar19 = aVar11;
                        vx1.a aVar20 = aVarArr[1];
                        j86 j86Var3 = j86Var2;
                        vx1.a[] aVarArr3 = vx1Var12.U;
                        vx1.a aVar21 = aVar14;
                        if (!rp4.b(aVar18, aVar20, aVarArr3[0], aVarArr3[1])) {
                            R(vx1Var12, bVar2, this.M0);
                        }
                        boolean z16 = vx1Var12 instanceof vp4;
                        if (z16) {
                            vp4 vp4Var5 = (vp4) vx1Var12;
                            if (vp4Var5.v0 == 0) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(vp4Var5);
                            }
                            if (vp4Var5.v0 == 1) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(vp4Var5);
                            }
                        }
                        if (vx1Var12 instanceof dw4) {
                            if (vx1Var12 instanceof rj0) {
                                rj0 rj0Var3 = (rj0) vx1Var12;
                                if (rj0Var3.P() == 0) {
                                    if (arrayList7 == null) {
                                        arrayList7 = new ArrayList();
                                    }
                                    arrayList7.add(rj0Var3);
                                }
                                if (rj0Var3.P() == 1) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(rj0Var3);
                                }
                            } else {
                                dw4 dw4Var = (dw4) vx1Var12;
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(dw4Var);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(dw4Var);
                            }
                        }
                        if (vx1Var12.J.f == null && vx1Var12.L.f == null && !z16 && !(vx1Var12 instanceof rj0)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(vx1Var12);
                        }
                        if (vx1Var12.K.f == null && vx1Var12.M.f == null && vx1Var12.N.f == null && !z16 && !(vx1Var12 instanceof rj0)) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(vx1Var12);
                        }
                        i34 = i35 + 1;
                        aVar9 = aVar17;
                        aVar11 = aVar19;
                        j86Var2 = j86Var3;
                        aVar14 = aVar21;
                    }
                    vx1.a aVar22 = aVar14;
                    j86 j86Var4 = j86Var2;
                    aVar7 = aVar9;
                    vx1.a aVar23 = aVar11;
                    ArrayList<cmb> arrayList9 = new ArrayList<>();
                    if (arrayList5 != null) {
                        int size6 = arrayList5.size();
                        int i36 = 0;
                        while (i36 < size6) {
                            Object obj = arrayList5.get(i36);
                            i36++;
                            rp4.a((vp4) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size7 = arrayList7.size();
                        int i37 = 0;
                        while (i37 < size7) {
                            Object obj2 = arrayList7.get(i37);
                            i37++;
                            dw4 dw4Var2 = (dw4) obj2;
                            cmb cmbVarA = rp4.a(dw4Var2, 0, arrayList9, null);
                            dw4Var2.N(0, cmbVarA, arrayList9);
                            cmbVarA.a(arrayList9);
                        }
                    }
                    HashSet<sx1> hashSet = g(sx1.a.t).a;
                    if (hashSet != null) {
                        Iterator<sx1> it = hashSet.iterator();
                        while (it.hasNext()) {
                            rp4.a(it.next().d, 0, arrayList9, null);
                        }
                    }
                    HashSet<sx1> hashSet2 = g(sx1.a.v).a;
                    if (hashSet2 != null) {
                        Iterator<sx1> it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            rp4.a(it2.next().d, 0, arrayList9, null);
                        }
                    }
                    sx1.a aVar24 = sx1.a.y;
                    HashSet<sx1> hashSet3 = g(aVar24).a;
                    if (hashSet3 != null) {
                        Iterator<sx1> it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            rp4.a(it3.next().d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i38 = 0;
                        while (i38 < size8) {
                            Object obj3 = arrayList6.get(i38);
                            i38++;
                            rp4.a((vx1) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size9 = arrayList8.size();
                        int i39 = 0;
                        while (i39 < size9) {
                            Object obj4 = arrayList8.get(i39);
                            i39++;
                            rp4.a((vp4) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        int size10 = arrayList4.size();
                        int i40 = 0;
                        while (i40 < size10) {
                            Object obj5 = arrayList4.get(i40);
                            i40++;
                            dw4 dw4Var3 = (dw4) obj5;
                            cmb cmbVarA2 = rp4.a(dw4Var3, 1, arrayList9, null);
                            dw4Var3.N(1, cmbVarA2, arrayList9);
                            cmbVarA2.a(arrayList9);
                        }
                    }
                    HashSet<sx1> hashSet4 = g(sx1.a.u).a;
                    if (hashSet4 != null) {
                        Iterator<sx1> it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            rp4.a(it4.next().d, 1, arrayList9, null);
                        }
                    }
                    HashSet<sx1> hashSet5 = g(sx1.a.x).a;
                    if (hashSet5 != null) {
                        Iterator<sx1> it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            rp4.a(it5.next().d, 1, arrayList9, null);
                        }
                    }
                    HashSet<sx1> hashSet6 = g(sx1.a.w).a;
                    if (hashSet6 != null) {
                        Iterator<sx1> it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            rp4.a(it6.next().d, 1, arrayList9, null);
                        }
                    }
                    HashSet<sx1> hashSet7 = g(aVar24).a;
                    if (hashSet7 != null) {
                        Iterator<sx1> it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            rp4.a(it7.next().d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList3 != null) {
                        int size11 = arrayList3.size();
                        int i41 = 0;
                        while (i41 < size11) {
                            Object obj6 = arrayList3.get(i41);
                            i41++;
                            rp4.a((vx1) obj6, 1, arrayList9, null);
                        }
                    }
                    char c2 = 1;
                    int i42 = 0;
                    while (i42 < size5) {
                        vx1 vx1Var13 = arrayList2.get(i42);
                        vx1.a[] aVarArr4 = vx1Var13.U;
                        if (aVarArr4[0] == aVar10 && aVarArr4[c2] == aVar10) {
                            int i43 = vx1Var13.p0;
                            int size12 = arrayList9.size();
                            int i44 = 0;
                            while (true) {
                                if (i44 >= size12) {
                                    cmbVar4 = null;
                                    break;
                                }
                                cmbVar4 = arrayList9.get(i44);
                                if (i43 == cmbVar4.b) {
                                    break;
                                } else {
                                    i44++;
                                }
                            }
                            int i45 = vx1Var13.q0;
                            int size13 = arrayList9.size();
                            int i46 = 0;
                            while (true) {
                                if (i46 >= size13) {
                                    cmbVar5 = null;
                                    break;
                                }
                                cmbVar5 = arrayList9.get(i46);
                                if (i45 == cmbVar5.b) {
                                    break;
                                } else {
                                    i46++;
                                }
                            }
                            if (cmbVar4 != null && cmbVar5 != null) {
                                cmbVar4.c(0, cmbVar5);
                                cmbVar5.c = 2;
                                arrayList9.remove(cmbVar4);
                            }
                        }
                        i42++;
                        c2 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        aVar = aVar22;
                        if (aVarArr[0] == aVar) {
                            int size14 = arrayList9.size();
                            int i47 = 0;
                            int i48 = 0;
                            cmbVar = null;
                            while (i48 < size14) {
                                cmb cmbVar6 = arrayList9.get(i48);
                                i48++;
                                cmb cmbVar7 = cmbVar6;
                                if (cmbVar7.c != 1) {
                                    j86 j86Var5 = j86Var4;
                                    int iB2 = cmbVar7.b(j86Var5, 0);
                                    if (iB2 > i47) {
                                        cmbVar = cmbVar7;
                                        i47 = iB2;
                                    }
                                    j86Var4 = j86Var5;
                                }
                            }
                            j86Var = j86Var4;
                            aVar3 = aVar23;
                            if (cmbVar != null) {
                                I(aVar3);
                                K(i47);
                            }
                            if (aVarArr[1] == aVar) {
                                size2 = arrayList9.size();
                                i15 = 0;
                                i16 = 0;
                                cmbVar2 = null;
                                while (i16 < size2) {
                                    cmb cmbVar8 = arrayList9.get(i16);
                                    i16++;
                                    cmbVar3 = cmbVar8;
                                    if (cmbVar3.c != 0 && (iB = cmbVar3.b(j86Var, 1)) > i15) {
                                        cmbVar2 = cmbVar3;
                                        i15 = iB;
                                    }
                                }
                                if (cmbVar2 != null) {
                                    J(aVar3);
                                    H(i15);
                                } else {
                                    cmbVar2 = null;
                                }
                            } else {
                                cmbVar2 = null;
                            }
                            if (cmbVar == null || cmbVar2 != null) {
                                aVar2 = aVar7;
                                if (aVar2 == aVar) {
                                    i12 = i11;
                                    if (i12 < o() || i12 <= 0) {
                                        iO = o();
                                    } else {
                                        K(i12);
                                        this.F0 = true;
                                    }
                                    aVar4 = aVar6;
                                    if (aVar4 == aVar) {
                                        i13 = iMax4;
                                        if (i13 < i() || i13 <= 0) {
                                            i14 = i();
                                        } else {
                                            H(i13);
                                            this.G0 = true;
                                        }
                                        iMax4 = i14;
                                        i = iO;
                                        z = true;
                                    } else {
                                        i13 = iMax4;
                                    }
                                    i14 = i13;
                                    iMax4 = i14;
                                    i = iO;
                                    z = true;
                                } else {
                                    i12 = i11;
                                }
                                iO = i12;
                                aVar4 = aVar6;
                                if (aVar4 == aVar) {
                                    i13 = iMax4;
                                    if (i13 < i()) {
                                    }
                                    i14 = i();
                                    iMax4 = i14;
                                    i = iO;
                                    z = true;
                                } else {
                                    i13 = iMax4;
                                }
                                i14 = i13;
                                iMax4 = i14;
                                i = iO;
                                z = true;
                            }
                            if (!S(64) || S(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            j86Var.getClass();
                            j86Var.h = false;
                            if (this.E0 == 0 && z2) {
                                c = 1;
                                j86Var.h = true;
                            } else {
                                c = 1;
                            }
                            ArrayList<vx1> arrayList10 = this.r0;
                            if (aVarArr[0] != aVar || aVarArr[c] == aVar) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.A0 = 0;
                            this.B0 = 0;
                            i3 = i2;
                            for (i4 = 0; i4 < i3; i4++) {
                                vx1Var2 = this.r0.get(i4);
                                if (vx1Var2 instanceof bmb) {
                                    ((bmb) vx1Var2).N();
                                }
                            }
                            zS = S(64);
                            z4 = z;
                            i5 = 0;
                            r15 = 1;
                            while (r15 != 0) {
                                i6 = i5 + 1;
                                try {
                                    j86Var.t();
                                    aVar5 = aVar3;
                                    try {
                                        this.A0 = 0;
                                        this.B0 = 0;
                                        e(j86Var);
                                        for (i10 = 0; i10 < i3; i10++) {
                                            this.r0.get(i10).e(j86Var);
                                        }
                                        P(j86Var);
                                        try {
                                            weakReference = this.H0;
                                            if (weakReference != null) {
                                                try {
                                                    if (weakReference.get() != null) {
                                                        sx1Var5 = sx1Var2;
                                                        try {
                                                            try {
                                                                z3 = z3;
                                                                z6 = z4;
                                                                try {
                                                                    j86Var.f(j86Var.k(this.H0.get()), j86Var.k(sx1Var5), 0, 5);
                                                                    this.H0 = null;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    sx1Var3 = sx1Var5;
                                                                    r19 = 1;
                                                                    e.printStackTrace();
                                                                    sx1Var4 = sx1Var3;
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    r16 = r19;
                                                                    zArr = lk7.a;
                                                                    if (r16 != 0) {
                                                                        zArr[2] = false;
                                                                        zS2 = S(64);
                                                                        M(j86Var, zS2);
                                                                        size = this.r0.size();
                                                                        i9 = 0;
                                                                        z9 = false;
                                                                        while (i9 < size) {
                                                                            boolean[] zArr3 = zArr;
                                                                            vx1Var = this.r0.get(i9);
                                                                            vx1Var.M(j86Var, zS2);
                                                                            int i49 = i9;
                                                                            boolean z17 = zS2;
                                                                            if (vx1Var.h == -1) {
                                                                                z9 = true;
                                                                            } else {
                                                                                z9 = true;
                                                                            }
                                                                            i9 = i49 + 1;
                                                                            zArr = zArr3;
                                                                            zS2 = z17;
                                                                            z9 = z9;
                                                                        }
                                                                        zArr2 = zArr;
                                                                        z7 = z9;
                                                                    } else {
                                                                        zArr2 = zArr;
                                                                        M(j86Var, zS);
                                                                        for (i7 = 0; i7 < i3; i7++) {
                                                                            this.r0.get(i7).M(j86Var, zS);
                                                                        }
                                                                        z7 = false;
                                                                    }
                                                                    if (!z3) {
                                                                    }
                                                                    iMax = Math.max(this.d0, o());
                                                                    z8 = z7;
                                                                    if (iMax > o()) {
                                                                        K(iMax);
                                                                        aVarArr[0] = aVar5;
                                                                        z8 = true;
                                                                        z6 = true;
                                                                    }
                                                                    iMax2 = Math.max(this.e0, i());
                                                                    if (iMax2 > i()) {
                                                                        H(iMax2);
                                                                        r14 = 1;
                                                                        aVarArr[1] = aVar5;
                                                                        r17 = 1;
                                                                        z6 = true;
                                                                    } else {
                                                                        r14 = 1;
                                                                    }
                                                                    if (z6) {
                                                                        r17 = z8;
                                                                        z4 = z6;
                                                                        i8 = 8;
                                                                        r18 = r17;
                                                                    } else {
                                                                        r17 = z8;
                                                                        if (aVarArr[0] == aVar) {
                                                                            r17 = r17;
                                                                            if (o() > i) {
                                                                                this.F0 = r14;
                                                                                aVarArr[0] = aVar5;
                                                                                K(i);
                                                                                ?? r110 = r14;
                                                                                z6 = r110 == true ? 1 : 0;
                                                                                r17 = r110;
                                                                            }
                                                                        }
                                                                        r17 = r17;
                                                                        r17 = r17;
                                                                        if (aVarArr[r14] == aVar) {
                                                                            r17 = z8;
                                                                            z4 = z6;
                                                                            i8 = 8;
                                                                            r18 = r17;
                                                                        } else {
                                                                            r17 = z8;
                                                                            z4 = z6;
                                                                            i8 = 8;
                                                                            r18 = r17;
                                                                        }
                                                                    }
                                                                    if (i6 > i8) {
                                                                        r18 = 0;
                                                                    }
                                                                    i5 = i6;
                                                                    sx1Var2 = sx1Var4;
                                                                    z3 = z3;
                                                                    aVar3 = aVar5;
                                                                    r15 = r18;
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                z6 = z4;
                                                                sx1Var3 = sx1Var5;
                                                                r19 = 1;
                                                                e.printStackTrace();
                                                                sx1Var4 = sx1Var3;
                                                                System.out.println("EXCEPTION : " + e);
                                                                r16 = r19;
                                                                zArr = lk7.a;
                                                                if (r16 != 0) {
                                                                    zArr[2] = false;
                                                                    zS2 = S(64);
                                                                    M(j86Var, zS2);
                                                                    size = this.r0.size();
                                                                    i9 = 0;
                                                                    z9 = false;
                                                                    while (i9 < size) {
                                                                        boolean[] zArr4 = zArr;
                                                                        vx1Var = this.r0.get(i9);
                                                                        vx1Var.M(j86Var, zS2);
                                                                        int i410 = i9;
                                                                        boolean z18 = zS2;
                                                                        if (vx1Var.h == -1) {
                                                                            z9 = true;
                                                                        } else {
                                                                            z9 = true;
                                                                        }
                                                                        i9 = i410 + 1;
                                                                        zArr = zArr4;
                                                                        zS2 = z18;
                                                                        z9 = z9;
                                                                    }
                                                                    zArr2 = zArr;
                                                                    z7 = z9;
                                                                } else {
                                                                    zArr2 = zArr;
                                                                    M(j86Var, zS);
                                                                    while (i7 < i3) {
                                                                        this.r0.get(i7).M(j86Var, zS);
                                                                    }
                                                                    z7 = false;
                                                                }
                                                                if (!z3) {
                                                                }
                                                                iMax = Math.max(this.d0, o());
                                                                z8 = z7;
                                                                if (iMax > o()) {
                                                                    K(iMax);
                                                                    aVarArr[0] = aVar5;
                                                                    z8 = true;
                                                                    z6 = true;
                                                                }
                                                                iMax2 = Math.max(this.e0, i());
                                                                if (iMax2 > i()) {
                                                                    H(iMax2);
                                                                    r14 = 1;
                                                                    aVarArr[1] = aVar5;
                                                                    r17 = 1;
                                                                    z6 = true;
                                                                } else {
                                                                    r14 = 1;
                                                                }
                                                                if (z6) {
                                                                    r17 = z8;
                                                                    if (aVarArr[0] == aVar) {
                                                                        r17 = r17;
                                                                        if (o() > i) {
                                                                            this.F0 = r14;
                                                                            aVarArr[0] = aVar5;
                                                                            K(i);
                                                                            ?? r111 = r14;
                                                                            z6 = r111 == true ? 1 : 0;
                                                                            r17 = r111;
                                                                        }
                                                                    }
                                                                    r17 = r17;
                                                                    r17 = r17;
                                                                    if (aVarArr[r14] == aVar) {
                                                                        r17 = z8;
                                                                        z4 = z6;
                                                                        i8 = 8;
                                                                        r18 = r17;
                                                                    } else {
                                                                        r17 = z8;
                                                                        z4 = z6;
                                                                        i8 = 8;
                                                                        r18 = r17;
                                                                    }
                                                                } else {
                                                                    r17 = z8;
                                                                    z4 = z6;
                                                                    i8 = 8;
                                                                    r18 = r17;
                                                                }
                                                                if (i6 > i8) {
                                                                    r18 = 0;
                                                                }
                                                                i5 = i6;
                                                                sx1Var2 = sx1Var4;
                                                                z3 = z3;
                                                                aVar3 = aVar5;
                                                                r15 = r18;
                                                            }
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                        }
                                                    } else {
                                                        z3 = z3;
                                                        sx1Var5 = sx1Var2;
                                                        z6 = z4;
                                                    }
                                                    try {
                                                        weakReference2 = this.J0;
                                                        if (weakReference2 != null && weakReference2.get() != null) {
                                                            j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                                                            this.J0 = null;
                                                        }
                                                        weakReference3 = this.I0;
                                                        if (weakReference3 != null && weakReference3.get() != null) {
                                                            sx1Var6 = sx1Var;
                                                            try {
                                                                sx1Var = sx1Var6;
                                                                j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                                                                this.I0 = null;
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                sx1Var = sx1Var6;
                                                                sx1Var3 = sx1Var5;
                                                                r19 = 1;
                                                                e.printStackTrace();
                                                                sx1Var4 = sx1Var3;
                                                                System.out.println("EXCEPTION : " + e);
                                                                r16 = r19;
                                                            }
                                                        }
                                                        weakReference4 = this.K0;
                                                        if (weakReference4 == null && weakReference4.get() != null) {
                                                            j86Var.f(j86Var.k(this.L), j86Var.k(this.K0.get()), 0, 5);
                                                            try {
                                                                this.K0 = null;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                sx1Var3 = sx1Var5;
                                                                r19 = 1;
                                                                e.printStackTrace();
                                                                sx1Var4 = sx1Var3;
                                                                System.out.println("EXCEPTION : " + e);
                                                                r16 = r19;
                                                            }
                                                        }
                                                        j86Var.p();
                                                        sx1Var4 = sx1Var5;
                                                        r16 = 1;
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                    }
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    sx1Var5 = sx1Var2;
                                                }
                                            } else {
                                                z3 = z3;
                                                sx1Var5 = sx1Var2;
                                                z6 = z4;
                                                weakReference2 = this.J0;
                                                if (weakReference2 != null) {
                                                    j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                                                    this.J0 = null;
                                                }
                                                weakReference3 = this.I0;
                                                if (weakReference3 != null) {
                                                    sx1Var6 = sx1Var;
                                                    sx1Var = sx1Var6;
                                                    j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                                                    this.I0 = null;
                                                }
                                                weakReference4 = this.K0;
                                                if (weakReference4 == null) {
                                                }
                                                j86Var.p();
                                                sx1Var4 = sx1Var5;
                                                r16 = 1;
                                            }
                                        } catch (Exception e8) {
                                            e = e8;
                                            z3 = z3;
                                            sx1Var5 = sx1Var2;
                                            z6 = z4;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        z3 = z3;
                                        sx1Var3 = sx1Var2;
                                        z6 = z4;
                                        r19 = r15;
                                        e.printStackTrace();
                                        sx1Var4 = sx1Var3;
                                        System.out.println("EXCEPTION : " + e);
                                        r16 = r19;
                                        zArr = lk7.a;
                                        if (r16 != 0) {
                                            zArr[2] = false;
                                            zS2 = S(64);
                                            M(j86Var, zS2);
                                            size = this.r0.size();
                                            i9 = 0;
                                            z9 = false;
                                            while (i9 < size) {
                                                boolean[] zArr5 = zArr;
                                                vx1Var = this.r0.get(i9);
                                                vx1Var.M(j86Var, zS2);
                                                int i411 = i9;
                                                boolean z19 = zS2;
                                                if (vx1Var.h == -1) {
                                                    z9 = true;
                                                } else {
                                                    z9 = true;
                                                }
                                                i9 = i411 + 1;
                                                zArr = zArr5;
                                                zS2 = z19;
                                                z9 = z9;
                                            }
                                            zArr2 = zArr;
                                            z7 = z9;
                                        } else {
                                            zArr2 = zArr;
                                            M(j86Var, zS);
                                            while (i7 < i3) {
                                                this.r0.get(i7).M(j86Var, zS);
                                            }
                                            z7 = false;
                                        }
                                        if (!z3) {
                                        }
                                        iMax = Math.max(this.d0, o());
                                        z8 = z7;
                                        if (iMax > o()) {
                                            K(iMax);
                                            aVarArr[0] = aVar5;
                                            z8 = true;
                                            z6 = true;
                                        }
                                        iMax2 = Math.max(this.e0, i());
                                        if (iMax2 > i()) {
                                            H(iMax2);
                                            r14 = 1;
                                            aVarArr[1] = aVar5;
                                            r17 = 1;
                                            z6 = true;
                                        } else {
                                            r14 = 1;
                                        }
                                        if (z6) {
                                            r17 = z8;
                                            if (aVarArr[0] == aVar) {
                                                r17 = r17;
                                                if (o() > i) {
                                                    this.F0 = r14;
                                                    aVarArr[0] = aVar5;
                                                    K(i);
                                                    ?? r112 = r14;
                                                    z6 = r112 == true ? 1 : 0;
                                                    r17 = r112;
                                                }
                                            }
                                            r17 = r17;
                                            r17 = r17;
                                            if (aVarArr[r14] == aVar) {
                                                r17 = z8;
                                                z4 = z6;
                                                i8 = 8;
                                                r18 = r17;
                                            } else {
                                                r17 = z8;
                                                z4 = z6;
                                                i8 = 8;
                                                r18 = r17;
                                            }
                                        } else {
                                            r17 = z8;
                                            z4 = z6;
                                            i8 = 8;
                                            r18 = r17;
                                        }
                                        if (i6 > i8) {
                                            r18 = 0;
                                        }
                                        i5 = i6;
                                        sx1Var2 = sx1Var4;
                                        z3 = z3;
                                        aVar3 = aVar5;
                                        r15 = r18;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    aVar5 = aVar3;
                                }
                                zArr = lk7.a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zS2 = S(64);
                                    M(j86Var, zS2);
                                    size = this.r0.size();
                                    i9 = 0;
                                    z9 = false;
                                    while (i9 < size) {
                                        boolean[] zArr6 = zArr;
                                        vx1Var = this.r0.get(i9);
                                        vx1Var.M(j86Var, zS2);
                                        int i412 = i9;
                                        boolean z110 = zS2;
                                        if (vx1Var.h == -1 || vx1Var.i != -1) {
                                            z9 = true;
                                        }
                                        i9 = i412 + 1;
                                        zArr = zArr6;
                                        zS2 = z110;
                                        z9 = z9;
                                    }
                                    zArr2 = zArr;
                                    z7 = z9;
                                } else {
                                    zArr2 = zArr;
                                    M(j86Var, zS);
                                    while (i7 < i3) {
                                        this.r0.get(i7).M(j86Var, zS);
                                    }
                                    z7 = false;
                                }
                                if (!z3 && i6 < 8) {
                                    if (zArr2[2]) {
                                        int iMax5 = 0;
                                        int iMax6 = 0;
                                        for (int i50 = 0; i50 < i3; i50++) {
                                            vx1 vx1Var14 = this.r0.get(i50);
                                            iMax6 = Math.max(iMax6, vx1Var14.o() + vx1Var14.a0);
                                            iMax5 = Math.max(iMax5, vx1Var14.i() + vx1Var14.b0);
                                        }
                                        int iMax7 = Math.max(this.d0, iMax6);
                                        int iMax8 = Math.max(this.e0, iMax5);
                                        z7 = z7;
                                        if (aVar2 == aVar && o() < iMax7) {
                                            z7 = z7;
                                            K(iMax7);
                                            aVarArr[0] = aVar;
                                            z7 = true;
                                            z6 = true;
                                        }
                                        if (aVar4 == aVar && i() < iMax8) {
                                            H(iMax8);
                                            aVarArr[1] = aVar;
                                            z7 = true;
                                            z6 = true;
                                        }
                                    }
                                }
                                iMax = Math.max(this.d0, o());
                                z8 = z7;
                                if (iMax > o()) {
                                    K(iMax);
                                    aVarArr[0] = aVar5;
                                    z8 = true;
                                    z6 = true;
                                }
                                iMax2 = Math.max(this.e0, i());
                                if (iMax2 > i()) {
                                    H(iMax2);
                                    r14 = 1;
                                    aVarArr[1] = aVar5;
                                    r17 = 1;
                                    z6 = true;
                                } else {
                                    r14 = 1;
                                }
                                if (z6) {
                                    r17 = z8;
                                    if (aVarArr[0] == aVar && i > 0) {
                                        r17 = r17;
                                        if (o() > i) {
                                            this.F0 = r14;
                                            aVarArr[0] = aVar5;
                                            K(i);
                                            ?? r113 = r14;
                                            z6 = r113 == true ? 1 : 0;
                                            r17 = r113;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (aVarArr[r14] == aVar || iMax4 <= 0 || i() <= iMax4) {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    } else {
                                        this.G0 = r14;
                                        aVarArr[r14] = aVar5;
                                        H(iMax4);
                                        i8 = 8;
                                        z4 = true;
                                        r18 = 1;
                                    }
                                } else {
                                    r17 = z8;
                                    z4 = z6;
                                    i8 = 8;
                                    r18 = r17;
                                }
                                if (i6 > i8) {
                                    r18 = 0;
                                }
                                i5 = i6;
                                sx1Var2 = sx1Var4;
                                z3 = z3;
                                aVar3 = aVar5;
                                r15 = r18;
                            }
                            z5 = z4;
                            this.r0 = arrayList10;
                            if (z5) {
                                aVarArr[0] = aVar2;
                                aVarArr[1] = aVar4;
                            }
                            C(j86Var.m);
                        }
                        j86Var = j86Var4;
                        aVar3 = aVar23;
                        cmbVar = null;
                        if (aVarArr[1] == aVar) {
                            size2 = arrayList9.size();
                            i15 = 0;
                            i16 = 0;
                            cmbVar2 = null;
                            while (i16 < size2) {
                                cmb cmbVar9 = arrayList9.get(i16);
                                i16++;
                                cmbVar3 = cmbVar9;
                                if (cmbVar3.c != 0) {
                                    cmbVar2 = cmbVar3;
                                    i15 = iB;
                                }
                            }
                            if (cmbVar2 != null) {
                                J(aVar3);
                                H(i15);
                            } else {
                                cmbVar2 = null;
                            }
                        } else {
                            cmbVar2 = null;
                        }
                        if (cmbVar == null) {
                        }
                        aVar2 = aVar7;
                        if (aVar2 == aVar) {
                            i12 = i11;
                            if (i12 < o()) {
                            }
                            iO = o();
                            aVar4 = aVar6;
                            if (aVar4 == aVar) {
                                i13 = iMax4;
                                if (i13 < i()) {
                                }
                                i14 = i();
                                iMax4 = i14;
                                i = iO;
                                z = true;
                                if (S(64)) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                j86Var.getClass();
                                j86Var.h = false;
                                if (this.E0 == 0) {
                                    c = 1;
                                } else {
                                    c = 1;
                                }
                                ArrayList<vx1> arrayList11 = this.r0;
                                if (aVarArr[0] != aVar) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                this.A0 = 0;
                                this.B0 = 0;
                                i3 = i2;
                                while (i4 < i3) {
                                    vx1Var2 = this.r0.get(i4);
                                    if (vx1Var2 instanceof bmb) {
                                        ((bmb) vx1Var2).N();
                                    }
                                }
                                zS = S(64);
                                z4 = z;
                                i5 = 0;
                                r15 = 1;
                                while (r15 != 0) {
                                    i6 = i5 + 1;
                                    j86Var.t();
                                    aVar5 = aVar3;
                                    this.A0 = 0;
                                    this.B0 = 0;
                                    e(j86Var);
                                    while (i10 < i3) {
                                        this.r0.get(i10).e(j86Var);
                                    }
                                    P(j86Var);
                                    weakReference = this.H0;
                                    if (weakReference != null) {
                                        if (weakReference.get() != null) {
                                            sx1Var5 = sx1Var2;
                                            z3 = z3;
                                            z6 = z4;
                                            j86Var.f(j86Var.k(this.H0.get()), j86Var.k(sx1Var5), 0, 5);
                                            this.H0 = null;
                                        } else {
                                            z3 = z3;
                                            sx1Var5 = sx1Var2;
                                            z6 = z4;
                                        }
                                        weakReference2 = this.J0;
                                        if (weakReference2 != null) {
                                            j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                                            this.J0 = null;
                                        }
                                        weakReference3 = this.I0;
                                        if (weakReference3 != null) {
                                            sx1Var6 = sx1Var;
                                            sx1Var = sx1Var6;
                                            j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference4 = this.K0;
                                        if (weakReference4 == null) {
                                        }
                                        j86Var.p();
                                        sx1Var4 = sx1Var5;
                                        r16 = 1;
                                    } else {
                                        z3 = z3;
                                        sx1Var5 = sx1Var2;
                                        z6 = z4;
                                        weakReference2 = this.J0;
                                        if (weakReference2 != null) {
                                            j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                                            this.J0 = null;
                                        }
                                        weakReference3 = this.I0;
                                        if (weakReference3 != null) {
                                            sx1Var6 = sx1Var;
                                            sx1Var = sx1Var6;
                                            j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference4 = this.K0;
                                        if (weakReference4 == null) {
                                        }
                                        j86Var.p();
                                        sx1Var4 = sx1Var5;
                                        r16 = 1;
                                    }
                                    zArr = lk7.a;
                                    if (r16 != 0) {
                                        zArr[2] = false;
                                        zS2 = S(64);
                                        M(j86Var, zS2);
                                        size = this.r0.size();
                                        i9 = 0;
                                        z9 = false;
                                        while (i9 < size) {
                                            boolean[] zArr7 = zArr;
                                            vx1Var = this.r0.get(i9);
                                            vx1Var.M(j86Var, zS2);
                                            int i413 = i9;
                                            boolean z111 = zS2;
                                            if (vx1Var.h == -1) {
                                                z9 = true;
                                            } else {
                                                z9 = true;
                                            }
                                            i9 = i413 + 1;
                                            zArr = zArr7;
                                            zS2 = z111;
                                            z9 = z9;
                                        }
                                        zArr2 = zArr;
                                        z7 = z9;
                                    } else {
                                        zArr2 = zArr;
                                        M(j86Var, zS);
                                        while (i7 < i3) {
                                            this.r0.get(i7).M(j86Var, zS);
                                        }
                                        z7 = false;
                                    }
                                    if (!z3) {
                                    }
                                    iMax = Math.max(this.d0, o());
                                    z8 = z7;
                                    if (iMax > o()) {
                                        K(iMax);
                                        aVarArr[0] = aVar5;
                                        z8 = true;
                                        z6 = true;
                                    }
                                    iMax2 = Math.max(this.e0, i());
                                    if (iMax2 > i()) {
                                        H(iMax2);
                                        r14 = 1;
                                        aVarArr[1] = aVar5;
                                        r17 = 1;
                                        z6 = true;
                                    } else {
                                        r14 = 1;
                                    }
                                    if (z6) {
                                        r17 = z8;
                                        if (aVarArr[0] == aVar) {
                                            r17 = r17;
                                            if (o() > i) {
                                                this.F0 = r14;
                                                aVarArr[0] = aVar5;
                                                K(i);
                                                ?? r114 = r14;
                                                z6 = r114 == true ? 1 : 0;
                                                r17 = r114;
                                            }
                                        }
                                        r17 = r17;
                                        r17 = r17;
                                        if (aVarArr[r14] == aVar) {
                                            r17 = z8;
                                            z4 = z6;
                                            i8 = 8;
                                            r18 = r17;
                                        } else {
                                            r17 = z8;
                                            z4 = z6;
                                            i8 = 8;
                                            r18 = r17;
                                        }
                                    } else {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    }
                                    if (i6 > i8) {
                                        r18 = 0;
                                    }
                                    i5 = i6;
                                    sx1Var2 = sx1Var4;
                                    z3 = z3;
                                    aVar3 = aVar5;
                                    r15 = r18;
                                }
                                z5 = z4;
                                this.r0 = arrayList11;
                                if (z5) {
                                    aVarArr[0] = aVar2;
                                    aVarArr[1] = aVar4;
                                }
                                C(j86Var.m);
                            }
                            i13 = iMax4;
                            i14 = i13;
                            iMax4 = i14;
                            i = iO;
                            z = true;
                            if (S(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            j86Var.getClass();
                            j86Var.h = false;
                            if (this.E0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList<vx1> arrayList12 = this.r0;
                            if (aVarArr[0] != aVar) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.A0 = 0;
                            this.B0 = 0;
                            i3 = i2;
                            while (i4 < i3) {
                                vx1Var2 = this.r0.get(i4);
                                if (vx1Var2 instanceof bmb) {
                                    ((bmb) vx1Var2).N();
                                }
                            }
                            zS = S(64);
                            z4 = z;
                            i5 = 0;
                            r15 = 1;
                            while (r15 != 0) {
                                i6 = i5 + 1;
                                j86Var.t();
                                aVar5 = aVar3;
                                this.A0 = 0;
                                this.B0 = 0;
                                e(j86Var);
                                while (i10 < i3) {
                                    this.r0.get(i10).e(j86Var);
                                }
                                P(j86Var);
                                weakReference = this.H0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        sx1Var5 = sx1Var2;
                                        z3 = z3;
                                        z6 = z4;
                                        j86Var.f(j86Var.k(this.H0.get()), j86Var.k(sx1Var5), 0, 5);
                                        this.H0 = null;
                                    } else {
                                        z3 = z3;
                                        sx1Var5 = sx1Var2;
                                        z6 = z4;
                                    }
                                    weakReference2 = this.J0;
                                    if (weakReference2 != null) {
                                        j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                                        this.J0 = null;
                                    }
                                    weakReference3 = this.I0;
                                    if (weakReference3 != null) {
                                        sx1Var6 = sx1Var;
                                        sx1Var = sx1Var6;
                                        j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference4 = this.K0;
                                    if (weakReference4 == null) {
                                    }
                                    j86Var.p();
                                    sx1Var4 = sx1Var5;
                                    r16 = 1;
                                } else {
                                    z3 = z3;
                                    sx1Var5 = sx1Var2;
                                    z6 = z4;
                                    weakReference2 = this.J0;
                                    if (weakReference2 != null) {
                                        j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                                        this.J0 = null;
                                    }
                                    weakReference3 = this.I0;
                                    if (weakReference3 != null) {
                                        sx1Var6 = sx1Var;
                                        sx1Var = sx1Var6;
                                        j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference4 = this.K0;
                                    if (weakReference4 == null) {
                                    }
                                    j86Var.p();
                                    sx1Var4 = sx1Var5;
                                    r16 = 1;
                                }
                                zArr = lk7.a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zS2 = S(64);
                                    M(j86Var, zS2);
                                    size = this.r0.size();
                                    i9 = 0;
                                    z9 = false;
                                    while (i9 < size) {
                                        boolean[] zArr8 = zArr;
                                        vx1Var = this.r0.get(i9);
                                        vx1Var.M(j86Var, zS2);
                                        int i414 = i9;
                                        boolean z112 = zS2;
                                        if (vx1Var.h == -1) {
                                            z9 = true;
                                        } else {
                                            z9 = true;
                                        }
                                        i9 = i414 + 1;
                                        zArr = zArr8;
                                        zS2 = z112;
                                        z9 = z9;
                                    }
                                    zArr2 = zArr;
                                    z7 = z9;
                                } else {
                                    zArr2 = zArr;
                                    M(j86Var, zS);
                                    while (i7 < i3) {
                                        this.r0.get(i7).M(j86Var, zS);
                                    }
                                    z7 = false;
                                }
                                if (!z3) {
                                }
                                iMax = Math.max(this.d0, o());
                                z8 = z7;
                                if (iMax > o()) {
                                    K(iMax);
                                    aVarArr[0] = aVar5;
                                    z8 = true;
                                    z6 = true;
                                }
                                iMax2 = Math.max(this.e0, i());
                                if (iMax2 > i()) {
                                    H(iMax2);
                                    r14 = 1;
                                    aVarArr[1] = aVar5;
                                    r17 = 1;
                                    z6 = true;
                                } else {
                                    r14 = 1;
                                }
                                if (z6) {
                                    r17 = z8;
                                    if (aVarArr[0] == aVar) {
                                        r17 = r17;
                                        if (o() > i) {
                                            this.F0 = r14;
                                            aVarArr[0] = aVar5;
                                            K(i);
                                            ?? r115 = r14;
                                            z6 = r115 == true ? 1 : 0;
                                            r17 = r115;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (aVarArr[r14] == aVar) {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    } else {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    }
                                } else {
                                    r17 = z8;
                                    z4 = z6;
                                    i8 = 8;
                                    r18 = r17;
                                }
                                if (i6 > i8) {
                                    r18 = 0;
                                }
                                i5 = i6;
                                sx1Var2 = sx1Var4;
                                z3 = z3;
                                aVar3 = aVar5;
                                r15 = r18;
                            }
                            z5 = z4;
                            this.r0 = arrayList12;
                            if (z5) {
                                aVarArr[0] = aVar2;
                                aVarArr[1] = aVar4;
                            }
                            C(j86Var.m);
                        }
                        i12 = i11;
                        iO = i12;
                        aVar4 = aVar6;
                        if (aVar4 == aVar) {
                            i13 = iMax4;
                            if (i13 < i()) {
                            }
                            i14 = i();
                            iMax4 = i14;
                            i = iO;
                            z = true;
                            if (S(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            j86Var.getClass();
                            j86Var.h = false;
                            if (this.E0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList<vx1> arrayList13 = this.r0;
                            if (aVarArr[0] != aVar) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.A0 = 0;
                            this.B0 = 0;
                            i3 = i2;
                            while (i4 < i3) {
                                vx1Var2 = this.r0.get(i4);
                                if (vx1Var2 instanceof bmb) {
                                    ((bmb) vx1Var2).N();
                                }
                            }
                            zS = S(64);
                            z4 = z;
                            i5 = 0;
                            r15 = 1;
                            while (r15 != 0) {
                                i6 = i5 + 1;
                                j86Var.t();
                                aVar5 = aVar3;
                                this.A0 = 0;
                                this.B0 = 0;
                                e(j86Var);
                                while (i10 < i3) {
                                    this.r0.get(i10).e(j86Var);
                                }
                                P(j86Var);
                                weakReference = this.H0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        sx1Var5 = sx1Var2;
                                        z3 = z3;
                                        z6 = z4;
                                        j86Var.f(j86Var.k(this.H0.get()), j86Var.k(sx1Var5), 0, 5);
                                        this.H0 = null;
                                    } else {
                                        z3 = z3;
                                        sx1Var5 = sx1Var2;
                                        z6 = z4;
                                    }
                                    weakReference2 = this.J0;
                                    if (weakReference2 != null) {
                                        j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                                        this.J0 = null;
                                    }
                                    weakReference3 = this.I0;
                                    if (weakReference3 != null) {
                                        sx1Var6 = sx1Var;
                                        sx1Var = sx1Var6;
                                        j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference4 = this.K0;
                                    if (weakReference4 == null) {
                                    }
                                    j86Var.p();
                                    sx1Var4 = sx1Var5;
                                    r16 = 1;
                                } else {
                                    z3 = z3;
                                    sx1Var5 = sx1Var2;
                                    z6 = z4;
                                    weakReference2 = this.J0;
                                    if (weakReference2 != null) {
                                        j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                                        this.J0 = null;
                                    }
                                    weakReference3 = this.I0;
                                    if (weakReference3 != null) {
                                        sx1Var6 = sx1Var;
                                        sx1Var = sx1Var6;
                                        j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference4 = this.K0;
                                    if (weakReference4 == null) {
                                    }
                                    j86Var.p();
                                    sx1Var4 = sx1Var5;
                                    r16 = 1;
                                }
                                zArr = lk7.a;
                                if (r16 != 0) {
                                    zArr[2] = false;
                                    zS2 = S(64);
                                    M(j86Var, zS2);
                                    size = this.r0.size();
                                    i9 = 0;
                                    z9 = false;
                                    while (i9 < size) {
                                        boolean[] zArr9 = zArr;
                                        vx1Var = this.r0.get(i9);
                                        vx1Var.M(j86Var, zS2);
                                        int i415 = i9;
                                        boolean z113 = zS2;
                                        if (vx1Var.h == -1) {
                                            z9 = true;
                                        } else {
                                            z9 = true;
                                        }
                                        i9 = i415 + 1;
                                        zArr = zArr9;
                                        zS2 = z113;
                                        z9 = z9;
                                    }
                                    zArr2 = zArr;
                                    z7 = z9;
                                } else {
                                    zArr2 = zArr;
                                    M(j86Var, zS);
                                    while (i7 < i3) {
                                        this.r0.get(i7).M(j86Var, zS);
                                    }
                                    z7 = false;
                                }
                                if (!z3) {
                                }
                                iMax = Math.max(this.d0, o());
                                z8 = z7;
                                if (iMax > o()) {
                                    K(iMax);
                                    aVarArr[0] = aVar5;
                                    z8 = true;
                                    z6 = true;
                                }
                                iMax2 = Math.max(this.e0, i());
                                if (iMax2 > i()) {
                                    H(iMax2);
                                    r14 = 1;
                                    aVarArr[1] = aVar5;
                                    r17 = 1;
                                    z6 = true;
                                } else {
                                    r14 = 1;
                                }
                                if (z6) {
                                    r17 = z8;
                                    if (aVarArr[0] == aVar) {
                                        r17 = r17;
                                        if (o() > i) {
                                            this.F0 = r14;
                                            aVarArr[0] = aVar5;
                                            K(i);
                                            ?? r116 = r14;
                                            z6 = r116 == true ? 1 : 0;
                                            r17 = r116;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (aVarArr[r14] == aVar) {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    } else {
                                        r17 = z8;
                                        z4 = z6;
                                        i8 = 8;
                                        r18 = r17;
                                    }
                                } else {
                                    r17 = z8;
                                    z4 = z6;
                                    i8 = 8;
                                    r18 = r17;
                                }
                                if (i6 > i8) {
                                    r18 = 0;
                                }
                                i5 = i6;
                                sx1Var2 = sx1Var4;
                                z3 = z3;
                                aVar3 = aVar5;
                                r15 = r18;
                            }
                            z5 = z4;
                            this.r0 = arrayList13;
                            if (z5) {
                                aVarArr[0] = aVar2;
                                aVarArr[1] = aVar4;
                            }
                            C(j86Var.m);
                        }
                        i13 = iMax4;
                        i14 = i13;
                        iMax4 = i14;
                        i = iO;
                        z = true;
                        if (S(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        j86Var.getClass();
                        j86Var.h = false;
                        if (this.E0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList<vx1> arrayList14 = this.r0;
                        if (aVarArr[0] != aVar) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.A0 = 0;
                        this.B0 = 0;
                        i3 = i2;
                        while (i4 < i3) {
                            vx1Var2 = this.r0.get(i4);
                            if (vx1Var2 instanceof bmb) {
                                ((bmb) vx1Var2).N();
                            }
                        }
                        zS = S(64);
                        z4 = z;
                        i5 = 0;
                        r15 = 1;
                        while (r15 != 0) {
                            i6 = i5 + 1;
                            j86Var.t();
                            aVar5 = aVar3;
                            this.A0 = 0;
                            this.B0 = 0;
                            e(j86Var);
                            while (i10 < i3) {
                                this.r0.get(i10).e(j86Var);
                            }
                            P(j86Var);
                            weakReference = this.H0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    sx1Var5 = sx1Var2;
                                    z3 = z3;
                                    z6 = z4;
                                    j86Var.f(j86Var.k(this.H0.get()), j86Var.k(sx1Var5), 0, 5);
                                    this.H0 = null;
                                } else {
                                    z3 = z3;
                                    sx1Var5 = sx1Var2;
                                    z6 = z4;
                                }
                                weakReference2 = this.J0;
                                if (weakReference2 != null) {
                                    j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                                    this.J0 = null;
                                }
                                weakReference3 = this.I0;
                                if (weakReference3 != null) {
                                    sx1Var6 = sx1Var;
                                    sx1Var = sx1Var6;
                                    j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference4 = this.K0;
                                if (weakReference4 == null) {
                                }
                                j86Var.p();
                                sx1Var4 = sx1Var5;
                                r16 = 1;
                            } else {
                                z3 = z3;
                                sx1Var5 = sx1Var2;
                                z6 = z4;
                                weakReference2 = this.J0;
                                if (weakReference2 != null) {
                                    j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                                    this.J0 = null;
                                }
                                weakReference3 = this.I0;
                                if (weakReference3 != null) {
                                    sx1Var6 = sx1Var;
                                    sx1Var = sx1Var6;
                                    j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference4 = this.K0;
                                if (weakReference4 == null) {
                                }
                                j86Var.p();
                                sx1Var4 = sx1Var5;
                                r16 = 1;
                            }
                            zArr = lk7.a;
                            if (r16 != 0) {
                                zArr[2] = false;
                                zS2 = S(64);
                                M(j86Var, zS2);
                                size = this.r0.size();
                                i9 = 0;
                                z9 = false;
                                while (i9 < size) {
                                    boolean[] zArr10 = zArr;
                                    vx1Var = this.r0.get(i9);
                                    vx1Var.M(j86Var, zS2);
                                    int i416 = i9;
                                    boolean z114 = zS2;
                                    if (vx1Var.h == -1) {
                                        z9 = true;
                                    } else {
                                        z9 = true;
                                    }
                                    i9 = i416 + 1;
                                    zArr = zArr10;
                                    zS2 = z114;
                                    z9 = z9;
                                }
                                zArr2 = zArr;
                                z7 = z9;
                            } else {
                                zArr2 = zArr;
                                M(j86Var, zS);
                                while (i7 < i3) {
                                    this.r0.get(i7).M(j86Var, zS);
                                }
                                z7 = false;
                            }
                            if (!z3) {
                            }
                            iMax = Math.max(this.d0, o());
                            z8 = z7;
                            if (iMax > o()) {
                                K(iMax);
                                aVarArr[0] = aVar5;
                                z8 = true;
                                z6 = true;
                            }
                            iMax2 = Math.max(this.e0, i());
                            if (iMax2 > i()) {
                                H(iMax2);
                                r14 = 1;
                                aVarArr[1] = aVar5;
                                r17 = 1;
                                z6 = true;
                            } else {
                                r14 = 1;
                            }
                            if (z6) {
                                r17 = z8;
                                if (aVarArr[0] == aVar) {
                                    r17 = r17;
                                    if (o() > i) {
                                        this.F0 = r14;
                                        aVarArr[0] = aVar5;
                                        K(i);
                                        ?? r117 = r14;
                                        z6 = r117 == true ? 1 : 0;
                                        r17 = r117;
                                    }
                                }
                                r17 = r17;
                                r17 = r17;
                                if (aVarArr[r14] == aVar) {
                                    r17 = z8;
                                    z4 = z6;
                                    i8 = 8;
                                    r18 = r17;
                                } else {
                                    r17 = z8;
                                    z4 = z6;
                                    i8 = 8;
                                    r18 = r17;
                                }
                            } else {
                                r17 = z8;
                                z4 = z6;
                                i8 = 8;
                                r18 = r17;
                            }
                            if (i6 > i8) {
                                r18 = 0;
                            }
                            i5 = i6;
                            sx1Var2 = sx1Var4;
                            z3 = z3;
                            aVar3 = aVar5;
                            r15 = r18;
                        }
                        z5 = z4;
                        this.r0 = arrayList14;
                        if (z5) {
                            aVarArr[0] = aVar2;
                            aVarArr[1] = aVar4;
                        }
                        C(j86Var.m);
                    }
                    aVar3 = aVar23;
                    j86Var = j86Var4;
                    aVar = aVar22;
                }
                aVar4 = aVar6;
                i = i11;
                aVar2 = aVar7;
            }
        }
        z = false;
        if (S(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        j86Var.getClass();
        j86Var.h = false;
        if (this.E0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList<vx1> arrayList15 = this.r0;
        if (aVarArr[0] != aVar) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.A0 = 0;
        this.B0 = 0;
        i3 = i2;
        while (i4 < i3) {
            vx1Var2 = this.r0.get(i4);
            if (vx1Var2 instanceof bmb) {
                ((bmb) vx1Var2).N();
            }
        }
        zS = S(64);
        z4 = z;
        i5 = 0;
        r15 = 1;
        while (r15 != 0) {
            i6 = i5 + 1;
            j86Var.t();
            aVar5 = aVar3;
            this.A0 = 0;
            this.B0 = 0;
            e(j86Var);
            while (i10 < i3) {
                this.r0.get(i10).e(j86Var);
            }
            P(j86Var);
            weakReference = this.H0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    sx1Var5 = sx1Var2;
                    z3 = z3;
                    z6 = z4;
                    j86Var.f(j86Var.k(this.H0.get()), j86Var.k(sx1Var5), 0, 5);
                    this.H0 = null;
                } else {
                    z3 = z3;
                    sx1Var5 = sx1Var2;
                    z6 = z4;
                }
                weakReference2 = this.J0;
                if (weakReference2 != null) {
                    j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                    this.J0 = null;
                }
                weakReference3 = this.I0;
                if (weakReference3 != null) {
                    sx1Var6 = sx1Var;
                    sx1Var = sx1Var6;
                    j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                    this.I0 = null;
                }
                weakReference4 = this.K0;
                if (weakReference4 == null) {
                }
                j86Var.p();
                sx1Var4 = sx1Var5;
                r16 = 1;
            } else {
                z3 = z3;
                sx1Var5 = sx1Var2;
                z6 = z4;
                weakReference2 = this.J0;
                if (weakReference2 != null) {
                    j86Var.f(j86Var.k(this.M), j86Var.k(this.J0.get()), 0, 5);
                    this.J0 = null;
                }
                weakReference3 = this.I0;
                if (weakReference3 != null) {
                    sx1Var6 = sx1Var;
                    sx1Var = sx1Var6;
                    j86Var.f(j86Var.k(this.I0.get()), j86Var.k(sx1Var6), 0, 5);
                    this.I0 = null;
                }
                weakReference4 = this.K0;
                if (weakReference4 == null) {
                }
                j86Var.p();
                sx1Var4 = sx1Var5;
                r16 = 1;
            }
            zArr = lk7.a;
            if (r16 != 0) {
                zArr[2] = false;
                zS2 = S(64);
                M(j86Var, zS2);
                size = this.r0.size();
                i9 = 0;
                z9 = false;
                while (i9 < size) {
                    boolean[] zArr11 = zArr;
                    vx1Var = this.r0.get(i9);
                    vx1Var.M(j86Var, zS2);
                    int i417 = i9;
                    boolean z115 = zS2;
                    if (vx1Var.h == -1) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    i9 = i417 + 1;
                    zArr = zArr11;
                    zS2 = z115;
                    z9 = z9;
                }
                zArr2 = zArr;
                z7 = z9;
            } else {
                zArr2 = zArr;
                M(j86Var, zS);
                while (i7 < i3) {
                    this.r0.get(i7).M(j86Var, zS);
                }
                z7 = false;
            }
            if (!z3) {
            }
            iMax = Math.max(this.d0, o());
            z8 = z7;
            if (iMax > o()) {
                K(iMax);
                aVarArr[0] = aVar5;
                z8 = true;
                z6 = true;
            }
            iMax2 = Math.max(this.e0, i());
            if (iMax2 > i()) {
                H(iMax2);
                r14 = 1;
                aVarArr[1] = aVar5;
                r17 = 1;
                z6 = true;
            } else {
                r14 = 1;
            }
            if (z6) {
                r17 = z8;
                if (aVarArr[0] == aVar) {
                    r17 = r17;
                    if (o() > i) {
                        this.F0 = r14;
                        aVarArr[0] = aVar5;
                        K(i);
                        ?? r118 = r14;
                        z6 = r118 == true ? 1 : 0;
                        r17 = r118;
                    }
                }
                r17 = r17;
                r17 = r17;
                if (aVarArr[r14] == aVar) {
                    r17 = z8;
                    z4 = z6;
                    i8 = 8;
                    r18 = r17;
                } else {
                    r17 = z8;
                    z4 = z6;
                    i8 = 8;
                    r18 = r17;
                }
            } else {
                r17 = z8;
                z4 = z6;
                i8 = 8;
                r18 = r17;
            }
            if (i6 > i8) {
                r18 = 0;
            }
            i5 = i6;
            sx1Var2 = sx1Var4;
            z3 = z3;
            aVar3 = aVar5;
            r15 = r18;
        }
        z5 = z4;
        this.r0 = arrayList15;
        if (z5) {
            aVarArr[0] = aVar2;
            aVarArr[1] = aVar4;
        }
        C(j86Var.m);
    }

    public final void O(vx1 vx1Var, int i) {
        if (i == 0) {
            int i2 = this.A0 + 1;
            e61[] e61VarArr = this.D0;
            if (i2 >= e61VarArr.length) {
                this.D0 = (e61[]) Arrays.copyOf(e61VarArr, e61VarArr.length * 2);
            }
            e61[] e61VarArr2 = this.D0;
            int i3 = this.A0;
            e61VarArr2[i3] = new e61(vx1Var, 0, this.w0);
            this.A0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.B0 + 1;
            e61[] e61VarArr3 = this.C0;
            if (i4 >= e61VarArr3.length) {
                this.C0 = (e61[]) Arrays.copyOf(e61VarArr3, e61VarArr3.length * 2);
            }
            e61[] e61VarArr4 = this.C0;
            int i5 = this.B0;
            e61VarArr4[i5] = new e61(vx1Var, 1, this.w0);
            this.B0 = i5 + 1;
        }
    }

    public final void P(j86 j86Var) {
        wx1 wx1Var;
        j86 j86Var2;
        boolean zS = S(64);
        b(j86Var, zS);
        int size = this.r0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            vx1 vx1Var = this.r0.get(i);
            boolean[] zArr = vx1Var.T;
            zArr[0] = false;
            zArr[1] = false;
            if (vx1Var instanceof rj0) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                vx1 vx1Var2 = this.r0.get(i2);
                if (vx1Var2 instanceof rj0) {
                    rj0 rj0Var = (rj0) vx1Var2;
                    for (int i3 = 0; i3 < rj0Var.s0; i3++) {
                        vx1 vx1Var3 = rj0Var.r0[i3];
                        if (rj0Var.u0 || vx1Var3.c()) {
                            int i4 = rj0Var.t0;
                            if (i4 == 0 || i4 == 1) {
                                vx1Var3.T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                vx1Var3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<vx1> hashSet = this.L0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            vx1 vx1Var4 = this.r0.get(i5);
            vx1Var4.getClass();
            boolean z2 = vx1Var4 instanceof kjb;
            if (z2 || (vx1Var4 instanceof vp4)) {
                if (z2) {
                    hashSet.add(vx1Var4);
                } else {
                    vx1Var4.b(j86Var, zS);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<vx1> it = hashSet.iterator();
            while (it.hasNext()) {
                kjb kjbVar = (kjb) it.next();
                for (int i6 = 0; i6 < kjbVar.s0; i6++) {
                    if (hashSet.contains(kjbVar.r0[i6])) {
                        kjbVar.b(j86Var, zS);
                        hashSet.remove(kjbVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<vx1> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().b(j86Var, zS);
                }
                hashSet.clear();
            }
        }
        boolean z3 = j86.q;
        vx1.a aVar = vx1.a.u;
        if (z3) {
            HashSet<vx1> hashSet2 = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                vx1 vx1Var5 = this.r0.get(i7);
                vx1Var5.getClass();
                if (!(vx1Var5 instanceof kjb) && !(vx1Var5 instanceof vp4)) {
                    hashSet2.add(vx1Var5);
                }
            }
            wx1Var = this;
            j86Var2 = j86Var;
            wx1Var.a(this, j86Var2, hashSet2, this.U[0] == aVar ? 0 : 1, false);
            for (vx1 vx1Var6 : hashSet2) {
                lk7.a(wx1Var, j86Var2, vx1Var6);
                vx1Var6.b(j86Var2, zS);
            }
        } else {
            wx1Var = this;
            j86Var2 = j86Var;
            for (int i8 = 0; i8 < size; i8++) {
                vx1 vx1Var7 = wx1Var.r0.get(i8);
                if (vx1Var7 instanceof wx1) {
                    vx1.a[] aVarArr = vx1Var7.U;
                    vx1.a aVar2 = aVarArr[0];
                    vx1.a aVar3 = aVarArr[1];
                    vx1.a aVar4 = vx1.a.t;
                    if (aVar2 == aVar) {
                        vx1Var7.I(aVar4);
                    }
                    if (aVar3 == aVar) {
                        vx1Var7.J(aVar4);
                    }
                    vx1Var7.b(j86Var2, zS);
                    if (aVar2 == aVar) {
                        vx1Var7.I(aVar2);
                    }
                    if (aVar3 == aVar) {
                        vx1Var7.J(aVar3);
                    }
                } else {
                    lk7.a(wx1Var, j86Var2, vx1Var7);
                    if (!(vx1Var7 instanceof kjb) && !(vx1Var7 instanceof vp4)) {
                        vx1Var7.b(j86Var2, zS);
                    }
                }
            }
        }
        if (wx1Var.A0 > 0) {
            d61.a(wx1Var, j86Var2, null, 0);
        }
        if (wx1Var.B0 > 0) {
            d61.a(wx1Var, j86Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    public final boolean Q(int i, boolean z) {
        boolean z2;
        vx1.a aVar;
        boolean z3;
        ey2 ey2Var = this.t0;
        ArrayList<dmb> arrayList = ey2Var.e;
        wx1 wx1Var = ey2Var.a;
        boolean z4 = false;
        vx1.a aVarH = wx1Var.h(0);
        vx1.a aVarH2 = wx1Var.h(1);
        int iP = wx1Var.p();
        int iQ = wx1Var.q();
        vx1.a aVar2 = vx1.a.t;
        if (z && (aVarH == (aVar = vx1.a.u) || aVarH2 == aVar)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = z;
                    break;
                }
                dmb dmbVar = arrayList.get(i2);
                i2++;
                dmb dmbVar2 = dmbVar;
                if (dmbVar2.f == i && !dmbVar2.k()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && aVarH == aVar) {
                    wx1Var.I(aVar2);
                    wx1Var.K(ey2Var.d(wx1Var, 0));
                    wx1Var.d.e.d(wx1Var.o());
                }
            } else if (z3 && aVarH2 == aVar) {
                wx1Var.J(aVar2);
                wx1Var.H(ey2Var.d(wx1Var, 1));
                wx1Var.e.e.d(wx1Var.i());
            }
        }
        vx1.a[] aVarArr = wx1Var.U;
        vx1.a aVar3 = vx1.a.w;
        if (i == 0) {
            vx1.a aVar4 = aVarArr[0];
            if (aVar4 == aVar2 || aVar4 == aVar3) {
                int iO = wx1Var.o() + iP;
                wx1Var.d.i.d(iO);
                wx1Var.d.e.d(iO - iP);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            vx1.a aVar5 = aVarArr[1];
            if (aVar5 == aVar2 || aVar5 == aVar3) {
                int i3 = wx1Var.i() + iQ;
                wx1Var.e.i.d(i3);
                wx1Var.e.e.d(i3 - iQ);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        ey2Var.g();
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            dmb dmbVar3 = arrayList.get(i4);
            i4++;
            dmb dmbVar4 = dmbVar3;
            if (dmbVar4.f == i && (dmbVar4.b != wx1Var || dmbVar4.g)) {
                dmbVar4.e();
            }
        }
        int size3 = arrayList.size();
        int i5 = 0;
        while (i5 < size3) {
            dmb dmbVar5 = arrayList.get(i5);
            i5++;
            dmb dmbVar6 = dmbVar5;
            if (dmbVar6.f == i && (z2 || dmbVar6.b != wx1Var)) {
                if (!dmbVar6.h.j || !dmbVar6.i.j || (!(dmbVar6 instanceof f61) && !dmbVar6.e.j)) {
                    wx1Var.I(aVarH);
                    wx1Var.J(aVarH2);
                    return z4;
                }
            }
        }
        z4 = true;
        wx1Var.I(aVarH);
        wx1Var.J(aVarH2);
        return z4;
    }

    public final boolean S(int i) {
        return (this.E0 & i) == i;
    }

    @Override // defpackage.vx1
    public final void l(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        ArrayList<vx1> arrayList = this.r0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            vx1 vx1Var = arrayList.get(i);
            i++;
            vx1Var.l(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
