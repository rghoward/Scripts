package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m62 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements cg7 {
        public final /* synthetic */ long a;

        public a(long j) {
            this.a = j;
        }

        @Override // defpackage.cg7
        public final long a() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements PointerInputEventHandler {
        public final /* synthetic */ lda a;
        public final /* synthetic */ qga b;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public /* synthetic */ Object t;
            public final /* synthetic */ i58 u;
            public final /* synthetic */ lda v;
            public final /* synthetic */ qga w;

            /* JADX INFO: renamed from: m62$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1074}, m = "invokeSuspend", v = 1)
            public static final class C0199a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                public int t;
                public final /* synthetic */ i58 u;
                public final /* synthetic */ lda v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0199a(i58 i58Var, lda ldaVar, r02<? super C0199a> r02Var) {
                    super(2, r02Var);
                    this.u = i58Var;
                    this.v = ldaVar;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new C0199a(this.u, this.v, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((C0199a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = this.t;
                    if (i == 0) {
                        dv8.b(obj);
                        this.t = 1;
                        Object objD = u72.d(new se6(this.u, this.v, null), this);
                        Object obj2 = v72.t;
                        if (objD != obj2) {
                            objD = g2b.a;
                        }
                        if (objD == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj);
                    }
                    return g2b.a;
                }
            }

            /* JADX INFO: renamed from: m62$b$a$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1077}, m = "invokeSuspend", v = 1)
            public static final class C0200b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                public int t;
                public final /* synthetic */ i58 u;
                public final /* synthetic */ qga v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0200b(i58 i58Var, qga qgaVar, r02<? super C0200b> r02Var) {
                    super(2, r02Var);
                    this.u = i58Var;
                    this.v = qgaVar;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new C0200b(this.u, this.v, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((C0200b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = this.t;
                    if (i == 0) {
                        dv8.b(obj);
                        n62 n62Var = new n62(0, this.v);
                        this.t = 1;
                        Object objD = o8a.d(this.u, null, null, n62Var, this, 7);
                        v72 v72Var = v72.t;
                        if (objD == v72Var) {
                            return v72Var;
                        }
                    } else {
                        if (i != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj);
                    }
                    return g2b.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i58 i58Var, lda ldaVar, qga qgaVar, r02<? super a> r02Var) {
                super(2, r02Var);
                this.u = i58Var;
                this.v = ldaVar;
                this.w = qgaVar;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                a aVar = new a(this.u, this.v, this.w, r02Var);
                aVar.t = obj;
                return aVar;
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                dv8.b(obj);
                t72 t72Var = (t72) this.t;
                lda ldaVar = this.v;
                i58 i58Var = this.u;
                C0199a c0199a = new C0199a(i58Var, ldaVar, null);
                x72 x72Var = x72.w;
                oy0.d(t72Var, null, x72Var, c0199a, 1);
                oy0.d(t72Var, null, x72Var, new C0200b(i58Var, this.w, null), 1);
                return g2b.a;
            }
        }

        public b(lda ldaVar, qga qgaVar) {
            this.a = ldaVar;
            this.b = qgaVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
            Object objD = u72.d(new a(i58Var, this.a, this.b, null), r02Var);
            return objD == v72.t ? objD : g2b.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:207:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:208:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:211:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:213:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:216:0x040f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0414  */
    /* JADX WARN: Code duplicated, block: B:220:0x041f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0429  */
    /* JADX WARN: Code duplicated, block: B:223:0x0439  */
    /* JADX WARN: Code duplicated, block: B:226:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x0447  */
    /* JADX WARN: Code duplicated, block: B:233:0x0459  */
    /* JADX WARN: Code duplicated, block: B:236:0x0464  */
    /* JADX WARN: Code duplicated, block: B:237:0x0470  */
    /* JADX WARN: Code duplicated, block: B:240:0x047d  */
    /* JADX WARN: Code duplicated, block: B:242:0x0481  */
    /* JADX WARN: Code duplicated, block: B:245:0x048d  */
    /* JADX WARN: Code duplicated, block: B:248:0x049c  */
    /* JADX WARN: Code duplicated, block: B:251:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:254:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:257:0x052f  */
    /* JADX WARN: Code duplicated, block: B:258:0x0534  */
    /* JADX WARN: Code duplicated, block: B:260:0x055a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x055c  */
    /* JADX WARN: Code duplicated, block: B:265:0x0586  */
    /* JADX WARN: Code duplicated, block: B:266:0x0588  */
    /* JADX WARN: Code duplicated, block: B:269:0x0590  */
    /* JADX WARN: Code duplicated, block: B:270:0x0592  */
    /* JADX WARN: Code duplicated, block: B:273:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:274:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:277:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:280:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:281:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:284:0x05c8 A[PHI: r11 r19 r23
      0x05c8: PHI (r11v11 s85) = (r11v4 s85), (r11v12 s85) binds: [B:283:0x05c6, B:280:0x05b7] A[DONT_GENERATE, DONT_INLINE]
      0x05c8: PHI (r19v16 boolean) = (r19v9 boolean), (r19v18 boolean) binds: [B:283:0x05c6, B:280:0x05b7] A[DONT_GENERATE, DONT_INLINE]
      0x05c8: PHI (r23v9 int) = (r23v2 int), (r23v10 int) binds: [B:283:0x05c6, B:280:0x05b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:285:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:288:0x05e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:294:0x0655 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:296:0x0659  */
    /* JADX WARN: Code duplicated, block: B:299:0x0680  */
    /* JADX WARN: Code duplicated, block: B:303:0x068a  */
    /* JADX WARN: Code duplicated, block: B:305:0x0690 A[PHI: r25
      0x0690: PHI (r25v4 u56) = (r25v1 u56), (r25v6 u56) binds: [B:304:0x068e, B:302:0x0687] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:306:0x0692  */
    /* JADX WARN: Code duplicated, block: B:309:0x069b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:312:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:315:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:318:0x0725  */
    /* JADX WARN: Code duplicated, block: B:319:0x0727  */
    /* JADX WARN: Code duplicated, block: B:322:0x073a  */
    /* JADX WARN: Code duplicated, block: B:323:0x073c  */
    /* JADX WARN: Code duplicated, block: B:326:0x0749 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:329:0x074f  */
    /* JADX WARN: Code duplicated, block: B:332:0x0783 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:341:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:343:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:344:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:347:0x07cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:348:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:351:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:352:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:355:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:357:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:363:0x0804 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:364:0x0806  */
    /* JADX WARN: Code duplicated, block: B:367:0x081a  */
    /* JADX WARN: Code duplicated, block: B:368:0x081c  */
    /* JADX WARN: Code duplicated, block: B:372:0x083b  */
    /* JADX WARN: Code duplicated, block: B:374:0x083f  */
    /* JADX WARN: Code duplicated, block: B:378:0x085d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:379:0x085f  */
    /* JADX WARN: Code duplicated, block: B:382:0x086b  */
    /* JADX WARN: Code duplicated, block: B:388:0x0884  */
    /* JADX WARN: Code duplicated, block: B:391:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:392:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:395:0x08bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:398:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:401:0x0937  */
    /* JADX WARN: Code duplicated, block: B:409:0x0954  */
    /* JADX WARN: Code duplicated, block: B:414:0x0966  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [sfa] */
    public static final void a(final kha khaVar, final oh4 oh4Var, final ox6 ox6Var, final wja wjaVar, final ojb ojbVar, final oh4 oh4Var2, final h27 h27Var, final fx0 fx0Var, final boolean z, final int i, final int i2, final s85 s85Var, final bp5 bp5Var, final boolean z2, final boolean z3, final ei4 ei4Var, jt1 jt1Var, final int i3, final int i4) {
        int i5;
        int i6;
        bj4 bj4Var;
        Object u56Var;
        wja wjaVar2;
        boolean z4;
        tx2 tx2Var;
        qa4.a aVar;
        iw iwVar;
        tx2 tx2Var2;
        nd3 nd3Var;
        gia giaVar;
        lja ljaVar;
        String str;
        iw iwVar2;
        d94 d94Var;
        boolean z5;
        boolean z6;
        bj4 bj4Var2;
        long j;
        kha khaVarA;
        kha khaVar2;
        Object objF;
        bj4 bj4Var3;
        z1b z1bVar;
        long jCurrentTimeMillis;
        Object objF2;
        final t72 t72Var;
        Object objF3;
        final fw0 fw0Var;
        Object objF4;
        final qga qgaVar;
        ad6 ad6Var;
        Context context;
        h72 h72Var;
        boolean zJ;
        Object objF5;
        j18 j18Var;
        int i7;
        boolean z7;
        boolean z8;
        final xha xhaVar;
        int i8;
        boolean z9;
        boolean z10;
        int i9;
        s85 s85Var2;
        boolean z11;
        int i10;
        boolean z12;
        boolean zJ2;
        Object objF6;
        bj4 bj4Var4;
        final u56 u56Var2;
        z1b z1bVar2;
        final s85 s85Var3;
        ag7 ag7Var;
        qga qgaVar2;
        fw0 fw0Var2;
        boolean z13;
        final kha khaVar3;
        t72 t72Var2;
        ox6.a aVar2;
        boolean z14;
        h37 h37VarJ;
        u56 u56Var3;
        boolean z15;
        boolean z16;
        Object g62Var;
        final u56 u56Var4;
        ox6 ox6VarB;
        final ?? r0;
        final qga qgaVar3;
        final ag7 ag7Var2;
        final xha xhaVar2;
        boolean z17;
        boolean z18;
        boolean zJ3;
        Object objF7;
        final u56 u56Var5;
        boolean z19;
        ox6 ox6VarA;
        boolean zJ4;
        Object objF8;
        boolean z20;
        boolean z21;
        Object objF9;
        final boolean z22;
        int i11;
        final boolean z23;
        boolean zBooleanValue;
        boolean zC;
        Object objF10;
        ox6 ox6VarH;
        fx0 fx0Var2;
        long j2;
        fx0 aw9Var;
        boolean zJ5;
        Object objF11;
        boolean z24;
        ox6 ox6VarA2;
        Long l;
        bj4 bj4VarO = jt1Var.o(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (bj4VarO.J(khaVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= bj4VarO.J(wjaVar) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= bj4VarO.J(ojbVar) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= bj4VarO.j(oh4Var2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= bj4VarO.J(h27Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= bj4VarO.J(fx0Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= bj4VarO.c(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= bj4VarO.h(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (bj4VarO.h(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= bj4VarO.J(s85Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= bj4VarO.J(bp5Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= bj4VarO.c(z2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= bj4VarO.c(z3) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= bj4VarO.j(ei4Var) ? 131072 : 65536;
        }
        int i12 = i6 | 1572864;
        if (bj4VarO.A(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i12) == 599186) ? false : true)) {
            bj4VarO.v0();
            if ((i3 & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            Object objF12 = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF12 == c0187a) {
                objF12 = new p94();
                bj4VarO.C(objF12);
            }
            final p94 p94Var = (p94) objF12;
            Object objF13 = bj4VarO.f();
            if (objF13 == c0187a) {
                o56.a aVar3 = o56.a;
                objF13 = new zo();
                bj4VarO.C(objF13);
            }
            final n56 n56Var = (n56) objF13;
            Object objF14 = bj4VarO.f();
            if (objF14 == c0187a) {
                objF14 = new xha(n56Var);
                bj4VarO.C(objF14);
            }
            xha xhaVar3 = (xha) objF14;
            tx2 tx2Var3 = (tx2) bj4VarO.F(qu1.h);
            qa4.a aVar4 = (qa4.a) bj4VarO.F(qu1.k);
            long j3 = ((qja) bj4VarO.F(rja.a)).b;
            d94 d94Var2 = (d94) bj4VarO.F(qu1.i);
            final mmb mmbVar = (mmb) bj4VarO.F(qu1.u);
            xv9 xv9Var = (xv9) bj4VarO.F(qu1.q);
            fl7 fl7Var = fl7.t;
            fl7 fl7Var2 = (i == 1 && !z && s85Var.a) ? fl7.u : fl7Var;
            bj4VarO.K(-213744626);
            Object[] objArr = {fl7Var2};
            au3 au3Var = gga.g;
            boolean zH = bj4VarO.h(fl7Var2.ordinal());
            Object objF15 = bj4VarO.f();
            if (zH || objF15 == c0187a) {
                objF15 = new up1(1, fl7Var2);
                bj4VarO.C(objF15);
            }
            final gga ggaVar = (gga) mm8.e(objArr, au3Var, (mh4) objF15, bj4VarO, 0);
            bj4VarO.U(false);
            if (((fl7) ggaVar.f.getValue()) != fl7Var2) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(fl7Var2 == fl7Var ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i13 = i5 & 14;
            boolean z25 = (i13 == 4) | ((i5 & 57344) == 16384);
            Object objF16 = bj4VarO.f();
            if (z25 || objF16 == c0187a) {
                mva mvaVarA = n7b.a(ojbVar, khaVar.a);
                ag7 ag7Var3 = mvaVarA.b;
                lja ljaVar2 = khaVar.c;
                if (ljaVar2 != null) {
                    long j4 = ljaVar2.a;
                    int i14 = lja.c;
                    int iB = ag7Var3.b((int) (j4 >> 32));
                    int iB2 = ag7Var3.b((int) (j4 & 4294967295L));
                    int iMin = Math.min(iB, iB2);
                    int iMax = Math.max(iB, iB2);
                    iw.b bVar = new iw.b(mvaVarA.a);
                    bVar.a(new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439), iMin, iMax);
                    objF16 = new mva(bVar.i(), ag7Var3);
                } else {
                    objF16 = mvaVarA;
                }
                bj4VarO.C(objF16);
            } else {
                i13 = i13;
            }
            mva mvaVar = (mva) objF16;
            iw iwVar3 = mvaVar.a;
            final ag7 ag7Var4 = mvaVar.b;
            xj8 xj8VarA = bj4VarO.a();
            if (xj8VarA == null) {
                aa0.c("no recompose scope found");
                return;
            }
            bj4VarO.t(xj8VarA);
            boolean zJ6 = bj4VarO.J(xv9Var);
            Object objF17 = bj4VarO.f();
            if (zJ6 || objF17 == c0187a) {
                wjaVar2 = wjaVar;
                hda hdaVar = new hda(iwVar3, wjaVar2, z, tx2Var3, aVar4, 0);
                z4 = z;
                tx2Var = tx2Var3;
                aVar = aVar4;
                u56Var = new u56(hdaVar, xj8VarA, xv9Var);
                bj4VarO.C(u56Var);
            } else {
                z4 = z;
                u56Var = objF17;
                aVar = aVar4;
                tx2Var = tx2Var3;
                wjaVar2 = wjaVar;
            }
            u56 u56Var6 = (u56) u56Var;
            iw iwVar4 = khaVar.a;
            long j5 = khaVar.b;
            u56Var6.u = oh4Var;
            u56Var6.z = j3;
            zo5 zo5Var = u56Var6.r;
            zo5Var.b = bp5Var;
            zo5Var.c = d94Var2;
            u56Var6.j = iwVar4;
            hda hdaVar2 = u56Var6.a;
            if (xj5.a(hdaVar2.a, iwVar3) && xj5.a(hdaVar2.b, wjaVar2) && hdaVar2.e == z4) {
                iwVar = iwVar3;
                if (hdaVar2.f == 1 && hdaVar2.c == Integer.MAX_VALUE && hdaVar2.d == 1 && xj5.a(hdaVar2.g, tx2Var) && xj5.a(hdaVar2.i, hf3.t) && hdaVar2.h == aVar) {
                    tx2Var2 = tx2Var;
                }
                if (u56Var6.a != hdaVar2) {
                    u56Var6.p = true;
                }
                u56Var6.a = hdaVar2;
                nd3Var = u56Var6.d;
                giaVar = u56Var6.e;
                nd3Var.getClass();
                ljaVar = khaVar.c;
                boolean zA = xj5.a(ljaVar, nd3Var.b.c());
                str = nd3Var.a.a.u;
                iwVar2 = khaVar.a;
                if (xj5.a(str, iwVar2.u)) {
                    d94Var = d94Var2;
                    if (lja.b(nd3Var.a.b, j5)) {
                        z5 = false;
                    } else {
                        nd3Var.b.h(lja.f(j5), lja.e(j5));
                        z5 = false;
                        z6 = true;
                    }
                    if (ljaVar == null) {
                        td3 td3Var = nd3Var.b;
                        td3Var.d = -1;
                        td3Var.e = -1;
                        bj4Var2 = bj4VarO;
                    } else {
                        bj4Var2 = bj4VarO;
                        j = ljaVar.a;
                        if (!lja.c(j)) {
                            nd3Var.b.g(lja.f(j), lja.e(j));
                        }
                    }
                    if (z5 && (z6 || zA)) {
                        khaVarA = khaVar;
                    } else {
                        td3 td3Var2 = nd3Var.b;
                        td3Var2.d = -1;
                        td3Var2.e = -1;
                        khaVarA = kha.a(khaVar, null, 0L, 3);
                    }
                    khaVar2 = nd3Var.a;
                    nd3Var.a = khaVarA;
                    if (giaVar != null) {
                        giaVar.a(khaVar2, khaVarA);
                    }
                    objF = bj4Var2.f();
                    if (objF == c0187a) {
                        objF = new z1b(0);
                        bj4Var3 = bj4Var2;
                        bj4Var3.C(objF);
                    } else {
                        bj4Var3 = bj4Var2;
                    }
                    z1bVar = (z1b) objF;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (z1bVar.f) {
                        z1bVar.e = Long.valueOf(jCurrentTimeMillis);
                        z1bVar.a(khaVar);
                    } else {
                        l = z1bVar.e;
                        if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                            z1bVar.e = Long.valueOf(jCurrentTimeMillis);
                            z1bVar.a(khaVar);
                        }
                    }
                    objF2 = bj4Var3.f();
                    if (objF2 == c0187a) {
                        c33 c33Var = wd3.a;
                        objF2 = m78.a(bj4Var3.x(), bj4Var3);
                    }
                    t72Var = (t72) objF2;
                    objF3 = bj4Var3.f();
                    if (objF3 == c0187a) {
                        objF3 = new jw0();
                        bj4Var3.C(objF3);
                    }
                    fw0Var = (fw0) objF3;
                    objF4 = bj4Var3.f();
                    if (objF4 == c0187a) {
                        objF4 = new qga(z1bVar);
                        bj4Var3.C(objF4);
                    }
                    qgaVar = (qga) objF4;
                    qgaVar.b = ag7Var4;
                    qgaVar.c = u56Var6.v;
                    qgaVar.d = u56Var6;
                    qgaVar.e.setValue(khaVar);
                    qgaVar.w = new lja(j5);
                    qgaVar.g = (pf1) bj4Var3.F(qu1.f);
                    qgaVar.h = t72Var;
                    qgaVar.j = (xja) bj4Var3.F(qu1.r);
                    qgaVar.k = (st4) bj4Var3.F(qu1.l);
                    qgaVar.l = p94Var;
                    final boolean z26 = !z3;
                    qgaVar.m.setValue(Boolean.valueOf(z26));
                    qgaVar.n.setValue(Boolean.valueOf(z2));
                    bj4Var3.K(1966756105);
                    ad6Var = wjaVar2.a.k;
                    y0a y0aVar = q18.a;
                    bj4Var3.K(430530635);
                    if (Build.VERSION.SDK_INT < 28) {
                        bj4Var3.B();
                        j18Var = null;
                    } else {
                        context = (Context) bj4Var3.F(AndroidCompositionLocals_androidKt.b);
                        h72Var = (h72) bj4Var3.F(q18.a);
                        zJ = bj4Var3.J(h72Var) | bj4Var3.J(context) | bj4Var3.J(ad6Var);
                        objF5 = bj4Var3.f();
                        if (zJ || objF5 == c0187a) {
                            q18.b.getClass();
                            objF5 = new o18(h72Var, context, aa9.t, ad6Var);
                            bj4Var3.C(objF5);
                        }
                        j18Var = (j18) objF5;
                        bj4Var3.B();
                    }
                    qgaVar.i = j18Var;
                    bj4Var3.U(false);
                    u56Var6.b();
                    boolean zJ7 = bj4Var3.j(u56Var6);
                    i7 = i12 & 7168;
                    if (i7 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z27 = zJ7 | z7;
                    if ((i12 & 57344) == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z28 = z8 | z27;
                    xhaVar = xhaVar3;
                    boolean zJ8 = z28 | bj4Var3.j(xhaVar);
                    i8 = i13;
                    if (i8 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z9 | zJ8;
                    i9 = (i12 & 112) ^ 48;
                    if (i9 > 32) {
                        s85Var2 = s85Var;
                        if (!bj4Var3.J(s85Var2)) {
                            z11 = z10;
                            i10 = i9;
                        }
                        z12 = true;
                        zJ2 = z11 | z12 | bj4Var3.j(ag7Var4) | bj4Var3.j(t72Var) | bj4Var3.j(fw0Var) | bj4Var3.j(qgaVar);
                        objF6 = bj4Var3.f();
                        if (!zJ2 || objF6 == c0187a) {
                            bj4Var4 = bj4Var3;
                            u56Var2 = u56Var6;
                            z1bVar2 = z1bVar;
                            s85Var3 = s85Var2;
                            oh4 oh4Var3 = new oh4() { // from class: b62
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    sia siaVarD;
                                    v94 v94Var = (v94) obj;
                                    u56 u56Var7 = u56Var2;
                                    if (u56Var7.b() == v94Var.e()) {
                                        return g2b.a;
                                    }
                                    u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                                    boolean zB = u56Var7.b();
                                    kha khaVar4 = khaVar;
                                    ag7 ag7Var5 = ag7Var4;
                                    if (zB && z2 && !z3) {
                                        m62.g(xhaVar, u56Var7, khaVar4, s85Var3, ag7Var5);
                                    } else {
                                        m62.e(u56Var7);
                                    }
                                    if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                        oy0.d(t72Var, null, null, new j62(fw0Var, khaVar4, u56Var7, siaVarD, ag7Var5, null), 3);
                                    }
                                    if (!v94Var.e()) {
                                        qgaVar.g(null);
                                    }
                                    return g2b.a;
                                }
                            };
                            xhaVar = xhaVar;
                            ag7Var = ag7Var4;
                            qgaVar2 = qgaVar;
                            fw0Var2 = fw0Var;
                            z13 = z2;
                            khaVar3 = khaVar;
                            t72Var2 = t72Var;
                            bj4Var4.C(oh4Var3);
                            objF6 = oh4Var3;
                        } else {
                            qgaVar2 = qgaVar;
                            ag7Var = ag7Var4;
                            fw0Var2 = fw0Var;
                            u56Var2 = u56Var6;
                            khaVar3 = khaVar;
                            z13 = z2;
                            t72Var2 = t72Var;
                            s85Var3 = s85Var2;
                            z1bVar2 = z1bVar;
                            bj4Var4 = bj4Var3;
                        }
                        aVar2 = ox6.a.t;
                        ox6 ox6VarA3 = ia4.a(j84.c(ym2.b(aVar2, p94Var), (oh4) objF6), z13, h27Var);
                        if (z13 || z3) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        h37VarJ = bl7.j(Boolean.valueOf(z14), bj4Var4);
                        g2b g2bVar = g2b.a;
                        boolean zJ9 = bj4Var4.J(h37VarJ) | bj4Var4.j(u56Var2) | bj4Var4.j(xhaVar) | bj4Var4.j(qgaVar2);
                        if (i10 > 32 || !bj4Var4.J(s85Var3)) {
                            u56Var3 = u56Var2;
                            if ((r4 & 48) != 32) {
                                z15 = false;
                            }
                            z16 = zJ9 | z15;
                            Object objF18 = bj4Var4.f();
                            if (!z16 || objF18 == c0187a) {
                                u56Var4 = u56Var3;
                                g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                                bj4Var4.C(g62Var);
                            } else {
                                g62Var = objF18;
                                u56Var4 = u56Var3;
                            }
                            wd3.d(bj4Var4, (ci4) g62Var, g2bVar);
                            ox6VarB = t6a.b(aVar2, 8675309, new va9(new rfa(u56Var4)));
                            qgaVar3 = qgaVar2;
                            t72 t72Var3 = t72Var2;
                            ag7Var2 = ag7Var;
                            xhaVar2 = xhaVar;
                            r0 = new oh4() { // from class: sfa
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    xv9 xv9Var2;
                                    vf7 vf7Var = (vf7) obj;
                                    u56 u56Var7 = u56Var4;
                                    if (!u56Var7.b()) {
                                        p94.a(p94Var);
                                    } else if (!z3 && (xv9Var2 = u56Var7.c) != null) {
                                        xv9Var2.b();
                                    }
                                    if (u56Var7.b() && z2) {
                                        if (u56Var7.a() != bt4.u) {
                                            sia siaVarD = u56Var7.d();
                                            if (siaVarD != null) {
                                                long j6 = vf7Var.a;
                                                nd3 nd3Var2 = u56Var7.d;
                                                g75 g75Var = u56Var7.v;
                                                int iA = ag7Var2.a(siaVarD.b(j6, true));
                                                g75Var.invoke(kha.a(nd3Var2.a, null, ay.c(iA, iA), 5));
                                                if (u56Var7.a.a.u.length() > 0) {
                                                    u56Var7.k.setValue(bt4.v);
                                                }
                                            }
                                        } else {
                                            qgaVar3.g(vf7Var);
                                        }
                                    }
                                    return g2b.a;
                                }
                            };
                            if (z2) {
                                ox6VarB = it1.a(ox6VarB, new ei4() { // from class: vfa
                                    @Override // defpackage.ei4
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        jt1 jt1Var2 = (jt1) obj2;
                                        ((Integer) obj3).getClass();
                                        jt1Var2.K(-102778667);
                                        Object objF19 = jt1Var2.f();
                                        jt1.a.C0187a c0187a2 = jt1.a.a;
                                        if (objF19 == c0187a2) {
                                            c33 c33Var2 = wd3.a;
                                            nm8 nm8Var = new nm8(jt1Var2.x());
                                            jt1Var2.C(nm8Var);
                                            objF19 = nm8Var;
                                        }
                                        t72 t72Var4 = (t72) objF19;
                                        Object objF20 = jt1Var2.f();
                                        if (objF20 == c0187a2) {
                                            objF20 = bl7.i(null);
                                            jt1Var2.C(objF20);
                                        }
                                        final h37 h37Var = (h37) objF20;
                                        h37 h37VarJ2 = bl7.j(r0, jt1Var2);
                                        final h27 h27Var2 = h27Var;
                                        boolean zJ10 = jt1Var2.J(h27Var2);
                                        Object objF21 = jt1Var2.f();
                                        if (zJ10 || objF21 == c0187a2) {
                                            objF21 = new oh4() { // from class: wfa
                                                @Override // defpackage.oh4
                                                public final Object invoke(Object obj4) {
                                                    return new zfa(h37Var, h27Var2);
                                                }
                                            };
                                            jt1Var2.C(objF21);
                                        }
                                        wd3.a(h27Var2, (oh4) objF21, jt1Var2);
                                        boolean zJ11 = jt1Var2.j(t72Var4) | jt1Var2.J(h27Var2) | jt1Var2.J(h37VarJ2);
                                        Object objF22 = jt1Var2.f();
                                        if (zJ11 || objF22 == c0187a2) {
                                            objF22 = new yfa(t72Var4, h37Var, h27Var2, h37VarJ2);
                                            jt1Var2.C(objF22);
                                        }
                                        ox6 ox6VarB2 = t6a.b(ox6.a.t, h27Var2, (PointerInputEventHandler) objF22);
                                        jt1Var2.B();
                                        return ox6VarB2;
                                    }
                                });
                            }
                            ox6 ox6VarH2 = ox6VarB.H(new q6a(qgaVar3.A, qgaVar3.z, new tfa(qgaVar3), 4));
                            w48.a.getClass();
                            ox6 ox6VarC = by5.c(ox6VarH2, y48.u);
                            final ox6 ox6VarC2 = z63.c(aVar2, new oh4() { // from class: t52
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    d73 d73Var = (d73) obj;
                                    u56 u56Var7 = u56Var4;
                                    sia siaVarD = u56Var7.d();
                                    if (siaVarD != null) {
                                        n41 n41VarA = d73Var.Y0().a();
                                        long j6 = ((lja) u56Var7.A.getValue()).a;
                                        long j7 = ((lja) u56Var7.B.getValue()).a;
                                        ria riaVar = siaVarD.a;
                                        l07 l07Var = riaVar.b;
                                        qia qiaVar = riaVar.a;
                                        np npVar = u56Var7.y;
                                        long j8 = u56Var7.z;
                                        boolean zC2 = lja.c(j6);
                                        ag7 ag7Var5 = ag7Var2;
                                        if (!zC2) {
                                            npVar.f(j8);
                                            int iB3 = ag7Var5.b(lja.f(j6));
                                            int iB4 = ag7Var5.b(lja.e(j6));
                                            if (iB3 != iB4) {
                                                n41VarA.c(riaVar.i(iB3, iB4), npVar);
                                            }
                                        } else if (lja.c(j7)) {
                                            kha khaVar4 = khaVar3;
                                            if (!lja.c(khaVar4.b)) {
                                                npVar.f(j8);
                                                long j9 = khaVar4.b;
                                                int iB5 = ag7Var5.b(lja.f(j9));
                                                int iB6 = ag7Var5.b(lja.e(j9));
                                                if (iB5 != iB6) {
                                                    n41VarA.c(riaVar.i(iB5, iB6), npVar);
                                                }
                                            }
                                        } else {
                                            long jB = qiaVar.b.b();
                                            uh1 uh1Var = new uh1(jB);
                                            if (jB == 16) {
                                                uh1Var = null;
                                            }
                                            long j10 = uh1Var != null ? uh1Var.a : uh1.b;
                                            npVar.f(uh1.b(uh1.d(j10) * 0.2f, j10));
                                            int iB7 = ag7Var5.b(lja.f(j7));
                                            int iB8 = ag7Var5.b(lja.e(j7));
                                            if (iB7 != iB8) {
                                                n41VarA.c(riaVar.i(iB7, iB8), npVar);
                                            }
                                        }
                                        boolean z29 = riaVar.d() && qiaVar.f != 3;
                                        if (z29) {
                                            long j11 = riaVar.c;
                                            sk8 sk8VarA = tk8.a(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                            n41VarA.f();
                                            n41VarA.r(sk8VarA);
                                        }
                                        ww9 ww9Var = qiaVar.b.a;
                                        fda fdaVar = ww9Var.m;
                                        mha mhaVar = ww9Var.a;
                                        if (fdaVar == null) {
                                            fdaVar = fda.b;
                                        }
                                        fda fdaVar2 = fdaVar;
                                        el9 el9Var = ww9Var.n;
                                        if (el9Var == null) {
                                            el9Var = el9.d;
                                        }
                                        el9 el9Var2 = el9Var;
                                        e73 e73Var = ww9Var.p;
                                        if (e73Var == null) {
                                            e73Var = zy3.a;
                                        }
                                        e73 e73Var2 = e73Var;
                                        try {
                                            fx0 fx0VarE = mhaVar.e();
                                            mha.a aVar5 = mha.a.a;
                                            if (fx0VarE != null) {
                                                l07.j(l07Var, n41VarA, fx0VarE, mhaVar != aVar5 ? mhaVar.a() : 1.0f, el9Var2, fdaVar2, e73Var2);
                                            } else {
                                                l07.i(l07Var, n41VarA, mhaVar != aVar5 ? mhaVar.c() : uh1.b, el9Var2, fdaVar2, e73Var2);
                                            }
                                        } finally {
                                            if (z29) {
                                                n41VarA.o();
                                            }
                                        }
                                    }
                                    return g2b.a;
                                }
                            });
                            boolean zJ10 = bj4Var4.j(u56Var4);
                            if (i7 == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean zJ11 = zJ10 | z17 | bj4Var4.J(mmbVar) | bj4Var4.j(qgaVar3);
                            if (i8 == 4) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zJ3 = zJ11 | z18 | bj4Var4.j(ag7Var2);
                            objF7 = bj4Var4.f();
                            if (zJ3 || objF7 == r6) {
                                final kha khaVar4 = khaVar3;
                                oh4 oh4Var4 = new oh4() { // from class: c62
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        gia giaVar2;
                                        qq5 qq5Var;
                                        qq5 qq5Var2;
                                        u56 u56Var7 = u56Var4;
                                        dt7 dt7Var = u56Var7.o;
                                        qq5 qq5Var3 = (qq5) obj;
                                        u56Var7.h = qq5Var3;
                                        sia siaVarD = u56Var7.d();
                                        if (siaVarD != null) {
                                            siaVarD.b = qq5Var3;
                                        }
                                        if (z2) {
                                            bt4 bt4VarA = u56Var7.a();
                                            bt4 bt4Var = bt4.u;
                                            qga qgaVar4 = qgaVar3;
                                            kha khaVar5 = khaVar4;
                                            if (bt4VarA == bt4Var) {
                                                if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                                    qgaVar4.r();
                                                } else {
                                                    qgaVar4.o();
                                                }
                                                u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                                u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                                dt7Var.setValue(Boolean.valueOf(lja.c(khaVar5.b)));
                                            } else if (u56Var7.a() == bt4.v) {
                                                dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                            }
                                            ag7 ag7Var5 = ag7Var2;
                                            m62.f(u56Var7, khaVar5, ag7Var5);
                                            sia siaVarD2 = u56Var7.d();
                                            if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                                ria riaVar = siaVarD2.a;
                                                zda zdaVar = new zda(qq5Var);
                                                sk8 sk8VarA = fb9.a(qq5Var);
                                                sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                                if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                                    giaVar2.b.c(khaVar5, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                                }
                                            }
                                        }
                                        return g2b.a;
                                    }
                                };
                                bj4Var4.C(oh4Var4);
                                objF7 = oh4Var4;
                            }
                            final ox6 ox6VarB2 = oh7.b(aVar2, (oh4) objF7);
                            u56Var5 = u56Var4;
                            p62 p62Var = new p62(mvaVar, khaVar, u56Var5, z3, z2, ag7Var2, qgaVar3, s85Var, p94Var);
                            if (!z2 && !z3 && mmbVar.a() && lja.c(((lja) u56Var5.A.getValue()).a) && lja.c(((lja) u56Var5.B.getValue()).a)) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                ox6VarA = it1.a(aVar2, new ei4() { // from class: qda
                                    /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
                                    @Override // defpackage.ei4
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        Object objE;
                                        ox6 ox6Var2 = (ox6) obj;
                                        jt1 jt1Var2 = (jt1) obj2;
                                        ((Integer) obj3).getClass();
                                        jt1Var2.K(-84507373);
                                        boolean zBooleanValue2 = ((Boolean) jt1Var2.F(qu1.x)).booleanValue();
                                        boolean zC2 = jt1Var2.c(zBooleanValue2);
                                        Object objF19 = jt1Var2.f();
                                        jt1.a.C0187a c0187a2 = jt1.a.a;
                                        if (zC2 || objF19 == c0187a2) {
                                            objF19 = new cd2(zBooleanValue2);
                                            jt1Var2.C(objF19);
                                        }
                                        final cd2 cd2Var = (cd2) objF19;
                                        final fx0 fx0Var3 = fx0Var;
                                        boolean z29 = ((fx0Var3 instanceof aw9) && ((aw9) fx0Var3).a == 16) ? false : true;
                                        if (((mmb) jt1Var2.F(qu1.u)).a()) {
                                            final u56 u56Var7 = u56Var5;
                                            if (u56Var7.b()) {
                                                final kha khaVar5 = khaVar;
                                                if (lja.c(khaVar5.b) && z29) {
                                                    jt1Var2.K(-707487962);
                                                    iw iwVar5 = khaVar5.a;
                                                    lja ljaVar3 = new lja(khaVar5.b);
                                                    boolean zJ12 = jt1Var2.j(cd2Var);
                                                    Object objF20 = jt1Var2.f();
                                                    if (zJ12 || objF20 == c0187a2) {
                                                        objF20 = new sda(cd2Var, null);
                                                        jt1Var2.C(objF20);
                                                    }
                                                    wd3.f(iwVar5, ljaVar3, (ci4) objF20, jt1Var2);
                                                    boolean zJ13 = jt1Var2.j(cd2Var);
                                                    final ag7 ag7Var5 = ag7Var2;
                                                    boolean zJ14 = jt1Var2.j(ag7Var5) | zJ13 | jt1Var2.J(khaVar5) | jt1Var2.j(u56Var7) | jt1Var2.J(fx0Var3);
                                                    Object objF21 = jt1Var2.f();
                                                    if (zJ14 || objF21 == c0187a2) {
                                                        oh4 oh4Var5 = new oh4() { // from class: rda
                                                            @Override // defpackage.oh4
                                                            public final Object invoke(Object obj4) {
                                                                cz1 cz1Var = (cz1) obj4;
                                                                cz1Var.K1();
                                                                float fH = cd2Var.c.h();
                                                                if (fH != 0.0f) {
                                                                    long j6 = khaVar5.b;
                                                                    int i15 = lja.c;
                                                                    int iB3 = ag7Var5.b((int) (j6 >> 32));
                                                                    sia siaVarD = u56Var7.d();
                                                                    sk8 sk8VarC = siaVarD != null ? siaVarD.a.c(iB3) : new sk8(0.0f, 0.0f, 0.0f, 0.0f);
                                                                    float fFloor = (float) Math.floor(cz1Var.U0(2.0f));
                                                                    float f = fFloor < 1.0f ? 1.0f : fFloor;
                                                                    float f2 = f / 2.0f;
                                                                    float f3 = sk8VarC.a + f2;
                                                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() >> 32)) - f2;
                                                                    if (f3 > fIntBitsToFloat) {
                                                                        f3 = fIntBitsToFloat;
                                                                    }
                                                                    if (f3 >= f2) {
                                                                        f2 = f3;
                                                                    }
                                                                    float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                                                                    cz1Var.T0(fx0Var3, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.d)) & 4294967295L), f, fH);
                                                                }
                                                                return g2b.a;
                                                            }
                                                        };
                                                        jt1Var2.C(oh4Var5);
                                                        objF21 = oh4Var5;
                                                    }
                                                    objE = z63.e(ox6Var2, (oh4) objF21);
                                                    jt1Var2.B();
                                                } else {
                                                    jt1Var2.K(-705473241);
                                                    jt1Var2.B();
                                                    objE = ox6.a.t;
                                                }
                                            } else {
                                                jt1Var2.K(-705473241);
                                                jt1Var2.B();
                                                objE = ox6.a.t;
                                            }
                                        } else {
                                            jt1Var2.K(-705473241);
                                            jt1Var2.B();
                                            objE = ox6.a.t;
                                        }
                                        jt1Var2.B();
                                        return objE;
                                    }
                                });
                            } else {
                                ox6VarA = aVar2;
                            }
                            zJ4 = bj4Var4.j(qgaVar3);
                            objF8 = bj4Var4.f();
                            if (zJ4 || objF8 == r6) {
                                objF8 = new oh4() { // from class: d62
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return new k62(qgaVar3);
                                    }
                                };
                                bj4Var4.C(objF8);
                            }
                            wd3.a(qgaVar3, (oh4) objF8, bj4Var4);
                            boolean zJ12 = bj4Var4.j(u56Var5) | bj4Var4.j(xhaVar2);
                            if (i8 == 4) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            z21 = zJ12 | z20 | ((i10 <= 32 && bj4Var4.J(s85Var)) || (i12 & 48) == 32);
                            objF9 = bj4Var4.f();
                            if (z21 || objF9 == r6) {
                                objF9 = new oh4() { // from class: e62
                                    /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        u56 u56Var7 = u56Var5;
                                        if (u56Var7.b()) {
                                            nd3 nd3Var2 = u56Var7.d;
                                            g75 g75Var = u56Var7.v;
                                            s56 s56Var = u56Var7.w;
                                            gl8 gl8Var = new gl8();
                                            yda ydaVar = new yda(nd3Var2, g75Var, gl8Var);
                                            xha xhaVar4 = xhaVar2;
                                            y18 y18Var = xhaVar4.a;
                                            y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                            ?? giaVar2 = new gia(xhaVar4, y18Var);
                                            xhaVar4.b.set((gia) giaVar2);
                                            gl8Var.t = giaVar2;
                                            u56Var7.e = giaVar2;
                                        }
                                        return new l62();
                                    }
                                };
                                bj4Var4.C(objF9);
                            }
                            wd3.a(s85Var, (oh4) objF9, bj4Var4);
                            final g75 g75Var = u56Var5.v;
                            if (i == 1) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            final int i15 = s85Var.e;
                            final z1b z1bVar3 = z1bVar2;
                            ox6 ox6VarA4 = it1.a(aVar2, new ei4() { // from class: cfa
                                @Override // defpackage.ei4
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    jt1 jt1Var2 = (jt1) obj2;
                                    ((Integer) obj3).getClass();
                                    jt1Var2.K(851809892);
                                    Object objF19 = jt1Var2.f();
                                    jt1.a.C0187a c0187a2 = jt1.a.a;
                                    if (objF19 == c0187a2) {
                                        objF19 = new kja();
                                        jt1Var2.C(objF19);
                                    }
                                    kja kjaVar = (kja) objF19;
                                    Object objF20 = jt1Var2.f();
                                    if (objF20 == c0187a2) {
                                        objF20 = new vm2();
                                        jt1Var2.C(objF20);
                                    }
                                    bfa bfaVar = new bfa(u56Var5, qgaVar3, khaVar, z26, z22, kjaVar, ag7Var2, z1bVar3, (vm2) objF20, g75Var, i15);
                                    boolean zJ13 = jt1Var2.j(bfaVar);
                                    Object objF21 = jt1Var2.f();
                                    if (zJ13 || objF21 == c0187a2) {
                                        dfa dfaVar = new dfa(1, bfaVar, bfa.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                                        jt1Var2.C(dfaVar);
                                        objF21 = dfaVar;
                                    }
                                    qo5 qo5Var = new qo5((oh4) ((yn5) objF21), null);
                                    jt1Var2.B();
                                    return qo5Var;
                                }
                            });
                            i11 = s85Var.d;
                            if (i11 == 7 && i11 != 8) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            zBooleanValue = ((Boolean) h37VarJ.getValue()).booleanValue();
                            zC = bj4Var4.c(z23) | bj4Var4.j(n56Var);
                            objF10 = bj4Var4.f();
                            if (zC || objF10 == r6) {
                                objF10 = new mh4() { // from class: f62
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        if (z23) {
                                            n56Var.i();
                                        }
                                        return g2b.a;
                                    }
                                };
                                bj4Var4.C(objF10);
                            }
                            mh4 mh4Var = (mh4) objF10;
                            if (zBooleanValue || !p3a.a) {
                                ox6VarH = aVar2;
                            } else {
                                ox6VarH = (z23 ? new q3a(n3a.a) : aVar2).H(new m3a(mh4Var));
                            }
                            fx0Var2 = (fx0) bj4Var4.F(lf0.a);
                            j2 = ((uh1) bj4Var4.F(lf0.b)).a;
                            if (uh1.c(j2, u7d.c(1308617531))) {
                                aw9Var = fx0Var2;
                            } else {
                                aw9Var = new aw9(j2);
                            }
                            zJ5 = bj4Var4.j(u56Var5) | bj4Var4.J(aw9Var);
                            objF11 = bj4Var4.f();
                            if (!zJ5 || objF11 == r6) {
                                z24 = false;
                                objF11 = new r52(0, u56Var5, aw9Var);
                                bj4Var4.C(objF11);
                            } else {
                                z24 = false;
                            }
                            ox6 ox6VarH3 = oh7.b(it1.a(ro5.a(ro5.a(ox6Var.H(z63.e(aVar2, (oh4) objF11)).H(new f56(n56Var, u56Var5, qgaVar3)).H(ox6VarH).H(ox6VarA3), new cea(d94Var, u56Var5)), new o62(u56Var5, qgaVar3)).H(ox6VarA4), new ei4() { // from class: bga
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.ei4
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    gga ggaVar2 = ggaVar;
                                    dt7 dt7Var = ggaVar2.f;
                                    jt1 jt1Var2 = (jt1) obj2;
                                    ((Integer) obj3).getClass();
                                    jt1Var2.K(-2137546592);
                                    boolean z29 = ((fl7) dt7Var.getValue()) == fl7.t || !(jt1Var2.F(qu1.n) == tq5.u);
                                    boolean zJ13 = jt1Var2.J(ggaVar2);
                                    Object objF19 = jt1Var2.f();
                                    jt1.a.C0187a c0187a2 = jt1.a.a;
                                    if (zJ13 || objF19 == c0187a2) {
                                        objF19 = new a26(1, ggaVar2);
                                        jt1Var2.C(objF19);
                                    }
                                    h37 h37VarJ2 = bl7.j((oh4) objF19, jt1Var2);
                                    Object objF20 = jt1Var2.f();
                                    if (objF20 == c0187a2) {
                                        ht2 ht2Var = new ht2(new r58(1, h37VarJ2));
                                        jt1Var2.C(ht2Var);
                                        objF20 = ht2Var;
                                    }
                                    s79 s79Var = (s79) objF20;
                                    boolean zJ14 = jt1Var2.J(s79Var) | jt1Var2.J(ggaVar2);
                                    Object objF21 = jt1Var2.f();
                                    if (zJ14 || objF21 == c0187a2) {
                                        objF21 = new cga(s79Var, ggaVar2);
                                        jt1Var2.C(objF21);
                                    }
                                    ox6 ox6VarB3 = d79.b((cga) objF21, (fl7) dt7Var.getValue(), z2 && ggaVar2.b.h() != 0.0f, z29, h27Var);
                                    jt1Var2.B();
                                    return ox6VarB3;
                                }
                            }).H(ox6VarC).H(p62Var), new j11(1, u56Var5)).H(new mb(new d11(1, qgaVar3, t72Var3)));
                            if (z2 && u56Var5.b() && ((Boolean) u56Var5.q.getValue()).booleanValue() && r3.a()) {
                                z24 = true;
                            }
                            if (z24 || !yf6.a()) {
                                ox6VarA2 = aVar2;
                            } else {
                                ox6VarA2 = it1.a(aVar2, new ei4() { // from class: vga
                                    @Override // defpackage.ei4
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        ox6 ox6Var2 = (ox6) obj;
                                        jt1 jt1Var2 = (jt1) obj2;
                                        ((Integer) obj3).getClass();
                                        jt1Var2.K(1980580247);
                                        tx2 tx2Var4 = (tx2) jt1Var2.F(qu1.h);
                                        Object objF19 = jt1Var2.f();
                                        jt1.a.C0187a c0187a2 = jt1.a.a;
                                        if (objF19 == c0187a2) {
                                            objF19 = bl7.i(new kg5(0L));
                                            jt1Var2.C(objF19);
                                        }
                                        final h37 h37Var = (h37) objF19;
                                        final qga qgaVar4 = qgaVar3;
                                        boolean zJ13 = jt1Var2.j(qgaVar4);
                                        Object objF20 = jt1Var2.f();
                                        if (zJ13 || objF20 == c0187a2) {
                                            objF20 = new mh4() { // from class: yga
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // defpackage.mh4
                                                public final Object invoke() {
                                                    long j6;
                                                    sia siaVarD;
                                                    u56 u56Var7;
                                                    iw iwVar5;
                                                    long j7 = ((kg5) h37Var.getValue()).a;
                                                    qga qgaVar5 = qgaVar4;
                                                    vf7 vf7VarI = qgaVar5.i();
                                                    long jFloatToRawIntBits = 9205357640488583168L;
                                                    if (vf7VarI != null) {
                                                        long j8 = vf7VarI.a;
                                                        iw iwVarM = qgaVar5.m();
                                                        if (iwVarM != null && iwVarM.u.length() != 0) {
                                                            ys4 ys4Var = (ys4) qgaVar5.r.getValue();
                                                            int i16 = ys4Var == null ? -1 : uga.c.a[ys4Var.ordinal()];
                                                            if (i16 != -1) {
                                                                if (i16 == 1 || i16 == 2) {
                                                                    long j9 = qgaVar5.n().b;
                                                                    int i17 = lja.c;
                                                                    j6 = j9 >> 32;
                                                                } else {
                                                                    if (i16 != 3) {
                                                                        u.b();
                                                                        return null;
                                                                    }
                                                                    long j10 = qgaVar5.n().b;
                                                                    int i18 = lja.c;
                                                                    j6 = j10 & 4294967295L;
                                                                }
                                                                int i19 = (int) j6;
                                                                u56 u56Var8 = qgaVar5.d;
                                                                if (u56Var8 != null && (siaVarD = u56Var8.d()) != null && (u56Var7 = qgaVar5.d) != null && (iwVar5 = u56Var7.a.a) != null) {
                                                                    int iG = uh8.g(qgaVar5.b.b(i19), 0, iwVar5.u.length());
                                                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (siaVarD.d(j8) >> 32));
                                                                    ria riaVar = siaVarD.a;
                                                                    l07 l07Var = riaVar.b;
                                                                    int iD = l07Var.d(iG);
                                                                    float fE = riaVar.e(iD);
                                                                    float f = riaVar.f(iD);
                                                                    float f2 = uh8.f(fIntBitsToFloat, Math.min(fE, f), Math.max(fE, f));
                                                                    if (kg5.b(j7, 0L) || Math.abs(fIntBitsToFloat - f2) <= ((int) (j7 >> 32)) / 2) {
                                                                        float f3 = l07Var.f(iD);
                                                                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(((l07Var.b(iD) - f3) / 2.0f) + f3)) & 4294967295L);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return new vf7(jFloatToRawIntBits);
                                                }
                                            };
                                            jt1Var2.C(objF20);
                                        }
                                        final mh4 mh4Var2 = (mh4) objF20;
                                        boolean zJ14 = jt1Var2.J(tx2Var4);
                                        Object objF21 = jt1Var2.f();
                                        if (zJ14 || objF21 == c0187a2) {
                                            objF21 = new up7(1, tx2Var4, h37Var);
                                            jt1Var2.C(objF21);
                                        }
                                        final oh4 oh4Var5 = (oh4) objF21;
                                        cw cwVar = eb9.a;
                                        ox6 ox6VarA5 = it1.a(ox6Var2, new ei4() { // from class: bb9
                                            @Override // defpackage.ei4
                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                jt1 jt1Var3 = (jt1) obj5;
                                                ((Integer) obj6).getClass();
                                                jt1Var3.K(759876635);
                                                Object objF22 = jt1Var3.f();
                                                jt1.a.C0187a c0187a3 = jt1.a.a;
                                                if (objF22 == c0187a3) {
                                                    objF22 = bl7.f(mh4Var2);
                                                    jt1Var3.C(objF22);
                                                }
                                                yz9 yz9Var = (yz9) objF22;
                                                Object objF23 = jt1Var3.f();
                                                if (objF23 == c0187a3) {
                                                    objF23 = new qt(new vf7(((vf7) yz9Var.getValue()).a), eb9.b, new vf7(eb9.c), 8);
                                                    jt1Var3.C(objF23);
                                                }
                                                qt qtVar = (qt) objF23;
                                                g2b g2bVar2 = g2b.a;
                                                boolean zJ15 = jt1Var3.j(qtVar);
                                                Object objF24 = jt1Var3.f();
                                                if (zJ15 || objF24 == c0187a3) {
                                                    objF24 = new db9(yz9Var, qtVar, null);
                                                    jt1Var3.C(objF24);
                                                }
                                                wd3.d(jt1Var3, (ci4) objF24, g2bVar2);
                                                Object obj7 = qtVar.c;
                                                boolean zJ16 = jt1Var3.J(obj7);
                                                Object objF25 = jt1Var3.f();
                                                if (zJ16 || objF25 == c0187a3) {
                                                    objF25 = new ll2(1, obj7);
                                                    jt1Var3.C(objF25);
                                                }
                                                ox6 ox6Var3 = (ox6) oh4Var5.invoke((mh4) objF25);
                                                jt1Var3.B();
                                                return ox6Var3;
                                            }
                                        });
                                        jt1Var2.B();
                                        return ox6VarA5;
                                    }
                                });
                            }
                            final boolean z29 = z24;
                            bj4 bj4Var5 = bj4Var4;
                            final fw0 fw0Var3 = fw0Var2;
                            final ox6 ox6Var2 = ox6VarA2;
                            final tx2 tx2Var4 = tx2Var2;
                            final ox6 ox6Var3 = ox6VarA;
                            ci4 ci4Var = new ci4() { // from class: z52
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    jt1 jt1Var2 = (jt1) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        final u56 u56Var7 = u56Var5;
                                        final wja wjaVar3 = wjaVar;
                                        final int i16 = i2;
                                        final int i17 = i;
                                        final gga ggaVar2 = ggaVar;
                                        final kha khaVar5 = khaVar;
                                        final ojb ojbVar2 = ojbVar;
                                        final ox6 ox6Var4 = ox6Var3;
                                        final ox6 ox6Var5 = ox6VarC2;
                                        final ox6 ox6Var6 = ox6VarB2;
                                        final ox6 ox6Var7 = ox6Var2;
                                        final fw0 fw0Var4 = fw0Var3;
                                        final qga qgaVar4 = qgaVar3;
                                        final boolean z30 = z29;
                                        final boolean z31 = z3;
                                        final oh4 oh4Var5 = oh4Var2;
                                        final ag7 ag7Var5 = ag7Var2;
                                        final tx2 tx2Var5 = tx2Var4;
                                        ei4Var.invoke(gr1.b(-44346382, new ci4() { // from class: u52
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // defpackage.ci4
                                            public final Object invoke(Object obj3, Object obj4) {
                                                ox6 kebVar;
                                                jt1 jt1Var3 = (jt1) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                if (jt1Var3.A(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    final u56 u56Var8 = u56Var7;
                                                    ox6 ox6VarE = ir9.e(ox6.a.t, ((y43) u56Var8.g.getValue()).t, 0.0f, 2);
                                                    int i18 = i16;
                                                    final int i19 = i17;
                                                    cv4.a(i18, i19);
                                                    wja wjaVar4 = wjaVar3;
                                                    if (i18 != 1 || i19 != Integer.MAX_VALUE) {
                                                        ox6VarE = ox6VarE.H(new bv4(wjaVar4, i18, i19));
                                                    }
                                                    boolean zJ13 = jt1Var3.j(u56Var8);
                                                    Object objF19 = jt1Var3.f();
                                                    if (zJ13 || objF19 == jt1.a.a) {
                                                        objF19 = new w01(1, u56Var8);
                                                        jt1Var3.C(objF19);
                                                    }
                                                    mh4 mh4Var2 = (mh4) objF19;
                                                    gga ggaVar3 = ggaVar2;
                                                    fl7 fl7Var3 = (fl7) ggaVar3.f.getValue();
                                                    final kha khaVar6 = khaVar5;
                                                    long j6 = khaVar6.b;
                                                    int i20 = lja.c;
                                                    int iF = (int) (j6 >> 32);
                                                    long j7 = ggaVar3.e;
                                                    if (iF == ((int) (j7 >> 32)) && (iF = (int) (j6 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                                                        iF = lja.f(j6);
                                                    }
                                                    ggaVar3.e = khaVar6.b;
                                                    mva mvaVarA2 = n7b.a(ojbVar2, khaVar6.a);
                                                    int iOrdinal = fl7Var3.ordinal();
                                                    if (iOrdinal == 0) {
                                                        kebVar = new keb(ggaVar3, iF, mvaVarA2, mh4Var2);
                                                    } else {
                                                        if (iOrdinal != 1) {
                                                            u.b();
                                                            return null;
                                                        }
                                                        kebVar = new l15(ggaVar3, iF, mvaVarA2, mh4Var2);
                                                    }
                                                    ox6 ox6VarA5 = kw0.a(uma.b(ox6VarE).H(kebVar).H(ox6Var4).H(ox6Var5).H(new gha(wjaVar4)).H(ox6Var6).H(ox6Var7), fw0Var4);
                                                    final qga qgaVar5 = qgaVar4;
                                                    final boolean z32 = z30;
                                                    final boolean z33 = z31;
                                                    final oh4 oh4Var6 = oh4Var5;
                                                    final ag7 ag7Var6 = ag7Var5;
                                                    final tx2 tx2Var6 = tx2Var5;
                                                    lp9.a(ox6VarA5, gr1.b(1412697320, new ci4() { // from class: v52
                                                        /* JADX WARN: Code duplicated, block: B:22:0x0099  */
                                                        @Override // defpackage.ci4
                                                        public final Object invoke(Object obj5, Object obj6) {
                                                            boolean z34;
                                                            jt1 jt1Var4 = (jt1) obj5;
                                                            int iIntValue3 = ((Integer) obj6).intValue();
                                                            if (jt1Var4.A(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                u56 u56Var9 = u56Var8;
                                                                i62 i62Var = new i62(u56Var9, oh4Var6, khaVar6, ag7Var6, tx2Var6, i19);
                                                                int iHashCode = Long.hashCode(jt1Var4.v());
                                                                kw7 kw7VarY = jt1Var4.y();
                                                                ox6 ox6VarC3 = it1.c(jt1Var4, ox6.a.t);
                                                                bt1.c.getClass();
                                                                qr5.a aVar5 = bt1.a.b;
                                                                if (jt1Var4.s() == null) {
                                                                    ml5.c();
                                                                    throw null;
                                                                }
                                                                jt1Var4.q();
                                                                if (jt1Var4.l()) {
                                                                    jt1Var4.k(aVar5);
                                                                } else {
                                                                    jt1Var4.z();
                                                                }
                                                                rd7.d(jt1Var4, bt1.a.f, i62Var);
                                                                rd7.d(jt1Var4, bt1.a.e, kw7VarY);
                                                                rd7.d(jt1Var4, bt1.a.g, Integer.valueOf(iHashCode));
                                                                rd7.c(jt1Var4, bt1.a.h);
                                                                rd7.d(jt1Var4, bt1.a.d, ox6VarC3);
                                                                jt1Var4.I();
                                                                bt4 bt4VarA = u56Var9.a();
                                                                bt4 bt4Var = bt4.t;
                                                                boolean z35 = z32;
                                                                if (bt4VarA != bt4Var && u56Var9.c() != null) {
                                                                    qq5 qq5VarC = u56Var9.c();
                                                                    qq5VarC.getClass();
                                                                    z34 = qq5VarC.e() && z35;
                                                                }
                                                                qga qgaVar6 = qgaVar5;
                                                                m62.c(qgaVar6, z34, jt1Var4, 0);
                                                                if (u56Var9.a() == bt4.v && !z33 && z35) {
                                                                    jt1Var4.K(-714666198);
                                                                    m62.d(qgaVar6, jt1Var4, 0);
                                                                    jt1Var4.B();
                                                                } else {
                                                                    jt1Var4.K(-714589318);
                                                                    jt1Var4.B();
                                                                }
                                                            } else {
                                                                jt1Var4.u();
                                                            }
                                                            return g2b.a;
                                                        }
                                                    }, jt1Var3), jt1Var3, 48);
                                                } else {
                                                    jt1Var3.u();
                                                }
                                                return g2b.a;
                                            }
                                        }, jt1Var2), jt1Var2, 6);
                                    } else {
                                        jt1Var2.u();
                                    }
                                    return g2b.a;
                                }
                            };
                            bj4Var = bj4Var5;
                            b(ox6VarH3, qgaVar3, gr1.b(-814563849, ci4Var, bj4Var), bj4Var, 384);
                        } else {
                            u56Var3 = u56Var2;
                        }
                        z15 = true;
                        z16 = zJ9 | z15;
                        Object objF19 = bj4Var4.f();
                        if (z16) {
                            u56Var4 = u56Var3;
                            g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                            bj4Var4.C(g62Var);
                        } else {
                            u56Var4 = u56Var3;
                            g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                            bj4Var4.C(g62Var);
                        }
                        wd3.d(bj4Var4, (ci4) g62Var, g2bVar);
                        ox6VarB = t6a.b(aVar2, 8675309, new va9(new rfa(u56Var4)));
                        qgaVar3 = qgaVar2;
                        t72 t72Var4 = t72Var2;
                        ag7Var2 = ag7Var;
                        xhaVar2 = xhaVar;
                        r0 = new oh4() { // from class: sfa
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                xv9 xv9Var2;
                                vf7 vf7Var = (vf7) obj;
                                u56 u56Var7 = u56Var4;
                                if (!u56Var7.b()) {
                                    p94.a(p94Var);
                                } else if (!z3 && (xv9Var2 = u56Var7.c) != null) {
                                    xv9Var2.b();
                                }
                                if (u56Var7.b() && z2) {
                                    if (u56Var7.a() != bt4.u) {
                                        sia siaVarD = u56Var7.d();
                                        if (siaVarD != null) {
                                            long j6 = vf7Var.a;
                                            nd3 nd3Var2 = u56Var7.d;
                                            g75 g75Var2 = u56Var7.v;
                                            int iA = ag7Var2.a(siaVarD.b(j6, true));
                                            g75Var2.invoke(kha.a(nd3Var2.a, null, ay.c(iA, iA), 5));
                                            if (u56Var7.a.a.u.length() > 0) {
                                                u56Var7.k.setValue(bt4.v);
                                            }
                                        }
                                    } else {
                                        qgaVar3.g(vf7Var);
                                    }
                                }
                                return g2b.a;
                            }
                        };
                        if (z2) {
                            ox6VarB = it1.a(ox6VarB, new ei4() { // from class: vfa
                                @Override // defpackage.ei4
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    jt1 jt1Var2 = (jt1) obj2;
                                    ((Integer) obj3).getClass();
                                    jt1Var2.K(-102778667);
                                    Object objF110 = jt1Var2.f();
                                    jt1.a.C0187a c0187a2 = jt1.a.a;
                                    if (objF110 == c0187a2) {
                                        c33 c33Var2 = wd3.a;
                                        nm8 nm8Var = new nm8(jt1Var2.x());
                                        jt1Var2.C(nm8Var);
                                        objF110 = nm8Var;
                                    }
                                    t72 t72Var5 = (t72) objF110;
                                    Object objF20 = jt1Var2.f();
                                    if (objF20 == c0187a2) {
                                        objF20 = bl7.i(null);
                                        jt1Var2.C(objF20);
                                    }
                                    final h37 h37Var = (h37) objF20;
                                    h37 h37VarJ2 = bl7.j(r0, jt1Var2);
                                    final h27 h27Var2 = h27Var;
                                    boolean zJ13 = jt1Var2.J(h27Var2);
                                    Object objF21 = jt1Var2.f();
                                    if (zJ13 || objF21 == c0187a2) {
                                        objF21 = new oh4() { // from class: wfa
                                            @Override // defpackage.oh4
                                            public final Object invoke(Object obj4) {
                                                return new zfa(h37Var, h27Var2);
                                            }
                                        };
                                        jt1Var2.C(objF21);
                                    }
                                    wd3.a(h27Var2, (oh4) objF21, jt1Var2);
                                    boolean zJ14 = jt1Var2.j(t72Var5) | jt1Var2.J(h27Var2) | jt1Var2.J(h37VarJ2);
                                    Object objF22 = jt1Var2.f();
                                    if (zJ14 || objF22 == c0187a2) {
                                        objF22 = new yfa(t72Var5, h37Var, h27Var2, h37VarJ2);
                                        jt1Var2.C(objF22);
                                    }
                                    ox6 ox6VarB3 = t6a.b(ox6.a.t, h27Var2, (PointerInputEventHandler) objF22);
                                    jt1Var2.B();
                                    return ox6VarB3;
                                }
                            });
                        }
                        ox6 ox6VarH4 = ox6VarB.H(new q6a(qgaVar3.A, qgaVar3.z, new tfa(qgaVar3), 4));
                        w48.a.getClass();
                        ox6 ox6VarC3 = by5.c(ox6VarH4, y48.u);
                        final ox6 ox6VarC4 = z63.c(aVar2, new oh4() { // from class: t52
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                d73 d73Var = (d73) obj;
                                u56 u56Var7 = u56Var4;
                                sia siaVarD = u56Var7.d();
                                if (siaVarD != null) {
                                    n41 n41VarA = d73Var.Y0().a();
                                    long j6 = ((lja) u56Var7.A.getValue()).a;
                                    long j7 = ((lja) u56Var7.B.getValue()).a;
                                    ria riaVar = siaVarD.a;
                                    l07 l07Var = riaVar.b;
                                    qia qiaVar = riaVar.a;
                                    np npVar = u56Var7.y;
                                    long j8 = u56Var7.z;
                                    boolean zC2 = lja.c(j6);
                                    ag7 ag7Var5 = ag7Var2;
                                    if (!zC2) {
                                        npVar.f(j8);
                                        int iB3 = ag7Var5.b(lja.f(j6));
                                        int iB4 = ag7Var5.b(lja.e(j6));
                                        if (iB3 != iB4) {
                                            n41VarA.c(riaVar.i(iB3, iB4), npVar);
                                        }
                                    } else if (lja.c(j7)) {
                                        kha khaVar5 = khaVar3;
                                        if (!lja.c(khaVar5.b)) {
                                            npVar.f(j8);
                                            long j9 = khaVar5.b;
                                            int iB5 = ag7Var5.b(lja.f(j9));
                                            int iB6 = ag7Var5.b(lja.e(j9));
                                            if (iB5 != iB6) {
                                                n41VarA.c(riaVar.i(iB5, iB6), npVar);
                                            }
                                        }
                                    } else {
                                        long jB = qiaVar.b.b();
                                        uh1 uh1Var = new uh1(jB);
                                        if (jB == 16) {
                                            uh1Var = null;
                                        }
                                        long j10 = uh1Var != null ? uh1Var.a : uh1.b;
                                        npVar.f(uh1.b(uh1.d(j10) * 0.2f, j10));
                                        int iB7 = ag7Var5.b(lja.f(j7));
                                        int iB8 = ag7Var5.b(lja.e(j7));
                                        if (iB7 != iB8) {
                                            n41VarA.c(riaVar.i(iB7, iB8), npVar);
                                        }
                                    }
                                    boolean z210 = riaVar.d() && qiaVar.f != 3;
                                    if (z210) {
                                        long j11 = riaVar.c;
                                        sk8 sk8VarA = tk8.a(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                        n41VarA.f();
                                        n41VarA.r(sk8VarA);
                                    }
                                    ww9 ww9Var = qiaVar.b.a;
                                    fda fdaVar = ww9Var.m;
                                    mha mhaVar = ww9Var.a;
                                    if (fdaVar == null) {
                                        fdaVar = fda.b;
                                    }
                                    fda fdaVar2 = fdaVar;
                                    el9 el9Var = ww9Var.n;
                                    if (el9Var == null) {
                                        el9Var = el9.d;
                                    }
                                    el9 el9Var2 = el9Var;
                                    e73 e73Var = ww9Var.p;
                                    if (e73Var == null) {
                                        e73Var = zy3.a;
                                    }
                                    e73 e73Var2 = e73Var;
                                    try {
                                        fx0 fx0VarE = mhaVar.e();
                                        mha.a aVar5 = mha.a.a;
                                        if (fx0VarE != null) {
                                            l07.j(l07Var, n41VarA, fx0VarE, mhaVar != aVar5 ? mhaVar.a() : 1.0f, el9Var2, fdaVar2, e73Var2);
                                        } else {
                                            l07.i(l07Var, n41VarA, mhaVar != aVar5 ? mhaVar.c() : uh1.b, el9Var2, fdaVar2, e73Var2);
                                        }
                                    } finally {
                                        if (z210) {
                                            n41VarA.o();
                                        }
                                    }
                                }
                                return g2b.a;
                            }
                        });
                        boolean zJ13 = bj4Var4.j(u56Var4);
                        if (i7 == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zJ14 = zJ13 | z17 | bj4Var4.J(mmbVar) | bj4Var4.j(qgaVar3);
                        if (i8 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zJ3 = zJ14 | z18 | bj4Var4.j(ag7Var2);
                        objF7 = bj4Var4.f();
                        if (zJ3) {
                            final kha khaVar5 = khaVar3;
                            oh4 oh4Var5 = new oh4() { // from class: c62
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    gia giaVar2;
                                    qq5 qq5Var;
                                    qq5 qq5Var2;
                                    u56 u56Var7 = u56Var4;
                                    dt7 dt7Var = u56Var7.o;
                                    qq5 qq5Var3 = (qq5) obj;
                                    u56Var7.h = qq5Var3;
                                    sia siaVarD = u56Var7.d();
                                    if (siaVarD != null) {
                                        siaVarD.b = qq5Var3;
                                    }
                                    if (z2) {
                                        bt4 bt4VarA = u56Var7.a();
                                        bt4 bt4Var = bt4.u;
                                        qga qgaVar4 = qgaVar3;
                                        kha khaVar6 = khaVar5;
                                        if (bt4VarA == bt4Var) {
                                            if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                                qgaVar4.r();
                                            } else {
                                                qgaVar4.o();
                                            }
                                            u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                            u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                            dt7Var.setValue(Boolean.valueOf(lja.c(khaVar6.b)));
                                        } else if (u56Var7.a() == bt4.v) {
                                            dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                        }
                                        ag7 ag7Var5 = ag7Var2;
                                        m62.f(u56Var7, khaVar6, ag7Var5);
                                        sia siaVarD2 = u56Var7.d();
                                        if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                            ria riaVar = siaVarD2.a;
                                            zda zdaVar = new zda(qq5Var);
                                            sk8 sk8VarA = fb9.a(qq5Var);
                                            sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                            if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                                giaVar2.b.c(khaVar6, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                            }
                                        }
                                    }
                                    return g2b.a;
                                }
                            };
                            bj4Var4.C(oh4Var5);
                            objF7 = oh4Var5;
                        } else {
                            final kha khaVar6 = khaVar3;
                            oh4 oh4Var6 = new oh4() { // from class: c62
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    gia giaVar2;
                                    qq5 qq5Var;
                                    qq5 qq5Var2;
                                    u56 u56Var7 = u56Var4;
                                    dt7 dt7Var = u56Var7.o;
                                    qq5 qq5Var3 = (qq5) obj;
                                    u56Var7.h = qq5Var3;
                                    sia siaVarD = u56Var7.d();
                                    if (siaVarD != null) {
                                        siaVarD.b = qq5Var3;
                                    }
                                    if (z2) {
                                        bt4 bt4VarA = u56Var7.a();
                                        bt4 bt4Var = bt4.u;
                                        qga qgaVar4 = qgaVar3;
                                        kha khaVar7 = khaVar6;
                                        if (bt4VarA == bt4Var) {
                                            if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                                qgaVar4.r();
                                            } else {
                                                qgaVar4.o();
                                            }
                                            u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                            u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                            dt7Var.setValue(Boolean.valueOf(lja.c(khaVar7.b)));
                                        } else if (u56Var7.a() == bt4.v) {
                                            dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                        }
                                        ag7 ag7Var5 = ag7Var2;
                                        m62.f(u56Var7, khaVar7, ag7Var5);
                                        sia siaVarD2 = u56Var7.d();
                                        if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                            ria riaVar = siaVarD2.a;
                                            zda zdaVar = new zda(qq5Var);
                                            sk8 sk8VarA = fb9.a(qq5Var);
                                            sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                            if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                                giaVar2.b.c(khaVar7, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                            }
                                        }
                                    }
                                    return g2b.a;
                                }
                            };
                            bj4Var4.C(oh4Var6);
                            objF7 = oh4Var6;
                        }
                        final ox6 ox6VarB3 = oh7.b(aVar2, (oh4) objF7);
                        u56Var5 = u56Var4;
                        p62 p62Var2 = new p62(mvaVar, khaVar, u56Var5, z3, z2, ag7Var2, qgaVar3, s85Var, p94Var);
                        if (!z2) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            ox6VarA = it1.a(aVar2, new ei4() { // from class: qda
                                /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
                                @Override // defpackage.ei4
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Object objE;
                                    ox6 ox6Var4 = (ox6) obj;
                                    jt1 jt1Var2 = (jt1) obj2;
                                    ((Integer) obj3).getClass();
                                    jt1Var2.K(-84507373);
                                    boolean zBooleanValue2 = ((Boolean) jt1Var2.F(qu1.x)).booleanValue();
                                    boolean zC2 = jt1Var2.c(zBooleanValue2);
                                    Object objF110 = jt1Var2.f();
                                    jt1.a.C0187a c0187a2 = jt1.a.a;
                                    if (zC2 || objF110 == c0187a2) {
                                        objF110 = new cd2(zBooleanValue2);
                                        jt1Var2.C(objF110);
                                    }
                                    final cd2 cd2Var = (cd2) objF110;
                                    final fx0 fx0Var3 = fx0Var;
                                    boolean z210 = ((fx0Var3 instanceof aw9) && ((aw9) fx0Var3).a == 16) ? false : true;
                                    if (((mmb) jt1Var2.F(qu1.u)).a()) {
                                        final u56 u56Var7 = u56Var5;
                                        if (u56Var7.b()) {
                                            final kha khaVar7 = khaVar;
                                            if (lja.c(khaVar7.b) && z210) {
                                                jt1Var2.K(-707487962);
                                                iw iwVar5 = khaVar7.a;
                                                lja ljaVar3 = new lja(khaVar7.b);
                                                boolean zJ15 = jt1Var2.j(cd2Var);
                                                Object objF20 = jt1Var2.f();
                                                if (zJ15 || objF20 == c0187a2) {
                                                    objF20 = new sda(cd2Var, null);
                                                    jt1Var2.C(objF20);
                                                }
                                                wd3.f(iwVar5, ljaVar3, (ci4) objF20, jt1Var2);
                                                boolean zJ16 = jt1Var2.j(cd2Var);
                                                final ag7 ag7Var5 = ag7Var2;
                                                boolean zJ17 = jt1Var2.j(ag7Var5) | zJ16 | jt1Var2.J(khaVar7) | jt1Var2.j(u56Var7) | jt1Var2.J(fx0Var3);
                                                Object objF21 = jt1Var2.f();
                                                if (zJ17 || objF21 == c0187a2) {
                                                    oh4 oh4Var7 = new oh4() { // from class: rda
                                                        @Override // defpackage.oh4
                                                        public final Object invoke(Object obj4) {
                                                            cz1 cz1Var = (cz1) obj4;
                                                            cz1Var.K1();
                                                            float fH = cd2Var.c.h();
                                                            if (fH != 0.0f) {
                                                                long j6 = khaVar7.b;
                                                                int i16 = lja.c;
                                                                int iB3 = ag7Var5.b((int) (j6 >> 32));
                                                                sia siaVarD = u56Var7.d();
                                                                sk8 sk8VarC = siaVarD != null ? siaVarD.a.c(iB3) : new sk8(0.0f, 0.0f, 0.0f, 0.0f);
                                                                float fFloor = (float) Math.floor(cz1Var.U0(2.0f));
                                                                float f = fFloor < 1.0f ? 1.0f : fFloor;
                                                                float f2 = f / 2.0f;
                                                                float f3 = sk8VarC.a + f2;
                                                                float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() >> 32)) - f2;
                                                                if (f3 > fIntBitsToFloat) {
                                                                    f3 = fIntBitsToFloat;
                                                                }
                                                                if (f3 >= f2) {
                                                                    f2 = f3;
                                                                }
                                                                float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                                                                cz1Var.T0(fx0Var3, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.d)) & 4294967295L), f, fH);
                                                            }
                                                            return g2b.a;
                                                        }
                                                    };
                                                    jt1Var2.C(oh4Var7);
                                                    objF21 = oh4Var7;
                                                }
                                                objE = z63.e(ox6Var4, (oh4) objF21);
                                                jt1Var2.B();
                                            } else {
                                                jt1Var2.K(-705473241);
                                                jt1Var2.B();
                                                objE = ox6.a.t;
                                            }
                                        } else {
                                            jt1Var2.K(-705473241);
                                            jt1Var2.B();
                                            objE = ox6.a.t;
                                        }
                                    } else {
                                        jt1Var2.K(-705473241);
                                        jt1Var2.B();
                                        objE = ox6.a.t;
                                    }
                                    jt1Var2.B();
                                    return objE;
                                }
                            });
                        } else {
                            ox6VarA = aVar2;
                        }
                        zJ4 = bj4Var4.j(qgaVar3);
                        objF8 = bj4Var4.f();
                        if (zJ4) {
                            objF8 = new oh4() { // from class: d62
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return new k62(qgaVar3);
                                }
                            };
                            bj4Var4.C(objF8);
                        } else {
                            objF8 = new oh4() { // from class: d62
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return new k62(qgaVar3);
                                }
                            };
                            bj4Var4.C(objF8);
                        }
                        wd3.a(qgaVar3, (oh4) objF8, bj4Var4);
                        boolean zJ15 = bj4Var4.j(u56Var5) | bj4Var4.j(xhaVar2);
                        if (i8 == 4) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        z21 = zJ15 | z20 | ((i10 <= 32 && bj4Var4.J(s85Var)) || (i12 & 48) == 32);
                        objF9 = bj4Var4.f();
                        if (z21) {
                            objF9 = new oh4() { // from class: e62
                                /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    u56 u56Var7 = u56Var5;
                                    if (u56Var7.b()) {
                                        nd3 nd3Var2 = u56Var7.d;
                                        g75 g75Var2 = u56Var7.v;
                                        s56 s56Var = u56Var7.w;
                                        gl8 gl8Var = new gl8();
                                        yda ydaVar = new yda(nd3Var2, g75Var2, gl8Var);
                                        xha xhaVar4 = xhaVar2;
                                        y18 y18Var = xhaVar4.a;
                                        y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                        ?? giaVar2 = new gia(xhaVar4, y18Var);
                                        xhaVar4.b.set((gia) giaVar2);
                                        gl8Var.t = giaVar2;
                                        u56Var7.e = giaVar2;
                                    }
                                    return new l62();
                                }
                            };
                            bj4Var4.C(objF9);
                        } else {
                            objF9 = new oh4() { // from class: e62
                                /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    u56 u56Var7 = u56Var5;
                                    if (u56Var7.b()) {
                                        nd3 nd3Var2 = u56Var7.d;
                                        g75 g75Var2 = u56Var7.v;
                                        s56 s56Var = u56Var7.w;
                                        gl8 gl8Var = new gl8();
                                        yda ydaVar = new yda(nd3Var2, g75Var2, gl8Var);
                                        xha xhaVar4 = xhaVar2;
                                        y18 y18Var = xhaVar4.a;
                                        y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                        ?? giaVar2 = new gia(xhaVar4, y18Var);
                                        xhaVar4.b.set((gia) giaVar2);
                                        gl8Var.t = giaVar2;
                                        u56Var7.e = giaVar2;
                                    }
                                    return new l62();
                                }
                            };
                            bj4Var4.C(objF9);
                        }
                        wd3.a(s85Var, (oh4) objF9, bj4Var4);
                        final oh4 g75Var2 = u56Var5.v;
                        if (i == 1) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        final int i16 = s85Var.e;
                        final z1b z1bVar4 = z1bVar2;
                        ox6 ox6VarA5 = it1.a(aVar2, new ei4() { // from class: cfa
                            @Override // defpackage.ei4
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                jt1 jt1Var2 = (jt1) obj2;
                                ((Integer) obj3).getClass();
                                jt1Var2.K(851809892);
                                Object objF110 = jt1Var2.f();
                                jt1.a.C0187a c0187a2 = jt1.a.a;
                                if (objF110 == c0187a2) {
                                    objF110 = new kja();
                                    jt1Var2.C(objF110);
                                }
                                kja kjaVar = (kja) objF110;
                                Object objF20 = jt1Var2.f();
                                if (objF20 == c0187a2) {
                                    objF20 = new vm2();
                                    jt1Var2.C(objF20);
                                }
                                bfa bfaVar = new bfa(u56Var5, qgaVar3, khaVar, z26, z22, kjaVar, ag7Var2, z1bVar4, (vm2) objF20, g75Var2, i16);
                                boolean zJ16 = jt1Var2.j(bfaVar);
                                Object objF21 = jt1Var2.f();
                                if (zJ16 || objF21 == c0187a2) {
                                    dfa dfaVar = new dfa(1, bfaVar, bfa.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                                    jt1Var2.C(dfaVar);
                                    objF21 = dfaVar;
                                }
                                qo5 qo5Var = new qo5((oh4) ((yn5) objF21), null);
                                jt1Var2.B();
                                return qo5Var;
                            }
                        });
                        i11 = s85Var.d;
                        if (i11 == 7) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        zBooleanValue = ((Boolean) h37VarJ.getValue()).booleanValue();
                        zC = bj4Var4.c(z23) | bj4Var4.j(n56Var);
                        objF10 = bj4Var4.f();
                        if (zC) {
                            objF10 = new mh4() { // from class: f62
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    if (z23) {
                                        n56Var.i();
                                    }
                                    return g2b.a;
                                }
                            };
                            bj4Var4.C(objF10);
                        } else {
                            objF10 = new mh4() { // from class: f62
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    if (z23) {
                                        n56Var.i();
                                    }
                                    return g2b.a;
                                }
                            };
                            bj4Var4.C(objF10);
                        }
                        mh4 mh4Var2 = (mh4) objF10;
                        if (zBooleanValue) {
                            ox6VarH = aVar2;
                        } else {
                            ox6VarH = aVar2;
                        }
                        fx0Var2 = (fx0) bj4Var4.F(lf0.a);
                        j2 = ((uh1) bj4Var4.F(lf0.b)).a;
                        if (uh1.c(j2, u7d.c(1308617531))) {
                            aw9Var = new aw9(j2);
                        } else {
                            aw9Var = fx0Var2;
                        }
                        zJ5 = bj4Var4.j(u56Var5) | bj4Var4.J(aw9Var);
                        objF11 = bj4Var4.f();
                        if (zJ5) {
                            z24 = false;
                            objF11 = new r52(0, u56Var5, aw9Var);
                            bj4Var4.C(objF11);
                        } else {
                            z24 = false;
                            objF11 = new r52(0, u56Var5, aw9Var);
                            bj4Var4.C(objF11);
                        }
                        ox6 ox6VarH5 = oh7.b(it1.a(ro5.a(ro5.a(ox6Var.H(z63.e(aVar2, (oh4) objF11)).H(new f56(n56Var, u56Var5, qgaVar3)).H(ox6VarH).H(ox6VarA3), new cea(d94Var, u56Var5)), new o62(u56Var5, qgaVar3)).H(ox6VarA5), new ei4() { // from class: bga
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.ei4
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                gga ggaVar2 = ggaVar;
                                dt7 dt7Var = ggaVar2.f;
                                jt1 jt1Var2 = (jt1) obj2;
                                ((Integer) obj3).getClass();
                                jt1Var2.K(-2137546592);
                                boolean z210 = ((fl7) dt7Var.getValue()) == fl7.t || !(jt1Var2.F(qu1.n) == tq5.u);
                                boolean zJ16 = jt1Var2.J(ggaVar2);
                                Object objF110 = jt1Var2.f();
                                jt1.a.C0187a c0187a2 = jt1.a.a;
                                if (zJ16 || objF110 == c0187a2) {
                                    objF110 = new a26(1, ggaVar2);
                                    jt1Var2.C(objF110);
                                }
                                h37 h37VarJ2 = bl7.j((oh4) objF110, jt1Var2);
                                Object objF20 = jt1Var2.f();
                                if (objF20 == c0187a2) {
                                    ht2 ht2Var = new ht2(new r58(1, h37VarJ2));
                                    jt1Var2.C(ht2Var);
                                    objF20 = ht2Var;
                                }
                                s79 s79Var = (s79) objF20;
                                boolean zJ17 = jt1Var2.J(s79Var) | jt1Var2.J(ggaVar2);
                                Object objF21 = jt1Var2.f();
                                if (zJ17 || objF21 == c0187a2) {
                                    objF21 = new cga(s79Var, ggaVar2);
                                    jt1Var2.C(objF21);
                                }
                                ox6 ox6VarB4 = d79.b((cga) objF21, (fl7) dt7Var.getValue(), z2 && ggaVar2.b.h() != 0.0f, z210, h27Var);
                                jt1Var2.B();
                                return ox6VarB4;
                            }
                        }).H(ox6VarC3).H(p62Var2), new j11(1, u56Var5)).H(new mb(new d11(1, qgaVar3, t72Var4)));
                        if (z2) {
                            z24 = true;
                        }
                        if (z24) {
                            ox6VarA2 = aVar2;
                        } else {
                            ox6VarA2 = aVar2;
                        }
                        final boolean z210 = z24;
                        bj4 bj4Var6 = bj4Var4;
                        final fw0 fw0Var4 = fw0Var2;
                        final ox6 ox6Var4 = ox6VarA2;
                        final tx2 tx2Var5 = tx2Var2;
                        final ox6 ox6Var5 = ox6VarA;
                        ci4 ci4Var2 = new ci4() { // from class: z52
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                jt1 jt1Var2 = (jt1) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final u56 u56Var7 = u56Var5;
                                    final wja wjaVar3 = wjaVar;
                                    final int i17 = i2;
                                    final int i18 = i;
                                    final gga ggaVar2 = ggaVar;
                                    final kha khaVar7 = khaVar;
                                    final ojb ojbVar2 = ojbVar;
                                    final ox6 ox6Var6 = ox6Var5;
                                    final ox6 ox6Var7 = ox6VarC4;
                                    final ox6 ox6Var8 = ox6VarB3;
                                    final ox6 ox6Var9 = ox6Var4;
                                    final fw0 fw0Var5 = fw0Var4;
                                    final qga qgaVar4 = qgaVar3;
                                    final boolean z30 = z210;
                                    final boolean z31 = z3;
                                    final oh4 oh4Var7 = oh4Var2;
                                    final ag7 ag7Var5 = ag7Var2;
                                    final tx2 tx2Var6 = tx2Var5;
                                    ei4Var.invoke(gr1.b(-44346382, new ci4() { // from class: u52
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.ci4
                                        public final Object invoke(Object obj3, Object obj4) {
                                            ox6 kebVar;
                                            jt1 jt1Var3 = (jt1) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            if (jt1Var3.A(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                final u56 u56Var8 = u56Var7;
                                                ox6 ox6VarE = ir9.e(ox6.a.t, ((y43) u56Var8.g.getValue()).t, 0.0f, 2);
                                                int i19 = i17;
                                                final int i110 = i18;
                                                cv4.a(i19, i110);
                                                wja wjaVar4 = wjaVar3;
                                                if (i19 != 1 || i110 != Integer.MAX_VALUE) {
                                                    ox6VarE = ox6VarE.H(new bv4(wjaVar4, i19, i110));
                                                }
                                                boolean zJ16 = jt1Var3.j(u56Var8);
                                                Object objF110 = jt1Var3.f();
                                                if (zJ16 || objF110 == jt1.a.a) {
                                                    objF110 = new w01(1, u56Var8);
                                                    jt1Var3.C(objF110);
                                                }
                                                mh4 mh4Var3 = (mh4) objF110;
                                                gga ggaVar3 = ggaVar2;
                                                fl7 fl7Var3 = (fl7) ggaVar3.f.getValue();
                                                final kha khaVar8 = khaVar7;
                                                long j6 = khaVar8.b;
                                                int i20 = lja.c;
                                                int iF = (int) (j6 >> 32);
                                                long j7 = ggaVar3.e;
                                                if (iF == ((int) (j7 >> 32)) && (iF = (int) (j6 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                                                    iF = lja.f(j6);
                                                }
                                                ggaVar3.e = khaVar8.b;
                                                mva mvaVarA2 = n7b.a(ojbVar2, khaVar8.a);
                                                int iOrdinal = fl7Var3.ordinal();
                                                if (iOrdinal == 0) {
                                                    kebVar = new keb(ggaVar3, iF, mvaVarA2, mh4Var3);
                                                } else {
                                                    if (iOrdinal != 1) {
                                                        u.b();
                                                        return null;
                                                    }
                                                    kebVar = new l15(ggaVar3, iF, mvaVarA2, mh4Var3);
                                                }
                                                ox6 ox6VarA6 = kw0.a(uma.b(ox6VarE).H(kebVar).H(ox6Var6).H(ox6Var7).H(new gha(wjaVar4)).H(ox6Var8).H(ox6Var9), fw0Var5);
                                                final qga qgaVar5 = qgaVar4;
                                                final boolean z32 = z30;
                                                final boolean z33 = z31;
                                                final oh4 oh4Var8 = oh4Var7;
                                                final ag7 ag7Var6 = ag7Var5;
                                                final tx2 tx2Var7 = tx2Var6;
                                                lp9.a(ox6VarA6, gr1.b(1412697320, new ci4() { // from class: v52
                                                    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
                                                    @Override // defpackage.ci4
                                                    public final Object invoke(Object obj5, Object obj6) {
                                                        boolean z34;
                                                        jt1 jt1Var4 = (jt1) obj5;
                                                        int iIntValue3 = ((Integer) obj6).intValue();
                                                        if (jt1Var4.A(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            u56 u56Var9 = u56Var8;
                                                            i62 i62Var = new i62(u56Var9, oh4Var8, khaVar8, ag7Var6, tx2Var7, i110);
                                                            int iHashCode = Long.hashCode(jt1Var4.v());
                                                            kw7 kw7VarY = jt1Var4.y();
                                                            ox6 ox6VarC5 = it1.c(jt1Var4, ox6.a.t);
                                                            bt1.c.getClass();
                                                            qr5.a aVar5 = bt1.a.b;
                                                            if (jt1Var4.s() == null) {
                                                                ml5.c();
                                                                throw null;
                                                            }
                                                            jt1Var4.q();
                                                            if (jt1Var4.l()) {
                                                                jt1Var4.k(aVar5);
                                                            } else {
                                                                jt1Var4.z();
                                                            }
                                                            rd7.d(jt1Var4, bt1.a.f, i62Var);
                                                            rd7.d(jt1Var4, bt1.a.e, kw7VarY);
                                                            rd7.d(jt1Var4, bt1.a.g, Integer.valueOf(iHashCode));
                                                            rd7.c(jt1Var4, bt1.a.h);
                                                            rd7.d(jt1Var4, bt1.a.d, ox6VarC5);
                                                            jt1Var4.I();
                                                            bt4 bt4VarA = u56Var9.a();
                                                            bt4 bt4Var = bt4.t;
                                                            boolean z35 = z32;
                                                            if (bt4VarA != bt4Var && u56Var9.c() != null) {
                                                                qq5 qq5VarC = u56Var9.c();
                                                                qq5VarC.getClass();
                                                                z34 = qq5VarC.e() && z35;
                                                            }
                                                            qga qgaVar6 = qgaVar5;
                                                            m62.c(qgaVar6, z34, jt1Var4, 0);
                                                            if (u56Var9.a() == bt4.v && !z33 && z35) {
                                                                jt1Var4.K(-714666198);
                                                                m62.d(qgaVar6, jt1Var4, 0);
                                                                jt1Var4.B();
                                                            } else {
                                                                jt1Var4.K(-714589318);
                                                                jt1Var4.B();
                                                            }
                                                        } else {
                                                            jt1Var4.u();
                                                        }
                                                        return g2b.a;
                                                    }
                                                }, jt1Var3), jt1Var3, 48);
                                            } else {
                                                jt1Var3.u();
                                            }
                                            return g2b.a;
                                        }
                                    }, jt1Var2), jt1Var2, 6);
                                } else {
                                    jt1Var2.u();
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var = bj4Var6;
                        b(ox6VarH5, qgaVar3, gr1.b(-814563849, ci4Var2, bj4Var), bj4Var, 384);
                    } else {
                        s85Var2 = s85Var;
                    }
                    z11 = z10;
                    i10 = i9;
                    if ((i12 & 48) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zJ2 = z11 | z12 | bj4Var3.j(ag7Var4) | bj4Var3.j(t72Var) | bj4Var3.j(fw0Var) | bj4Var3.j(qgaVar);
                    objF6 = bj4Var3.f();
                    if (zJ2) {
                        bj4Var4 = bj4Var3;
                        u56Var2 = u56Var6;
                        z1bVar2 = z1bVar;
                        s85Var3 = s85Var2;
                        oh4 oh4Var7 = new oh4() { // from class: b62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                sia siaVarD;
                                v94 v94Var = (v94) obj;
                                u56 u56Var7 = u56Var2;
                                if (u56Var7.b() == v94Var.e()) {
                                    return g2b.a;
                                }
                                u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                                boolean zB = u56Var7.b();
                                kha khaVar7 = khaVar;
                                ag7 ag7Var5 = ag7Var4;
                                if (zB && z2 && !z3) {
                                    m62.g(xhaVar, u56Var7, khaVar7, s85Var3, ag7Var5);
                                } else {
                                    m62.e(u56Var7);
                                }
                                if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                    oy0.d(t72Var, null, null, new j62(fw0Var, khaVar7, u56Var7, siaVarD, ag7Var5, null), 3);
                                }
                                if (!v94Var.e()) {
                                    qgaVar.g(null);
                                }
                                return g2b.a;
                            }
                        };
                        xhaVar = xhaVar;
                        ag7Var = ag7Var4;
                        qgaVar2 = qgaVar;
                        fw0Var2 = fw0Var;
                        z13 = z2;
                        khaVar3 = khaVar;
                        t72Var2 = t72Var;
                        bj4Var4.C(oh4Var7);
                        objF6 = oh4Var7;
                    } else {
                        bj4Var4 = bj4Var3;
                        u56Var2 = u56Var6;
                        z1bVar2 = z1bVar;
                        s85Var3 = s85Var2;
                        oh4 oh4Var8 = new oh4() { // from class: b62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                sia siaVarD;
                                v94 v94Var = (v94) obj;
                                u56 u56Var7 = u56Var2;
                                if (u56Var7.b() == v94Var.e()) {
                                    return g2b.a;
                                }
                                u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                                boolean zB = u56Var7.b();
                                kha khaVar7 = khaVar;
                                ag7 ag7Var5 = ag7Var4;
                                if (zB && z2 && !z3) {
                                    m62.g(xhaVar, u56Var7, khaVar7, s85Var3, ag7Var5);
                                } else {
                                    m62.e(u56Var7);
                                }
                                if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                    oy0.d(t72Var, null, null, new j62(fw0Var, khaVar7, u56Var7, siaVarD, ag7Var5, null), 3);
                                }
                                if (!v94Var.e()) {
                                    qgaVar.g(null);
                                }
                                return g2b.a;
                            }
                        };
                        xhaVar = xhaVar;
                        ag7Var = ag7Var4;
                        qgaVar2 = qgaVar;
                        fw0Var2 = fw0Var;
                        z13 = z2;
                        khaVar3 = khaVar;
                        t72Var2 = t72Var;
                        bj4Var4.C(oh4Var8);
                        objF6 = oh4Var8;
                    }
                    aVar2 = ox6.a.t;
                    ox6 ox6VarA6 = ia4.a(j84.c(ym2.b(aVar2, p94Var), (oh4) objF6), z13, h27Var);
                    if (z13) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    h37VarJ = bl7.j(Boolean.valueOf(z14), bj4Var4);
                    g2b g2bVar2 = g2b.a;
                    boolean zJ16 = bj4Var4.J(h37VarJ) | bj4Var4.j(u56Var2) | bj4Var4.j(xhaVar) | bj4Var4.j(qgaVar2);
                    if (i10 > 32) {
                        u56Var3 = u56Var2;
                        if ((r4 & 48) != 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        u56Var3 = u56Var2;
                        if ((r4 & 48) != 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    z16 = zJ16 | z15;
                    Object objF110 = bj4Var4.f();
                    if (z16) {
                        u56Var4 = u56Var3;
                        g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                        bj4Var4.C(g62Var);
                    } else {
                        u56Var4 = u56Var3;
                        g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                        bj4Var4.C(g62Var);
                    }
                    wd3.d(bj4Var4, (ci4) g62Var, g2bVar2);
                    ox6VarB = t6a.b(aVar2, 8675309, new va9(new rfa(u56Var4)));
                    qgaVar3 = qgaVar2;
                    t72 t72Var5 = t72Var2;
                    ag7Var2 = ag7Var;
                    xhaVar2 = xhaVar;
                    r0 = new oh4() { // from class: sfa
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            xv9 xv9Var2;
                            vf7 vf7Var = (vf7) obj;
                            u56 u56Var7 = u56Var4;
                            if (!u56Var7.b()) {
                                p94.a(p94Var);
                            } else if (!z3 && (xv9Var2 = u56Var7.c) != null) {
                                xv9Var2.b();
                            }
                            if (u56Var7.b() && z2) {
                                if (u56Var7.a() != bt4.u) {
                                    sia siaVarD = u56Var7.d();
                                    if (siaVarD != null) {
                                        long j6 = vf7Var.a;
                                        nd3 nd3Var2 = u56Var7.d;
                                        g75 g75Var3 = u56Var7.v;
                                        int iA = ag7Var2.a(siaVarD.b(j6, true));
                                        g75Var3.invoke(kha.a(nd3Var2.a, null, ay.c(iA, iA), 5));
                                        if (u56Var7.a.a.u.length() > 0) {
                                            u56Var7.k.setValue(bt4.v);
                                        }
                                    }
                                } else {
                                    qgaVar3.g(vf7Var);
                                }
                            }
                            return g2b.a;
                        }
                    };
                    if (z2) {
                        ox6VarB = it1.a(ox6VarB, new ei4() { // from class: vfa
                            @Override // defpackage.ei4
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                jt1 jt1Var2 = (jt1) obj2;
                                ((Integer) obj3).getClass();
                                jt1Var2.K(-102778667);
                                Object objF111 = jt1Var2.f();
                                jt1.a.C0187a c0187a2 = jt1.a.a;
                                if (objF111 == c0187a2) {
                                    c33 c33Var2 = wd3.a;
                                    nm8 nm8Var = new nm8(jt1Var2.x());
                                    jt1Var2.C(nm8Var);
                                    objF111 = nm8Var;
                                }
                                t72 t72Var6 = (t72) objF111;
                                Object objF20 = jt1Var2.f();
                                if (objF20 == c0187a2) {
                                    objF20 = bl7.i(null);
                                    jt1Var2.C(objF20);
                                }
                                final h37 h37Var = (h37) objF20;
                                h37 h37VarJ2 = bl7.j(r0, jt1Var2);
                                final h27 h27Var2 = h27Var;
                                boolean zJ17 = jt1Var2.J(h27Var2);
                                Object objF21 = jt1Var2.f();
                                if (zJ17 || objF21 == c0187a2) {
                                    objF21 = new oh4() { // from class: wfa
                                        @Override // defpackage.oh4
                                        public final Object invoke(Object obj4) {
                                            return new zfa(h37Var, h27Var2);
                                        }
                                    };
                                    jt1Var2.C(objF21);
                                }
                                wd3.a(h27Var2, (oh4) objF21, jt1Var2);
                                boolean zJ18 = jt1Var2.j(t72Var6) | jt1Var2.J(h27Var2) | jt1Var2.J(h37VarJ2);
                                Object objF22 = jt1Var2.f();
                                if (zJ18 || objF22 == c0187a2) {
                                    objF22 = new yfa(t72Var6, h37Var, h27Var2, h37VarJ2);
                                    jt1Var2.C(objF22);
                                }
                                ox6 ox6VarB4 = t6a.b(ox6.a.t, h27Var2, (PointerInputEventHandler) objF22);
                                jt1Var2.B();
                                return ox6VarB4;
                            }
                        });
                    }
                    ox6 ox6VarH6 = ox6VarB.H(new q6a(qgaVar3.A, qgaVar3.z, new tfa(qgaVar3), 4));
                    w48.a.getClass();
                    ox6 ox6VarC5 = by5.c(ox6VarH6, y48.u);
                    final ox6 ox6VarC6 = z63.c(aVar2, new oh4() { // from class: t52
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            d73 d73Var = (d73) obj;
                            u56 u56Var7 = u56Var4;
                            sia siaVarD = u56Var7.d();
                            if (siaVarD != null) {
                                n41 n41VarA = d73Var.Y0().a();
                                long j6 = ((lja) u56Var7.A.getValue()).a;
                                long j7 = ((lja) u56Var7.B.getValue()).a;
                                ria riaVar = siaVarD.a;
                                l07 l07Var = riaVar.b;
                                qia qiaVar = riaVar.a;
                                np npVar = u56Var7.y;
                                long j8 = u56Var7.z;
                                boolean zC2 = lja.c(j6);
                                ag7 ag7Var5 = ag7Var2;
                                if (!zC2) {
                                    npVar.f(j8);
                                    int iB3 = ag7Var5.b(lja.f(j6));
                                    int iB4 = ag7Var5.b(lja.e(j6));
                                    if (iB3 != iB4) {
                                        n41VarA.c(riaVar.i(iB3, iB4), npVar);
                                    }
                                } else if (lja.c(j7)) {
                                    kha khaVar7 = khaVar3;
                                    if (!lja.c(khaVar7.b)) {
                                        npVar.f(j8);
                                        long j9 = khaVar7.b;
                                        int iB5 = ag7Var5.b(lja.f(j9));
                                        int iB6 = ag7Var5.b(lja.e(j9));
                                        if (iB5 != iB6) {
                                            n41VarA.c(riaVar.i(iB5, iB6), npVar);
                                        }
                                    }
                                } else {
                                    long jB = qiaVar.b.b();
                                    uh1 uh1Var = new uh1(jB);
                                    if (jB == 16) {
                                        uh1Var = null;
                                    }
                                    long j10 = uh1Var != null ? uh1Var.a : uh1.b;
                                    npVar.f(uh1.b(uh1.d(j10) * 0.2f, j10));
                                    int iB7 = ag7Var5.b(lja.f(j7));
                                    int iB8 = ag7Var5.b(lja.e(j7));
                                    if (iB7 != iB8) {
                                        n41VarA.c(riaVar.i(iB7, iB8), npVar);
                                    }
                                }
                                boolean z211 = riaVar.d() && qiaVar.f != 3;
                                if (z211) {
                                    long j11 = riaVar.c;
                                    sk8 sk8VarA = tk8.a(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                    n41VarA.f();
                                    n41VarA.r(sk8VarA);
                                }
                                ww9 ww9Var = qiaVar.b.a;
                                fda fdaVar = ww9Var.m;
                                mha mhaVar = ww9Var.a;
                                if (fdaVar == null) {
                                    fdaVar = fda.b;
                                }
                                fda fdaVar2 = fdaVar;
                                el9 el9Var = ww9Var.n;
                                if (el9Var == null) {
                                    el9Var = el9.d;
                                }
                                el9 el9Var2 = el9Var;
                                e73 e73Var = ww9Var.p;
                                if (e73Var == null) {
                                    e73Var = zy3.a;
                                }
                                e73 e73Var2 = e73Var;
                                try {
                                    fx0 fx0VarE = mhaVar.e();
                                    mha.a aVar5 = mha.a.a;
                                    if (fx0VarE != null) {
                                        l07.j(l07Var, n41VarA, fx0VarE, mhaVar != aVar5 ? mhaVar.a() : 1.0f, el9Var2, fdaVar2, e73Var2);
                                    } else {
                                        l07.i(l07Var, n41VarA, mhaVar != aVar5 ? mhaVar.c() : uh1.b, el9Var2, fdaVar2, e73Var2);
                                    }
                                } finally {
                                    if (z211) {
                                        n41VarA.o();
                                    }
                                }
                            }
                            return g2b.a;
                        }
                    });
                    boolean zJ17 = bj4Var4.j(u56Var4);
                    if (i7 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zJ18 = zJ17 | z17 | bj4Var4.J(mmbVar) | bj4Var4.j(qgaVar3);
                    if (i8 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zJ3 = zJ18 | z18 | bj4Var4.j(ag7Var2);
                    objF7 = bj4Var4.f();
                    if (zJ3) {
                        final kha khaVar7 = khaVar3;
                        oh4 oh4Var9 = new oh4() { // from class: c62
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                gia giaVar2;
                                qq5 qq5Var;
                                qq5 qq5Var2;
                                u56 u56Var7 = u56Var4;
                                dt7 dt7Var = u56Var7.o;
                                qq5 qq5Var3 = (qq5) obj;
                                u56Var7.h = qq5Var3;
                                sia siaVarD = u56Var7.d();
                                if (siaVarD != null) {
                                    siaVarD.b = qq5Var3;
                                }
                                if (z2) {
                                    bt4 bt4VarA = u56Var7.a();
                                    bt4 bt4Var = bt4.u;
                                    qga qgaVar4 = qgaVar3;
                                    kha khaVar8 = khaVar7;
                                    if (bt4VarA == bt4Var) {
                                        if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                            qgaVar4.r();
                                        } else {
                                            qgaVar4.o();
                                        }
                                        u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                        u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                        dt7Var.setValue(Boolean.valueOf(lja.c(khaVar8.b)));
                                    } else if (u56Var7.a() == bt4.v) {
                                        dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    }
                                    ag7 ag7Var5 = ag7Var2;
                                    m62.f(u56Var7, khaVar8, ag7Var5);
                                    sia siaVarD2 = u56Var7.d();
                                    if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                        ria riaVar = siaVarD2.a;
                                        zda zdaVar = new zda(qq5Var);
                                        sk8 sk8VarA = fb9.a(qq5Var);
                                        sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                        if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                            giaVar2.b.c(khaVar8, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                        }
                                    }
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(oh4Var9);
                        objF7 = oh4Var9;
                    } else {
                        final kha khaVar8 = khaVar3;
                        oh4 oh4Var10 = new oh4() { // from class: c62
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                gia giaVar2;
                                qq5 qq5Var;
                                qq5 qq5Var2;
                                u56 u56Var7 = u56Var4;
                                dt7 dt7Var = u56Var7.o;
                                qq5 qq5Var3 = (qq5) obj;
                                u56Var7.h = qq5Var3;
                                sia siaVarD = u56Var7.d();
                                if (siaVarD != null) {
                                    siaVarD.b = qq5Var3;
                                }
                                if (z2) {
                                    bt4 bt4VarA = u56Var7.a();
                                    bt4 bt4Var = bt4.u;
                                    qga qgaVar4 = qgaVar3;
                                    kha khaVar9 = khaVar8;
                                    if (bt4VarA == bt4Var) {
                                        if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                            qgaVar4.r();
                                        } else {
                                            qgaVar4.o();
                                        }
                                        u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                        u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                        dt7Var.setValue(Boolean.valueOf(lja.c(khaVar9.b)));
                                    } else if (u56Var7.a() == bt4.v) {
                                        dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    }
                                    ag7 ag7Var5 = ag7Var2;
                                    m62.f(u56Var7, khaVar9, ag7Var5);
                                    sia siaVarD2 = u56Var7.d();
                                    if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                        ria riaVar = siaVarD2.a;
                                        zda zdaVar = new zda(qq5Var);
                                        sk8 sk8VarA = fb9.a(qq5Var);
                                        sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                        if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                            giaVar2.b.c(khaVar9, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                        }
                                    }
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(oh4Var10);
                        objF7 = oh4Var10;
                    }
                    final ox6 ox6VarB4 = oh7.b(aVar2, (oh4) objF7);
                    u56Var5 = u56Var4;
                    p62 p62Var3 = new p62(mvaVar, khaVar, u56Var5, z3, z2, ag7Var2, qgaVar3, s85Var, p94Var);
                    if (!z2) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        ox6VarA = it1.a(aVar2, new ei4() { // from class: qda
                            /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
                            @Override // defpackage.ei4
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Object objE;
                                ox6 ox6Var6 = (ox6) obj;
                                jt1 jt1Var2 = (jt1) obj2;
                                ((Integer) obj3).getClass();
                                jt1Var2.K(-84507373);
                                boolean zBooleanValue2 = ((Boolean) jt1Var2.F(qu1.x)).booleanValue();
                                boolean zC2 = jt1Var2.c(zBooleanValue2);
                                Object objF111 = jt1Var2.f();
                                jt1.a.C0187a c0187a2 = jt1.a.a;
                                if (zC2 || objF111 == c0187a2) {
                                    objF111 = new cd2(zBooleanValue2);
                                    jt1Var2.C(objF111);
                                }
                                final cd2 cd2Var = (cd2) objF111;
                                final fx0 fx0Var3 = fx0Var;
                                boolean z211 = ((fx0Var3 instanceof aw9) && ((aw9) fx0Var3).a == 16) ? false : true;
                                if (((mmb) jt1Var2.F(qu1.u)).a()) {
                                    final u56 u56Var7 = u56Var5;
                                    if (u56Var7.b()) {
                                        final kha khaVar9 = khaVar;
                                        if (lja.c(khaVar9.b) && z211) {
                                            jt1Var2.K(-707487962);
                                            iw iwVar5 = khaVar9.a;
                                            lja ljaVar3 = new lja(khaVar9.b);
                                            boolean zJ19 = jt1Var2.j(cd2Var);
                                            Object objF20 = jt1Var2.f();
                                            if (zJ19 || objF20 == c0187a2) {
                                                objF20 = new sda(cd2Var, null);
                                                jt1Var2.C(objF20);
                                            }
                                            wd3.f(iwVar5, ljaVar3, (ci4) objF20, jt1Var2);
                                            boolean zJ110 = jt1Var2.j(cd2Var);
                                            final ag7 ag7Var5 = ag7Var2;
                                            boolean zJ111 = jt1Var2.j(ag7Var5) | zJ110 | jt1Var2.J(khaVar9) | jt1Var2.j(u56Var7) | jt1Var2.J(fx0Var3);
                                            Object objF21 = jt1Var2.f();
                                            if (zJ111 || objF21 == c0187a2) {
                                                oh4 oh4Var11 = new oh4() { // from class: rda
                                                    @Override // defpackage.oh4
                                                    public final Object invoke(Object obj4) {
                                                        cz1 cz1Var = (cz1) obj4;
                                                        cz1Var.K1();
                                                        float fH = cd2Var.c.h();
                                                        if (fH != 0.0f) {
                                                            long j6 = khaVar9.b;
                                                            int i17 = lja.c;
                                                            int iB3 = ag7Var5.b((int) (j6 >> 32));
                                                            sia siaVarD = u56Var7.d();
                                                            sk8 sk8VarC = siaVarD != null ? siaVarD.a.c(iB3) : new sk8(0.0f, 0.0f, 0.0f, 0.0f);
                                                            float fFloor = (float) Math.floor(cz1Var.U0(2.0f));
                                                            float f = fFloor < 1.0f ? 1.0f : fFloor;
                                                            float f2 = f / 2.0f;
                                                            float f3 = sk8VarC.a + f2;
                                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() >> 32)) - f2;
                                                            if (f3 > fIntBitsToFloat) {
                                                                f3 = fIntBitsToFloat;
                                                            }
                                                            if (f3 >= f2) {
                                                                f2 = f3;
                                                            }
                                                            float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                                                            cz1Var.T0(fx0Var3, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.d)) & 4294967295L), f, fH);
                                                        }
                                                        return g2b.a;
                                                    }
                                                };
                                                jt1Var2.C(oh4Var11);
                                                objF21 = oh4Var11;
                                            }
                                            objE = z63.e(ox6Var6, (oh4) objF21);
                                            jt1Var2.B();
                                        } else {
                                            jt1Var2.K(-705473241);
                                            jt1Var2.B();
                                            objE = ox6.a.t;
                                        }
                                    } else {
                                        jt1Var2.K(-705473241);
                                        jt1Var2.B();
                                        objE = ox6.a.t;
                                    }
                                } else {
                                    jt1Var2.K(-705473241);
                                    jt1Var2.B();
                                    objE = ox6.a.t;
                                }
                                jt1Var2.B();
                                return objE;
                            }
                        });
                    } else {
                        ox6VarA = aVar2;
                    }
                    zJ4 = bj4Var4.j(qgaVar3);
                    objF8 = bj4Var4.f();
                    if (zJ4) {
                        objF8 = new oh4() { // from class: d62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return new k62(qgaVar3);
                            }
                        };
                        bj4Var4.C(objF8);
                    } else {
                        objF8 = new oh4() { // from class: d62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return new k62(qgaVar3);
                            }
                        };
                        bj4Var4.C(objF8);
                    }
                    wd3.a(qgaVar3, (oh4) objF8, bj4Var4);
                    boolean zJ19 = bj4Var4.j(u56Var5) | bj4Var4.j(xhaVar2);
                    if (i8 == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    z21 = zJ19 | z20 | ((i10 <= 32 && bj4Var4.J(s85Var)) || (i12 & 48) == 32);
                    objF9 = bj4Var4.f();
                    if (z21) {
                        objF9 = new oh4() { // from class: e62
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                u56 u56Var7 = u56Var5;
                                if (u56Var7.b()) {
                                    nd3 nd3Var2 = u56Var7.d;
                                    g75 g75Var3 = u56Var7.v;
                                    s56 s56Var = u56Var7.w;
                                    gl8 gl8Var = new gl8();
                                    yda ydaVar = new yda(nd3Var2, g75Var3, gl8Var);
                                    xha xhaVar4 = xhaVar2;
                                    y18 y18Var = xhaVar4.a;
                                    y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                    ?? giaVar2 = new gia(xhaVar4, y18Var);
                                    xhaVar4.b.set((gia) giaVar2);
                                    gl8Var.t = giaVar2;
                                    u56Var7.e = giaVar2;
                                }
                                return new l62();
                            }
                        };
                        bj4Var4.C(objF9);
                    } else {
                        objF9 = new oh4() { // from class: e62
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                u56 u56Var7 = u56Var5;
                                if (u56Var7.b()) {
                                    nd3 nd3Var2 = u56Var7.d;
                                    g75 g75Var3 = u56Var7.v;
                                    s56 s56Var = u56Var7.w;
                                    gl8 gl8Var = new gl8();
                                    yda ydaVar = new yda(nd3Var2, g75Var3, gl8Var);
                                    xha xhaVar4 = xhaVar2;
                                    y18 y18Var = xhaVar4.a;
                                    y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                    ?? giaVar2 = new gia(xhaVar4, y18Var);
                                    xhaVar4.b.set((gia) giaVar2);
                                    gl8Var.t = giaVar2;
                                    u56Var7.e = giaVar2;
                                }
                                return new l62();
                            }
                        };
                        bj4Var4.C(objF9);
                    }
                    wd3.a(s85Var, (oh4) objF9, bj4Var4);
                    final oh4 g75Var3 = u56Var5.v;
                    if (i == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    final int i17 = s85Var.e;
                    final z1b z1bVar5 = z1bVar2;
                    ox6 ox6VarA7 = it1.a(aVar2, new ei4() { // from class: cfa
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(851809892);
                            Object objF111 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (objF111 == c0187a2) {
                                objF111 = new kja();
                                jt1Var2.C(objF111);
                            }
                            kja kjaVar = (kja) objF111;
                            Object objF20 = jt1Var2.f();
                            if (objF20 == c0187a2) {
                                objF20 = new vm2();
                                jt1Var2.C(objF20);
                            }
                            bfa bfaVar = new bfa(u56Var5, qgaVar3, khaVar, z26, z22, kjaVar, ag7Var2, z1bVar5, (vm2) objF20, g75Var3, i17);
                            boolean zJ110 = jt1Var2.j(bfaVar);
                            Object objF21 = jt1Var2.f();
                            if (zJ110 || objF21 == c0187a2) {
                                dfa dfaVar = new dfa(1, bfaVar, bfa.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                                jt1Var2.C(dfaVar);
                                objF21 = dfaVar;
                            }
                            qo5 qo5Var = new qo5((oh4) ((yn5) objF21), null);
                            jt1Var2.B();
                            return qo5Var;
                        }
                    });
                    i11 = s85Var.d;
                    if (i11 == 7) {
                        z23 = false;
                    } else {
                        z23 = true;
                    }
                    zBooleanValue = ((Boolean) h37VarJ.getValue()).booleanValue();
                    zC = bj4Var4.c(z23) | bj4Var4.j(n56Var);
                    objF10 = bj4Var4.f();
                    if (zC) {
                        objF10 = new mh4() { // from class: f62
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                if (z23) {
                                    n56Var.i();
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(objF10);
                    } else {
                        objF10 = new mh4() { // from class: f62
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                if (z23) {
                                    n56Var.i();
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(objF10);
                    }
                    mh4 mh4Var3 = (mh4) objF10;
                    if (zBooleanValue) {
                        ox6VarH = aVar2;
                    } else {
                        ox6VarH = aVar2;
                    }
                    fx0Var2 = (fx0) bj4Var4.F(lf0.a);
                    j2 = ((uh1) bj4Var4.F(lf0.b)).a;
                    if (uh1.c(j2, u7d.c(1308617531))) {
                        aw9Var = new aw9(j2);
                    } else {
                        aw9Var = fx0Var2;
                    }
                    zJ5 = bj4Var4.j(u56Var5) | bj4Var4.J(aw9Var);
                    objF11 = bj4Var4.f();
                    if (zJ5) {
                        z24 = false;
                        objF11 = new r52(0, u56Var5, aw9Var);
                        bj4Var4.C(objF11);
                    } else {
                        z24 = false;
                        objF11 = new r52(0, u56Var5, aw9Var);
                        bj4Var4.C(objF11);
                    }
                    ox6 ox6VarH7 = oh7.b(it1.a(ro5.a(ro5.a(ox6Var.H(z63.e(aVar2, (oh4) objF11)).H(new f56(n56Var, u56Var5, qgaVar3)).H(ox6VarH).H(ox6VarA6), new cea(d94Var, u56Var5)), new o62(u56Var5, qgaVar3)).H(ox6VarA7), new ei4() { // from class: bga
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            gga ggaVar2 = ggaVar;
                            dt7 dt7Var = ggaVar2.f;
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(-2137546592);
                            boolean z211 = ((fl7) dt7Var.getValue()) == fl7.t || !(jt1Var2.F(qu1.n) == tq5.u);
                            boolean zJ110 = jt1Var2.J(ggaVar2);
                            Object objF111 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (zJ110 || objF111 == c0187a2) {
                                objF111 = new a26(1, ggaVar2);
                                jt1Var2.C(objF111);
                            }
                            h37 h37VarJ2 = bl7.j((oh4) objF111, jt1Var2);
                            Object objF20 = jt1Var2.f();
                            if (objF20 == c0187a2) {
                                ht2 ht2Var = new ht2(new r58(1, h37VarJ2));
                                jt1Var2.C(ht2Var);
                                objF20 = ht2Var;
                            }
                            s79 s79Var = (s79) objF20;
                            boolean zJ111 = jt1Var2.J(s79Var) | jt1Var2.J(ggaVar2);
                            Object objF21 = jt1Var2.f();
                            if (zJ111 || objF21 == c0187a2) {
                                objF21 = new cga(s79Var, ggaVar2);
                                jt1Var2.C(objF21);
                            }
                            ox6 ox6VarB5 = d79.b((cga) objF21, (fl7) dt7Var.getValue(), z2 && ggaVar2.b.h() != 0.0f, z211, h27Var);
                            jt1Var2.B();
                            return ox6VarB5;
                        }
                    }).H(ox6VarC5).H(p62Var3), new j11(1, u56Var5)).H(new mb(new d11(1, qgaVar3, t72Var5)));
                    if (z2) {
                        z24 = true;
                    }
                    if (z24) {
                        ox6VarA2 = aVar2;
                    } else {
                        ox6VarA2 = aVar2;
                    }
                    final boolean z211 = z24;
                    bj4 bj4Var7 = bj4Var4;
                    final fw0 fw0Var5 = fw0Var2;
                    final ox6 ox6Var6 = ox6VarA2;
                    final tx2 tx2Var6 = tx2Var2;
                    final ox6 ox6Var7 = ox6VarA;
                    ci4 ci4Var3 = new ci4() { // from class: z52
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            jt1 jt1Var2 = (jt1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final u56 u56Var7 = u56Var5;
                                final wja wjaVar3 = wjaVar;
                                final int i18 = i2;
                                final int i19 = i;
                                final gga ggaVar2 = ggaVar;
                                final kha khaVar9 = khaVar;
                                final ojb ojbVar2 = ojbVar;
                                final ox6 ox6Var8 = ox6Var7;
                                final ox6 ox6Var9 = ox6VarC6;
                                final ox6 ox6Var10 = ox6VarB4;
                                final ox6 ox6Var11 = ox6Var6;
                                final fw0 fw0Var6 = fw0Var5;
                                final qga qgaVar4 = qgaVar3;
                                final boolean z30 = z211;
                                final boolean z31 = z3;
                                final oh4 oh4Var11 = oh4Var2;
                                final ag7 ag7Var5 = ag7Var2;
                                final tx2 tx2Var7 = tx2Var6;
                                ei4Var.invoke(gr1.b(-44346382, new ci4() { // from class: u52
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj3, Object obj4) {
                                        ox6 kebVar;
                                        jt1 jt1Var3 = (jt1) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (jt1Var3.A(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            final u56 u56Var8 = u56Var7;
                                            ox6 ox6VarE = ir9.e(ox6.a.t, ((y43) u56Var8.g.getValue()).t, 0.0f, 2);
                                            int i110 = i18;
                                            final int i111 = i19;
                                            cv4.a(i110, i111);
                                            wja wjaVar4 = wjaVar3;
                                            if (i110 != 1 || i111 != Integer.MAX_VALUE) {
                                                ox6VarE = ox6VarE.H(new bv4(wjaVar4, i110, i111));
                                            }
                                            boolean zJ110 = jt1Var3.j(u56Var8);
                                            Object objF111 = jt1Var3.f();
                                            if (zJ110 || objF111 == jt1.a.a) {
                                                objF111 = new w01(1, u56Var8);
                                                jt1Var3.C(objF111);
                                            }
                                            mh4 mh4Var4 = (mh4) objF111;
                                            gga ggaVar3 = ggaVar2;
                                            fl7 fl7Var3 = (fl7) ggaVar3.f.getValue();
                                            final kha khaVar10 = khaVar9;
                                            long j6 = khaVar10.b;
                                            int i20 = lja.c;
                                            int iF = (int) (j6 >> 32);
                                            long j7 = ggaVar3.e;
                                            if (iF == ((int) (j7 >> 32)) && (iF = (int) (j6 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                                                iF = lja.f(j6);
                                            }
                                            ggaVar3.e = khaVar10.b;
                                            mva mvaVarA2 = n7b.a(ojbVar2, khaVar10.a);
                                            int iOrdinal = fl7Var3.ordinal();
                                            if (iOrdinal == 0) {
                                                kebVar = new keb(ggaVar3, iF, mvaVarA2, mh4Var4);
                                            } else {
                                                if (iOrdinal != 1) {
                                                    u.b();
                                                    return null;
                                                }
                                                kebVar = new l15(ggaVar3, iF, mvaVarA2, mh4Var4);
                                            }
                                            ox6 ox6VarA8 = kw0.a(uma.b(ox6VarE).H(kebVar).H(ox6Var8).H(ox6Var9).H(new gha(wjaVar4)).H(ox6Var10).H(ox6Var11), fw0Var6);
                                            final qga qgaVar5 = qgaVar4;
                                            final boolean z32 = z30;
                                            final boolean z33 = z31;
                                            final oh4 oh4Var12 = oh4Var11;
                                            final ag7 ag7Var6 = ag7Var5;
                                            final tx2 tx2Var8 = tx2Var7;
                                            lp9.a(ox6VarA8, gr1.b(1412697320, new ci4() { // from class: v52
                                                /* JADX WARN: Code duplicated, block: B:22:0x0099  */
                                                @Override // defpackage.ci4
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    boolean z34;
                                                    jt1 jt1Var4 = (jt1) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (jt1Var4.A(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        u56 u56Var9 = u56Var8;
                                                        i62 i62Var = new i62(u56Var9, oh4Var12, khaVar10, ag7Var6, tx2Var8, i111);
                                                        int iHashCode = Long.hashCode(jt1Var4.v());
                                                        kw7 kw7VarY = jt1Var4.y();
                                                        ox6 ox6VarC7 = it1.c(jt1Var4, ox6.a.t);
                                                        bt1.c.getClass();
                                                        qr5.a aVar5 = bt1.a.b;
                                                        if (jt1Var4.s() == null) {
                                                            ml5.c();
                                                            throw null;
                                                        }
                                                        jt1Var4.q();
                                                        if (jt1Var4.l()) {
                                                            jt1Var4.k(aVar5);
                                                        } else {
                                                            jt1Var4.z();
                                                        }
                                                        rd7.d(jt1Var4, bt1.a.f, i62Var);
                                                        rd7.d(jt1Var4, bt1.a.e, kw7VarY);
                                                        rd7.d(jt1Var4, bt1.a.g, Integer.valueOf(iHashCode));
                                                        rd7.c(jt1Var4, bt1.a.h);
                                                        rd7.d(jt1Var4, bt1.a.d, ox6VarC7);
                                                        jt1Var4.I();
                                                        bt4 bt4VarA = u56Var9.a();
                                                        bt4 bt4Var = bt4.t;
                                                        boolean z35 = z32;
                                                        if (bt4VarA != bt4Var && u56Var9.c() != null) {
                                                            qq5 qq5VarC = u56Var9.c();
                                                            qq5VarC.getClass();
                                                            z34 = qq5VarC.e() && z35;
                                                        }
                                                        qga qgaVar6 = qgaVar5;
                                                        m62.c(qgaVar6, z34, jt1Var4, 0);
                                                        if (u56Var9.a() == bt4.v && !z33 && z35) {
                                                            jt1Var4.K(-714666198);
                                                            m62.d(qgaVar6, jt1Var4, 0);
                                                            jt1Var4.B();
                                                        } else {
                                                            jt1Var4.K(-714589318);
                                                            jt1Var4.B();
                                                        }
                                                    } else {
                                                        jt1Var4.u();
                                                    }
                                                    return g2b.a;
                                                }
                                            }, jt1Var3), jt1Var3, 48);
                                        } else {
                                            jt1Var3.u();
                                        }
                                        return g2b.a;
                                    }
                                }, jt1Var2), jt1Var2, 6);
                            } else {
                                jt1Var2.u();
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var = bj4Var7;
                    b(ox6VarH7, qgaVar3, gr1.b(-814563849, ci4Var3, bj4Var), bj4Var, 384);
                } else {
                    nd3Var.b = new td3(iwVar2, j5);
                    d94Var = d94Var2;
                    z5 = true;
                }
                z6 = false;
                if (ljaVar == null) {
                    td3 td3Var3 = nd3Var.b;
                    td3Var3.d = -1;
                    td3Var3.e = -1;
                    bj4Var2 = bj4VarO;
                } else {
                    bj4Var2 = bj4VarO;
                    j = ljaVar.a;
                    if (!lja.c(j)) {
                        nd3Var.b.g(lja.f(j), lja.e(j));
                    }
                }
                if (z5) {
                    td3 td3Var4 = nd3Var.b;
                    td3Var4.d = -1;
                    td3Var4.e = -1;
                    khaVarA = kha.a(khaVar, null, 0L, 3);
                } else {
                    td3 td3Var5 = nd3Var.b;
                    td3Var5.d = -1;
                    td3Var5.e = -1;
                    khaVarA = kha.a(khaVar, null, 0L, 3);
                }
                khaVar2 = nd3Var.a;
                nd3Var.a = khaVarA;
                if (giaVar != null) {
                    giaVar.a(khaVar2, khaVarA);
                }
                objF = bj4Var2.f();
                if (objF == c0187a) {
                    objF = new z1b(0);
                    bj4Var3 = bj4Var2;
                    bj4Var3.C(objF);
                } else {
                    bj4Var3 = bj4Var2;
                }
                z1bVar = (z1b) objF;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (z1bVar.f) {
                    z1bVar.e = Long.valueOf(jCurrentTimeMillis);
                    z1bVar.a(khaVar);
                } else {
                    l = z1bVar.e;
                    if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                        z1bVar.e = Long.valueOf(jCurrentTimeMillis);
                        z1bVar.a(khaVar);
                    }
                }
                objF2 = bj4Var3.f();
                if (objF2 == c0187a) {
                    c33 c33Var2 = wd3.a;
                    objF2 = m78.a(bj4Var3.x(), bj4Var3);
                }
                t72Var = (t72) objF2;
                objF3 = bj4Var3.f();
                if (objF3 == c0187a) {
                    objF3 = new jw0();
                    bj4Var3.C(objF3);
                }
                fw0Var = (fw0) objF3;
                objF4 = bj4Var3.f();
                if (objF4 == c0187a) {
                    objF4 = new qga(z1bVar);
                    bj4Var3.C(objF4);
                }
                qgaVar = (qga) objF4;
                qgaVar.b = ag7Var4;
                qgaVar.c = u56Var6.v;
                qgaVar.d = u56Var6;
                qgaVar.e.setValue(khaVar);
                qgaVar.w = new lja(j5);
                qgaVar.g = (pf1) bj4Var3.F(qu1.f);
                qgaVar.h = t72Var;
                qgaVar.j = (xja) bj4Var3.F(qu1.r);
                qgaVar.k = (st4) bj4Var3.F(qu1.l);
                qgaVar.l = p94Var;
                final boolean z212 = !z3;
                qgaVar.m.setValue(Boolean.valueOf(z212));
                qgaVar.n.setValue(Boolean.valueOf(z2));
                bj4Var3.K(1966756105);
                ad6Var = wjaVar2.a.k;
                y0a y0aVar2 = q18.a;
                bj4Var3.K(430530635);
                if (Build.VERSION.SDK_INT < 28) {
                    bj4Var3.B();
                    j18Var = null;
                } else {
                    context = (Context) bj4Var3.F(AndroidCompositionLocals_androidKt.b);
                    h72Var = (h72) bj4Var3.F(q18.a);
                    zJ = bj4Var3.J(h72Var) | bj4Var3.J(context) | bj4Var3.J(ad6Var);
                    objF5 = bj4Var3.f();
                    if (zJ) {
                        q18.b.getClass();
                        objF5 = new o18(h72Var, context, aa9.t, ad6Var);
                        bj4Var3.C(objF5);
                    } else {
                        q18.b.getClass();
                        objF5 = new o18(h72Var, context, aa9.t, ad6Var);
                        bj4Var3.C(objF5);
                    }
                    j18Var = (j18) objF5;
                    bj4Var3.B();
                }
                qgaVar.i = j18Var;
                bj4Var3.U(false);
                u56Var6.b();
                boolean zJ20 = bj4Var3.j(u56Var6);
                i7 = i12 & 7168;
                if (i7 == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z213 = zJ20 | z7;
                if ((i12 & 57344) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z214 = z8 | z213;
                xhaVar = xhaVar3;
                boolean zJ21 = z214 | bj4Var3.j(xhaVar);
                i8 = i13;
                if (i8 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z9 | zJ21;
                i9 = (i12 & 112) ^ 48;
                if (i9 > 32) {
                    s85Var2 = s85Var;
                    if (!bj4Var3.J(s85Var2)) {
                        z11 = z10;
                        i10 = i9;
                    }
                    z12 = true;
                    zJ2 = z11 | z12 | bj4Var3.j(ag7Var4) | bj4Var3.j(t72Var) | bj4Var3.j(fw0Var) | bj4Var3.j(qgaVar);
                    objF6 = bj4Var3.f();
                    if (zJ2) {
                        bj4Var4 = bj4Var3;
                        u56Var2 = u56Var6;
                        z1bVar2 = z1bVar;
                        s85Var3 = s85Var2;
                        oh4 oh4Var11 = new oh4() { // from class: b62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                sia siaVarD;
                                v94 v94Var = (v94) obj;
                                u56 u56Var7 = u56Var2;
                                if (u56Var7.b() == v94Var.e()) {
                                    return g2b.a;
                                }
                                u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                                boolean zB = u56Var7.b();
                                kha khaVar9 = khaVar;
                                ag7 ag7Var5 = ag7Var4;
                                if (zB && z2 && !z3) {
                                    m62.g(xhaVar, u56Var7, khaVar9, s85Var3, ag7Var5);
                                } else {
                                    m62.e(u56Var7);
                                }
                                if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                    oy0.d(t72Var, null, null, new j62(fw0Var, khaVar9, u56Var7, siaVarD, ag7Var5, null), 3);
                                }
                                if (!v94Var.e()) {
                                    qgaVar.g(null);
                                }
                                return g2b.a;
                            }
                        };
                        xhaVar = xhaVar;
                        ag7Var = ag7Var4;
                        qgaVar2 = qgaVar;
                        fw0Var2 = fw0Var;
                        z13 = z2;
                        khaVar3 = khaVar;
                        t72Var2 = t72Var;
                        bj4Var4.C(oh4Var11);
                        objF6 = oh4Var11;
                    } else {
                        bj4Var4 = bj4Var3;
                        u56Var2 = u56Var6;
                        z1bVar2 = z1bVar;
                        s85Var3 = s85Var2;
                        oh4 oh4Var12 = new oh4() { // from class: b62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                sia siaVarD;
                                v94 v94Var = (v94) obj;
                                u56 u56Var7 = u56Var2;
                                if (u56Var7.b() == v94Var.e()) {
                                    return g2b.a;
                                }
                                u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                                boolean zB = u56Var7.b();
                                kha khaVar9 = khaVar;
                                ag7 ag7Var5 = ag7Var4;
                                if (zB && z2 && !z3) {
                                    m62.g(xhaVar, u56Var7, khaVar9, s85Var3, ag7Var5);
                                } else {
                                    m62.e(u56Var7);
                                }
                                if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                    oy0.d(t72Var, null, null, new j62(fw0Var, khaVar9, u56Var7, siaVarD, ag7Var5, null), 3);
                                }
                                if (!v94Var.e()) {
                                    qgaVar.g(null);
                                }
                                return g2b.a;
                            }
                        };
                        xhaVar = xhaVar;
                        ag7Var = ag7Var4;
                        qgaVar2 = qgaVar;
                        fw0Var2 = fw0Var;
                        z13 = z2;
                        khaVar3 = khaVar;
                        t72Var2 = t72Var;
                        bj4Var4.C(oh4Var12);
                        objF6 = oh4Var12;
                    }
                    aVar2 = ox6.a.t;
                    ox6 ox6VarA8 = ia4.a(j84.c(ym2.b(aVar2, p94Var), (oh4) objF6), z13, h27Var);
                    if (z13) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    h37VarJ = bl7.j(Boolean.valueOf(z14), bj4Var4);
                    g2b g2bVar3 = g2b.a;
                    boolean zJ110 = bj4Var4.J(h37VarJ) | bj4Var4.j(u56Var2) | bj4Var4.j(xhaVar) | bj4Var4.j(qgaVar2);
                    if (i10 > 32) {
                        u56Var3 = u56Var2;
                        if ((r4 & 48) != 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        u56Var3 = u56Var2;
                        if ((r4 & 48) != 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    z16 = zJ110 | z15;
                    Object objF111 = bj4Var4.f();
                    if (z16) {
                        u56Var4 = u56Var3;
                        g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                        bj4Var4.C(g62Var);
                    } else {
                        u56Var4 = u56Var3;
                        g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                        bj4Var4.C(g62Var);
                    }
                    wd3.d(bj4Var4, (ci4) g62Var, g2bVar3);
                    ox6VarB = t6a.b(aVar2, 8675309, new va9(new rfa(u56Var4)));
                    qgaVar3 = qgaVar2;
                    t72 t72Var6 = t72Var2;
                    ag7Var2 = ag7Var;
                    xhaVar2 = xhaVar;
                    r0 = new oh4() { // from class: sfa
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            xv9 xv9Var2;
                            vf7 vf7Var = (vf7) obj;
                            u56 u56Var7 = u56Var4;
                            if (!u56Var7.b()) {
                                p94.a(p94Var);
                            } else if (!z3 && (xv9Var2 = u56Var7.c) != null) {
                                xv9Var2.b();
                            }
                            if (u56Var7.b() && z2) {
                                if (u56Var7.a() != bt4.u) {
                                    sia siaVarD = u56Var7.d();
                                    if (siaVarD != null) {
                                        long j6 = vf7Var.a;
                                        nd3 nd3Var2 = u56Var7.d;
                                        g75 g75Var4 = u56Var7.v;
                                        int iA = ag7Var2.a(siaVarD.b(j6, true));
                                        g75Var4.invoke(kha.a(nd3Var2.a, null, ay.c(iA, iA), 5));
                                        if (u56Var7.a.a.u.length() > 0) {
                                            u56Var7.k.setValue(bt4.v);
                                        }
                                    }
                                } else {
                                    qgaVar3.g(vf7Var);
                                }
                            }
                            return g2b.a;
                        }
                    };
                    if (z2) {
                        ox6VarB = it1.a(ox6VarB, new ei4() { // from class: vfa
                            @Override // defpackage.ei4
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                jt1 jt1Var2 = (jt1) obj2;
                                ((Integer) obj3).getClass();
                                jt1Var2.K(-102778667);
                                Object objF112 = jt1Var2.f();
                                jt1.a.C0187a c0187a2 = jt1.a.a;
                                if (objF112 == c0187a2) {
                                    c33 c33Var3 = wd3.a;
                                    nm8 nm8Var = new nm8(jt1Var2.x());
                                    jt1Var2.C(nm8Var);
                                    objF112 = nm8Var;
                                }
                                t72 t72Var7 = (t72) objF112;
                                Object objF20 = jt1Var2.f();
                                if (objF20 == c0187a2) {
                                    objF20 = bl7.i(null);
                                    jt1Var2.C(objF20);
                                }
                                final h37 h37Var = (h37) objF20;
                                h37 h37VarJ2 = bl7.j(r0, jt1Var2);
                                final h27 h27Var2 = h27Var;
                                boolean zJ111 = jt1Var2.J(h27Var2);
                                Object objF21 = jt1Var2.f();
                                if (zJ111 || objF21 == c0187a2) {
                                    objF21 = new oh4() { // from class: wfa
                                        @Override // defpackage.oh4
                                        public final Object invoke(Object obj4) {
                                            return new zfa(h37Var, h27Var2);
                                        }
                                    };
                                    jt1Var2.C(objF21);
                                }
                                wd3.a(h27Var2, (oh4) objF21, jt1Var2);
                                boolean zJ112 = jt1Var2.j(t72Var7) | jt1Var2.J(h27Var2) | jt1Var2.J(h37VarJ2);
                                Object objF22 = jt1Var2.f();
                                if (zJ112 || objF22 == c0187a2) {
                                    objF22 = new yfa(t72Var7, h37Var, h27Var2, h37VarJ2);
                                    jt1Var2.C(objF22);
                                }
                                ox6 ox6VarB5 = t6a.b(ox6.a.t, h27Var2, (PointerInputEventHandler) objF22);
                                jt1Var2.B();
                                return ox6VarB5;
                            }
                        });
                    }
                    ox6 ox6VarH8 = ox6VarB.H(new q6a(qgaVar3.A, qgaVar3.z, new tfa(qgaVar3), 4));
                    w48.a.getClass();
                    ox6 ox6VarC7 = by5.c(ox6VarH8, y48.u);
                    final ox6 ox6VarC8 = z63.c(aVar2, new oh4() { // from class: t52
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            d73 d73Var = (d73) obj;
                            u56 u56Var7 = u56Var4;
                            sia siaVarD = u56Var7.d();
                            if (siaVarD != null) {
                                n41 n41VarA = d73Var.Y0().a();
                                long j6 = ((lja) u56Var7.A.getValue()).a;
                                long j7 = ((lja) u56Var7.B.getValue()).a;
                                ria riaVar = siaVarD.a;
                                l07 l07Var = riaVar.b;
                                qia qiaVar = riaVar.a;
                                np npVar = u56Var7.y;
                                long j8 = u56Var7.z;
                                boolean zC2 = lja.c(j6);
                                ag7 ag7Var5 = ag7Var2;
                                if (!zC2) {
                                    npVar.f(j8);
                                    int iB3 = ag7Var5.b(lja.f(j6));
                                    int iB4 = ag7Var5.b(lja.e(j6));
                                    if (iB3 != iB4) {
                                        n41VarA.c(riaVar.i(iB3, iB4), npVar);
                                    }
                                } else if (lja.c(j7)) {
                                    kha khaVar9 = khaVar3;
                                    if (!lja.c(khaVar9.b)) {
                                        npVar.f(j8);
                                        long j9 = khaVar9.b;
                                        int iB5 = ag7Var5.b(lja.f(j9));
                                        int iB6 = ag7Var5.b(lja.e(j9));
                                        if (iB5 != iB6) {
                                            n41VarA.c(riaVar.i(iB5, iB6), npVar);
                                        }
                                    }
                                } else {
                                    long jB = qiaVar.b.b();
                                    uh1 uh1Var = new uh1(jB);
                                    if (jB == 16) {
                                        uh1Var = null;
                                    }
                                    long j10 = uh1Var != null ? uh1Var.a : uh1.b;
                                    npVar.f(uh1.b(uh1.d(j10) * 0.2f, j10));
                                    int iB7 = ag7Var5.b(lja.f(j7));
                                    int iB8 = ag7Var5.b(lja.e(j7));
                                    if (iB7 != iB8) {
                                        n41VarA.c(riaVar.i(iB7, iB8), npVar);
                                    }
                                }
                                boolean z215 = riaVar.d() && qiaVar.f != 3;
                                if (z215) {
                                    long j11 = riaVar.c;
                                    sk8 sk8VarA = tk8.a(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                    n41VarA.f();
                                    n41VarA.r(sk8VarA);
                                }
                                ww9 ww9Var = qiaVar.b.a;
                                fda fdaVar = ww9Var.m;
                                mha mhaVar = ww9Var.a;
                                if (fdaVar == null) {
                                    fdaVar = fda.b;
                                }
                                fda fdaVar2 = fdaVar;
                                el9 el9Var = ww9Var.n;
                                if (el9Var == null) {
                                    el9Var = el9.d;
                                }
                                el9 el9Var2 = el9Var;
                                e73 e73Var = ww9Var.p;
                                if (e73Var == null) {
                                    e73Var = zy3.a;
                                }
                                e73 e73Var2 = e73Var;
                                try {
                                    fx0 fx0VarE = mhaVar.e();
                                    mha.a aVar5 = mha.a.a;
                                    if (fx0VarE != null) {
                                        l07.j(l07Var, n41VarA, fx0VarE, mhaVar != aVar5 ? mhaVar.a() : 1.0f, el9Var2, fdaVar2, e73Var2);
                                    } else {
                                        l07.i(l07Var, n41VarA, mhaVar != aVar5 ? mhaVar.c() : uh1.b, el9Var2, fdaVar2, e73Var2);
                                    }
                                } finally {
                                    if (z215) {
                                        n41VarA.o();
                                    }
                                }
                            }
                            return g2b.a;
                        }
                    });
                    boolean zJ111 = bj4Var4.j(u56Var4);
                    if (i7 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zJ112 = zJ111 | z17 | bj4Var4.J(mmbVar) | bj4Var4.j(qgaVar3);
                    if (i8 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zJ3 = zJ112 | z18 | bj4Var4.j(ag7Var2);
                    objF7 = bj4Var4.f();
                    if (zJ3) {
                        final kha khaVar9 = khaVar3;
                        oh4 oh4Var13 = new oh4() { // from class: c62
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                gia giaVar2;
                                qq5 qq5Var;
                                qq5 qq5Var2;
                                u56 u56Var7 = u56Var4;
                                dt7 dt7Var = u56Var7.o;
                                qq5 qq5Var3 = (qq5) obj;
                                u56Var7.h = qq5Var3;
                                sia siaVarD = u56Var7.d();
                                if (siaVarD != null) {
                                    siaVarD.b = qq5Var3;
                                }
                                if (z2) {
                                    bt4 bt4VarA = u56Var7.a();
                                    bt4 bt4Var = bt4.u;
                                    qga qgaVar4 = qgaVar3;
                                    kha khaVar10 = khaVar9;
                                    if (bt4VarA == bt4Var) {
                                        if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                            qgaVar4.r();
                                        } else {
                                            qgaVar4.o();
                                        }
                                        u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                        u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                        dt7Var.setValue(Boolean.valueOf(lja.c(khaVar10.b)));
                                    } else if (u56Var7.a() == bt4.v) {
                                        dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    }
                                    ag7 ag7Var5 = ag7Var2;
                                    m62.f(u56Var7, khaVar10, ag7Var5);
                                    sia siaVarD2 = u56Var7.d();
                                    if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                        ria riaVar = siaVarD2.a;
                                        zda zdaVar = new zda(qq5Var);
                                        sk8 sk8VarA = fb9.a(qq5Var);
                                        sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                        if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                            giaVar2.b.c(khaVar10, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                        }
                                    }
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(oh4Var13);
                        objF7 = oh4Var13;
                    } else {
                        final kha khaVar10 = khaVar3;
                        oh4 oh4Var14 = new oh4() { // from class: c62
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                gia giaVar2;
                                qq5 qq5Var;
                                qq5 qq5Var2;
                                u56 u56Var7 = u56Var4;
                                dt7 dt7Var = u56Var7.o;
                                qq5 qq5Var3 = (qq5) obj;
                                u56Var7.h = qq5Var3;
                                sia siaVarD = u56Var7.d();
                                if (siaVarD != null) {
                                    siaVarD.b = qq5Var3;
                                }
                                if (z2) {
                                    bt4 bt4VarA = u56Var7.a();
                                    bt4 bt4Var = bt4.u;
                                    qga qgaVar4 = qgaVar3;
                                    kha khaVar11 = khaVar10;
                                    if (bt4VarA == bt4Var) {
                                        if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                            qgaVar4.r();
                                        } else {
                                            qgaVar4.o();
                                        }
                                        u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                        u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                        dt7Var.setValue(Boolean.valueOf(lja.c(khaVar11.b)));
                                    } else if (u56Var7.a() == bt4.v) {
                                        dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    }
                                    ag7 ag7Var5 = ag7Var2;
                                    m62.f(u56Var7, khaVar11, ag7Var5);
                                    sia siaVarD2 = u56Var7.d();
                                    if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                        ria riaVar = siaVarD2.a;
                                        zda zdaVar = new zda(qq5Var);
                                        sk8 sk8VarA = fb9.a(qq5Var);
                                        sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                        if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                            giaVar2.b.c(khaVar11, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                        }
                                    }
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(oh4Var14);
                        objF7 = oh4Var14;
                    }
                    final ox6 ox6VarB5 = oh7.b(aVar2, (oh4) objF7);
                    u56Var5 = u56Var4;
                    p62 p62Var4 = new p62(mvaVar, khaVar, u56Var5, z3, z2, ag7Var2, qgaVar3, s85Var, p94Var);
                    if (!z2) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        ox6VarA = it1.a(aVar2, new ei4() { // from class: qda
                            /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
                            @Override // defpackage.ei4
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Object objE;
                                ox6 ox6Var8 = (ox6) obj;
                                jt1 jt1Var2 = (jt1) obj2;
                                ((Integer) obj3).getClass();
                                jt1Var2.K(-84507373);
                                boolean zBooleanValue2 = ((Boolean) jt1Var2.F(qu1.x)).booleanValue();
                                boolean zC2 = jt1Var2.c(zBooleanValue2);
                                Object objF112 = jt1Var2.f();
                                jt1.a.C0187a c0187a2 = jt1.a.a;
                                if (zC2 || objF112 == c0187a2) {
                                    objF112 = new cd2(zBooleanValue2);
                                    jt1Var2.C(objF112);
                                }
                                final cd2 cd2Var = (cd2) objF112;
                                final fx0 fx0Var3 = fx0Var;
                                boolean z215 = ((fx0Var3 instanceof aw9) && ((aw9) fx0Var3).a == 16) ? false : true;
                                if (((mmb) jt1Var2.F(qu1.u)).a()) {
                                    final u56 u56Var7 = u56Var5;
                                    if (u56Var7.b()) {
                                        final kha khaVar11 = khaVar;
                                        if (lja.c(khaVar11.b) && z215) {
                                            jt1Var2.K(-707487962);
                                            iw iwVar5 = khaVar11.a;
                                            lja ljaVar3 = new lja(khaVar11.b);
                                            boolean zJ113 = jt1Var2.j(cd2Var);
                                            Object objF20 = jt1Var2.f();
                                            if (zJ113 || objF20 == c0187a2) {
                                                objF20 = new sda(cd2Var, null);
                                                jt1Var2.C(objF20);
                                            }
                                            wd3.f(iwVar5, ljaVar3, (ci4) objF20, jt1Var2);
                                            boolean zJ114 = jt1Var2.j(cd2Var);
                                            final ag7 ag7Var5 = ag7Var2;
                                            boolean zJ115 = jt1Var2.j(ag7Var5) | zJ114 | jt1Var2.J(khaVar11) | jt1Var2.j(u56Var7) | jt1Var2.J(fx0Var3);
                                            Object objF21 = jt1Var2.f();
                                            if (zJ115 || objF21 == c0187a2) {
                                                oh4 oh4Var15 = new oh4() { // from class: rda
                                                    @Override // defpackage.oh4
                                                    public final Object invoke(Object obj4) {
                                                        cz1 cz1Var = (cz1) obj4;
                                                        cz1Var.K1();
                                                        float fH = cd2Var.c.h();
                                                        if (fH != 0.0f) {
                                                            long j6 = khaVar11.b;
                                                            int i18 = lja.c;
                                                            int iB3 = ag7Var5.b((int) (j6 >> 32));
                                                            sia siaVarD = u56Var7.d();
                                                            sk8 sk8VarC = siaVarD != null ? siaVarD.a.c(iB3) : new sk8(0.0f, 0.0f, 0.0f, 0.0f);
                                                            float fFloor = (float) Math.floor(cz1Var.U0(2.0f));
                                                            float f = fFloor < 1.0f ? 1.0f : fFloor;
                                                            float f2 = f / 2.0f;
                                                            float f3 = sk8VarC.a + f2;
                                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() >> 32)) - f2;
                                                            if (f3 > fIntBitsToFloat) {
                                                                f3 = fIntBitsToFloat;
                                                            }
                                                            if (f3 >= f2) {
                                                                f2 = f3;
                                                            }
                                                            float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                                                            cz1Var.T0(fx0Var3, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.d)) & 4294967295L), f, fH);
                                                        }
                                                        return g2b.a;
                                                    }
                                                };
                                                jt1Var2.C(oh4Var15);
                                                objF21 = oh4Var15;
                                            }
                                            objE = z63.e(ox6Var8, (oh4) objF21);
                                            jt1Var2.B();
                                        } else {
                                            jt1Var2.K(-705473241);
                                            jt1Var2.B();
                                            objE = ox6.a.t;
                                        }
                                    } else {
                                        jt1Var2.K(-705473241);
                                        jt1Var2.B();
                                        objE = ox6.a.t;
                                    }
                                } else {
                                    jt1Var2.K(-705473241);
                                    jt1Var2.B();
                                    objE = ox6.a.t;
                                }
                                jt1Var2.B();
                                return objE;
                            }
                        });
                    } else {
                        ox6VarA = aVar2;
                    }
                    zJ4 = bj4Var4.j(qgaVar3);
                    objF8 = bj4Var4.f();
                    if (zJ4) {
                        objF8 = new oh4() { // from class: d62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return new k62(qgaVar3);
                            }
                        };
                        bj4Var4.C(objF8);
                    } else {
                        objF8 = new oh4() { // from class: d62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return new k62(qgaVar3);
                            }
                        };
                        bj4Var4.C(objF8);
                    }
                    wd3.a(qgaVar3, (oh4) objF8, bj4Var4);
                    boolean zJ113 = bj4Var4.j(u56Var5) | bj4Var4.j(xhaVar2);
                    if (i8 == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    z21 = zJ113 | z20 | ((i10 <= 32 && bj4Var4.J(s85Var)) || (i12 & 48) == 32);
                    objF9 = bj4Var4.f();
                    if (z21) {
                        objF9 = new oh4() { // from class: e62
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                u56 u56Var7 = u56Var5;
                                if (u56Var7.b()) {
                                    nd3 nd3Var2 = u56Var7.d;
                                    g75 g75Var4 = u56Var7.v;
                                    s56 s56Var = u56Var7.w;
                                    gl8 gl8Var = new gl8();
                                    yda ydaVar = new yda(nd3Var2, g75Var4, gl8Var);
                                    xha xhaVar4 = xhaVar2;
                                    y18 y18Var = xhaVar4.a;
                                    y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                    ?? giaVar2 = new gia(xhaVar4, y18Var);
                                    xhaVar4.b.set((gia) giaVar2);
                                    gl8Var.t = giaVar2;
                                    u56Var7.e = giaVar2;
                                }
                                return new l62();
                            }
                        };
                        bj4Var4.C(objF9);
                    } else {
                        objF9 = new oh4() { // from class: e62
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                u56 u56Var7 = u56Var5;
                                if (u56Var7.b()) {
                                    nd3 nd3Var2 = u56Var7.d;
                                    g75 g75Var4 = u56Var7.v;
                                    s56 s56Var = u56Var7.w;
                                    gl8 gl8Var = new gl8();
                                    yda ydaVar = new yda(nd3Var2, g75Var4, gl8Var);
                                    xha xhaVar4 = xhaVar2;
                                    y18 y18Var = xhaVar4.a;
                                    y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                    ?? giaVar2 = new gia(xhaVar4, y18Var);
                                    xhaVar4.b.set((gia) giaVar2);
                                    gl8Var.t = giaVar2;
                                    u56Var7.e = giaVar2;
                                }
                                return new l62();
                            }
                        };
                        bj4Var4.C(objF9);
                    }
                    wd3.a(s85Var, (oh4) objF9, bj4Var4);
                    final oh4 g75Var4 = u56Var5.v;
                    if (i == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    final int i18 = s85Var.e;
                    final z1b z1bVar6 = z1bVar2;
                    ox6 ox6VarA9 = it1.a(aVar2, new ei4() { // from class: cfa
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(851809892);
                            Object objF112 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (objF112 == c0187a2) {
                                objF112 = new kja();
                                jt1Var2.C(objF112);
                            }
                            kja kjaVar = (kja) objF112;
                            Object objF20 = jt1Var2.f();
                            if (objF20 == c0187a2) {
                                objF20 = new vm2();
                                jt1Var2.C(objF20);
                            }
                            bfa bfaVar = new bfa(u56Var5, qgaVar3, khaVar, z212, z22, kjaVar, ag7Var2, z1bVar6, (vm2) objF20, g75Var4, i18);
                            boolean zJ114 = jt1Var2.j(bfaVar);
                            Object objF21 = jt1Var2.f();
                            if (zJ114 || objF21 == c0187a2) {
                                dfa dfaVar = new dfa(1, bfaVar, bfa.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                                jt1Var2.C(dfaVar);
                                objF21 = dfaVar;
                            }
                            qo5 qo5Var = new qo5((oh4) ((yn5) objF21), null);
                            jt1Var2.B();
                            return qo5Var;
                        }
                    });
                    i11 = s85Var.d;
                    if (i11 == 7) {
                        z23 = false;
                    } else {
                        z23 = true;
                    }
                    zBooleanValue = ((Boolean) h37VarJ.getValue()).booleanValue();
                    zC = bj4Var4.c(z23) | bj4Var4.j(n56Var);
                    objF10 = bj4Var4.f();
                    if (zC) {
                        objF10 = new mh4() { // from class: f62
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                if (z23) {
                                    n56Var.i();
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(objF10);
                    } else {
                        objF10 = new mh4() { // from class: f62
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                if (z23) {
                                    n56Var.i();
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(objF10);
                    }
                    mh4 mh4Var4 = (mh4) objF10;
                    if (zBooleanValue) {
                        ox6VarH = aVar2;
                    } else {
                        ox6VarH = aVar2;
                    }
                    fx0Var2 = (fx0) bj4Var4.F(lf0.a);
                    j2 = ((uh1) bj4Var4.F(lf0.b)).a;
                    if (uh1.c(j2, u7d.c(1308617531))) {
                        aw9Var = new aw9(j2);
                    } else {
                        aw9Var = fx0Var2;
                    }
                    zJ5 = bj4Var4.j(u56Var5) | bj4Var4.J(aw9Var);
                    objF11 = bj4Var4.f();
                    if (zJ5) {
                        z24 = false;
                        objF11 = new r52(0, u56Var5, aw9Var);
                        bj4Var4.C(objF11);
                    } else {
                        z24 = false;
                        objF11 = new r52(0, u56Var5, aw9Var);
                        bj4Var4.C(objF11);
                    }
                    ox6 ox6VarH9 = oh7.b(it1.a(ro5.a(ro5.a(ox6Var.H(z63.e(aVar2, (oh4) objF11)).H(new f56(n56Var, u56Var5, qgaVar3)).H(ox6VarH).H(ox6VarA8), new cea(d94Var, u56Var5)), new o62(u56Var5, qgaVar3)).H(ox6VarA9), new ei4() { // from class: bga
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            gga ggaVar2 = ggaVar;
                            dt7 dt7Var = ggaVar2.f;
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(-2137546592);
                            boolean z215 = ((fl7) dt7Var.getValue()) == fl7.t || !(jt1Var2.F(qu1.n) == tq5.u);
                            boolean zJ114 = jt1Var2.J(ggaVar2);
                            Object objF112 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (zJ114 || objF112 == c0187a2) {
                                objF112 = new a26(1, ggaVar2);
                                jt1Var2.C(objF112);
                            }
                            h37 h37VarJ2 = bl7.j((oh4) objF112, jt1Var2);
                            Object objF20 = jt1Var2.f();
                            if (objF20 == c0187a2) {
                                ht2 ht2Var = new ht2(new r58(1, h37VarJ2));
                                jt1Var2.C(ht2Var);
                                objF20 = ht2Var;
                            }
                            s79 s79Var = (s79) objF20;
                            boolean zJ115 = jt1Var2.J(s79Var) | jt1Var2.J(ggaVar2);
                            Object objF21 = jt1Var2.f();
                            if (zJ115 || objF21 == c0187a2) {
                                objF21 = new cga(s79Var, ggaVar2);
                                jt1Var2.C(objF21);
                            }
                            ox6 ox6VarB6 = d79.b((cga) objF21, (fl7) dt7Var.getValue(), z2 && ggaVar2.b.h() != 0.0f, z215, h27Var);
                            jt1Var2.B();
                            return ox6VarB6;
                        }
                    }).H(ox6VarC7).H(p62Var4), new j11(1, u56Var5)).H(new mb(new d11(1, qgaVar3, t72Var6)));
                    if (z2) {
                        z24 = true;
                    }
                    if (z24) {
                        ox6VarA2 = aVar2;
                    } else {
                        ox6VarA2 = aVar2;
                    }
                    final boolean z215 = z24;
                    bj4 bj4Var8 = bj4Var4;
                    final fw0 fw0Var6 = fw0Var2;
                    final ox6 ox6Var8 = ox6VarA2;
                    final tx2 tx2Var7 = tx2Var2;
                    final ox6 ox6Var9 = ox6VarA;
                    ci4 ci4Var4 = new ci4() { // from class: z52
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            jt1 jt1Var2 = (jt1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final u56 u56Var7 = u56Var5;
                                final wja wjaVar3 = wjaVar;
                                final int i19 = i2;
                                final int i110 = i;
                                final gga ggaVar2 = ggaVar;
                                final kha khaVar11 = khaVar;
                                final ojb ojbVar2 = ojbVar;
                                final ox6 ox6Var10 = ox6Var9;
                                final ox6 ox6Var11 = ox6VarC8;
                                final ox6 ox6Var12 = ox6VarB5;
                                final ox6 ox6Var13 = ox6Var8;
                                final fw0 fw0Var7 = fw0Var6;
                                final qga qgaVar4 = qgaVar3;
                                final boolean z30 = z215;
                                final boolean z31 = z3;
                                final oh4 oh4Var15 = oh4Var2;
                                final ag7 ag7Var5 = ag7Var2;
                                final tx2 tx2Var8 = tx2Var7;
                                ei4Var.invoke(gr1.b(-44346382, new ci4() { // from class: u52
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj3, Object obj4) {
                                        ox6 kebVar;
                                        jt1 jt1Var3 = (jt1) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (jt1Var3.A(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            final u56 u56Var8 = u56Var7;
                                            ox6 ox6VarE = ir9.e(ox6.a.t, ((y43) u56Var8.g.getValue()).t, 0.0f, 2);
                                            int i111 = i19;
                                            final int i112 = i110;
                                            cv4.a(i111, i112);
                                            wja wjaVar4 = wjaVar3;
                                            if (i111 != 1 || i112 != Integer.MAX_VALUE) {
                                                ox6VarE = ox6VarE.H(new bv4(wjaVar4, i111, i112));
                                            }
                                            boolean zJ114 = jt1Var3.j(u56Var8);
                                            Object objF112 = jt1Var3.f();
                                            if (zJ114 || objF112 == jt1.a.a) {
                                                objF112 = new w01(1, u56Var8);
                                                jt1Var3.C(objF112);
                                            }
                                            mh4 mh4Var5 = (mh4) objF112;
                                            gga ggaVar3 = ggaVar2;
                                            fl7 fl7Var3 = (fl7) ggaVar3.f.getValue();
                                            final kha khaVar12 = khaVar11;
                                            long j6 = khaVar12.b;
                                            int i20 = lja.c;
                                            int iF = (int) (j6 >> 32);
                                            long j7 = ggaVar3.e;
                                            if (iF == ((int) (j7 >> 32)) && (iF = (int) (j6 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                                                iF = lja.f(j6);
                                            }
                                            ggaVar3.e = khaVar12.b;
                                            mva mvaVarA2 = n7b.a(ojbVar2, khaVar12.a);
                                            int iOrdinal = fl7Var3.ordinal();
                                            if (iOrdinal == 0) {
                                                kebVar = new keb(ggaVar3, iF, mvaVarA2, mh4Var5);
                                            } else {
                                                if (iOrdinal != 1) {
                                                    u.b();
                                                    return null;
                                                }
                                                kebVar = new l15(ggaVar3, iF, mvaVarA2, mh4Var5);
                                            }
                                            ox6 ox6VarA10 = kw0.a(uma.b(ox6VarE).H(kebVar).H(ox6Var10).H(ox6Var11).H(new gha(wjaVar4)).H(ox6Var12).H(ox6Var13), fw0Var7);
                                            final qga qgaVar5 = qgaVar4;
                                            final boolean z32 = z30;
                                            final boolean z33 = z31;
                                            final oh4 oh4Var16 = oh4Var15;
                                            final ag7 ag7Var6 = ag7Var5;
                                            final tx2 tx2Var9 = tx2Var8;
                                            lp9.a(ox6VarA10, gr1.b(1412697320, new ci4() { // from class: v52
                                                /* JADX WARN: Code duplicated, block: B:22:0x0099  */
                                                @Override // defpackage.ci4
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    boolean z34;
                                                    jt1 jt1Var4 = (jt1) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (jt1Var4.A(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        u56 u56Var9 = u56Var8;
                                                        i62 i62Var = new i62(u56Var9, oh4Var16, khaVar12, ag7Var6, tx2Var9, i112);
                                                        int iHashCode = Long.hashCode(jt1Var4.v());
                                                        kw7 kw7VarY = jt1Var4.y();
                                                        ox6 ox6VarC9 = it1.c(jt1Var4, ox6.a.t);
                                                        bt1.c.getClass();
                                                        qr5.a aVar5 = bt1.a.b;
                                                        if (jt1Var4.s() == null) {
                                                            ml5.c();
                                                            throw null;
                                                        }
                                                        jt1Var4.q();
                                                        if (jt1Var4.l()) {
                                                            jt1Var4.k(aVar5);
                                                        } else {
                                                            jt1Var4.z();
                                                        }
                                                        rd7.d(jt1Var4, bt1.a.f, i62Var);
                                                        rd7.d(jt1Var4, bt1.a.e, kw7VarY);
                                                        rd7.d(jt1Var4, bt1.a.g, Integer.valueOf(iHashCode));
                                                        rd7.c(jt1Var4, bt1.a.h);
                                                        rd7.d(jt1Var4, bt1.a.d, ox6VarC9);
                                                        jt1Var4.I();
                                                        bt4 bt4VarA = u56Var9.a();
                                                        bt4 bt4Var = bt4.t;
                                                        boolean z35 = z32;
                                                        if (bt4VarA != bt4Var && u56Var9.c() != null) {
                                                            qq5 qq5VarC = u56Var9.c();
                                                            qq5VarC.getClass();
                                                            z34 = qq5VarC.e() && z35;
                                                        }
                                                        qga qgaVar6 = qgaVar5;
                                                        m62.c(qgaVar6, z34, jt1Var4, 0);
                                                        if (u56Var9.a() == bt4.v && !z33 && z35) {
                                                            jt1Var4.K(-714666198);
                                                            m62.d(qgaVar6, jt1Var4, 0);
                                                            jt1Var4.B();
                                                        } else {
                                                            jt1Var4.K(-714589318);
                                                            jt1Var4.B();
                                                        }
                                                    } else {
                                                        jt1Var4.u();
                                                    }
                                                    return g2b.a;
                                                }
                                            }, jt1Var3), jt1Var3, 48);
                                        } else {
                                            jt1Var3.u();
                                        }
                                        return g2b.a;
                                    }
                                }, jt1Var2), jt1Var2, 6);
                            } else {
                                jt1Var2.u();
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var = bj4Var8;
                    b(ox6VarH9, qgaVar3, gr1.b(-814563849, ci4Var4, bj4Var), bj4Var, 384);
                } else {
                    s85Var2 = s85Var;
                }
                z11 = z10;
                i10 = i9;
                if ((i12 & 48) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zJ2 = z11 | z12 | bj4Var3.j(ag7Var4) | bj4Var3.j(t72Var) | bj4Var3.j(fw0Var) | bj4Var3.j(qgaVar);
                objF6 = bj4Var3.f();
                if (zJ2) {
                    bj4Var4 = bj4Var3;
                    u56Var2 = u56Var6;
                    z1bVar2 = z1bVar;
                    s85Var3 = s85Var2;
                    oh4 oh4Var15 = new oh4() { // from class: b62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            sia siaVarD;
                            v94 v94Var = (v94) obj;
                            u56 u56Var7 = u56Var2;
                            if (u56Var7.b() == v94Var.e()) {
                                return g2b.a;
                            }
                            u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                            boolean zB = u56Var7.b();
                            kha khaVar11 = khaVar;
                            ag7 ag7Var5 = ag7Var4;
                            if (zB && z2 && !z3) {
                                m62.g(xhaVar, u56Var7, khaVar11, s85Var3, ag7Var5);
                            } else {
                                m62.e(u56Var7);
                            }
                            if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                oy0.d(t72Var, null, null, new j62(fw0Var, khaVar11, u56Var7, siaVarD, ag7Var5, null), 3);
                            }
                            if (!v94Var.e()) {
                                qgaVar.g(null);
                            }
                            return g2b.a;
                        }
                    };
                    xhaVar = xhaVar;
                    ag7Var = ag7Var4;
                    qgaVar2 = qgaVar;
                    fw0Var2 = fw0Var;
                    z13 = z2;
                    khaVar3 = khaVar;
                    t72Var2 = t72Var;
                    bj4Var4.C(oh4Var15);
                    objF6 = oh4Var15;
                } else {
                    bj4Var4 = bj4Var3;
                    u56Var2 = u56Var6;
                    z1bVar2 = z1bVar;
                    s85Var3 = s85Var2;
                    oh4 oh4Var16 = new oh4() { // from class: b62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            sia siaVarD;
                            v94 v94Var = (v94) obj;
                            u56 u56Var7 = u56Var2;
                            if (u56Var7.b() == v94Var.e()) {
                                return g2b.a;
                            }
                            u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                            boolean zB = u56Var7.b();
                            kha khaVar11 = khaVar;
                            ag7 ag7Var5 = ag7Var4;
                            if (zB && z2 && !z3) {
                                m62.g(xhaVar, u56Var7, khaVar11, s85Var3, ag7Var5);
                            } else {
                                m62.e(u56Var7);
                            }
                            if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                oy0.d(t72Var, null, null, new j62(fw0Var, khaVar11, u56Var7, siaVarD, ag7Var5, null), 3);
                            }
                            if (!v94Var.e()) {
                                qgaVar.g(null);
                            }
                            return g2b.a;
                        }
                    };
                    xhaVar = xhaVar;
                    ag7Var = ag7Var4;
                    qgaVar2 = qgaVar;
                    fw0Var2 = fw0Var;
                    z13 = z2;
                    khaVar3 = khaVar;
                    t72Var2 = t72Var;
                    bj4Var4.C(oh4Var16);
                    objF6 = oh4Var16;
                }
                aVar2 = ox6.a.t;
                ox6 ox6VarA10 = ia4.a(j84.c(ym2.b(aVar2, p94Var), (oh4) objF6), z13, h27Var);
                if (z13) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                h37VarJ = bl7.j(Boolean.valueOf(z14), bj4Var4);
                g2b g2bVar4 = g2b.a;
                boolean zJ114 = bj4Var4.J(h37VarJ) | bj4Var4.j(u56Var2) | bj4Var4.j(xhaVar) | bj4Var4.j(qgaVar2);
                if (i10 > 32) {
                    u56Var3 = u56Var2;
                    if ((r4 & 48) != 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                } else {
                    u56Var3 = u56Var2;
                    if ((r4 & 48) != 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                z16 = zJ114 | z15;
                Object objF112 = bj4Var4.f();
                if (z16) {
                    u56Var4 = u56Var3;
                    g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                    bj4Var4.C(g62Var);
                } else {
                    u56Var4 = u56Var3;
                    g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                    bj4Var4.C(g62Var);
                }
                wd3.d(bj4Var4, (ci4) g62Var, g2bVar4);
                ox6VarB = t6a.b(aVar2, 8675309, new va9(new rfa(u56Var4)));
                qgaVar3 = qgaVar2;
                t72 t72Var7 = t72Var2;
                ag7Var2 = ag7Var;
                xhaVar2 = xhaVar;
                r0 = new oh4() { // from class: sfa
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        xv9 xv9Var2;
                        vf7 vf7Var = (vf7) obj;
                        u56 u56Var7 = u56Var4;
                        if (!u56Var7.b()) {
                            p94.a(p94Var);
                        } else if (!z3 && (xv9Var2 = u56Var7.c) != null) {
                            xv9Var2.b();
                        }
                        if (u56Var7.b() && z2) {
                            if (u56Var7.a() != bt4.u) {
                                sia siaVarD = u56Var7.d();
                                if (siaVarD != null) {
                                    long j6 = vf7Var.a;
                                    nd3 nd3Var2 = u56Var7.d;
                                    g75 g75Var5 = u56Var7.v;
                                    int iA = ag7Var2.a(siaVarD.b(j6, true));
                                    g75Var5.invoke(kha.a(nd3Var2.a, null, ay.c(iA, iA), 5));
                                    if (u56Var7.a.a.u.length() > 0) {
                                        u56Var7.k.setValue(bt4.v);
                                    }
                                }
                            } else {
                                qgaVar3.g(vf7Var);
                            }
                        }
                        return g2b.a;
                    }
                };
                if (z2) {
                    ox6VarB = it1.a(ox6VarB, new ei4() { // from class: vfa
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(-102778667);
                            Object objF113 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (objF113 == c0187a2) {
                                c33 c33Var3 = wd3.a;
                                nm8 nm8Var = new nm8(jt1Var2.x());
                                jt1Var2.C(nm8Var);
                                objF113 = nm8Var;
                            }
                            t72 t72Var8 = (t72) objF113;
                            Object objF20 = jt1Var2.f();
                            if (objF20 == c0187a2) {
                                objF20 = bl7.i(null);
                                jt1Var2.C(objF20);
                            }
                            final h37 h37Var = (h37) objF20;
                            h37 h37VarJ2 = bl7.j(r0, jt1Var2);
                            final h27 h27Var2 = h27Var;
                            boolean zJ115 = jt1Var2.J(h27Var2);
                            Object objF21 = jt1Var2.f();
                            if (zJ115 || objF21 == c0187a2) {
                                objF21 = new oh4() { // from class: wfa
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj4) {
                                        return new zfa(h37Var, h27Var2);
                                    }
                                };
                                jt1Var2.C(objF21);
                            }
                            wd3.a(h27Var2, (oh4) objF21, jt1Var2);
                            boolean zJ116 = jt1Var2.j(t72Var8) | jt1Var2.J(h27Var2) | jt1Var2.J(h37VarJ2);
                            Object objF22 = jt1Var2.f();
                            if (zJ116 || objF22 == c0187a2) {
                                objF22 = new yfa(t72Var8, h37Var, h27Var2, h37VarJ2);
                                jt1Var2.C(objF22);
                            }
                            ox6 ox6VarB6 = t6a.b(ox6.a.t, h27Var2, (PointerInputEventHandler) objF22);
                            jt1Var2.B();
                            return ox6VarB6;
                        }
                    });
                }
                ox6 ox6VarH10 = ox6VarB.H(new q6a(qgaVar3.A, qgaVar3.z, new tfa(qgaVar3), 4));
                w48.a.getClass();
                ox6 ox6VarC9 = by5.c(ox6VarH10, y48.u);
                final ox6 ox6VarC10 = z63.c(aVar2, new oh4() { // from class: t52
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        d73 d73Var = (d73) obj;
                        u56 u56Var7 = u56Var4;
                        sia siaVarD = u56Var7.d();
                        if (siaVarD != null) {
                            n41 n41VarA = d73Var.Y0().a();
                            long j6 = ((lja) u56Var7.A.getValue()).a;
                            long j7 = ((lja) u56Var7.B.getValue()).a;
                            ria riaVar = siaVarD.a;
                            l07 l07Var = riaVar.b;
                            qia qiaVar = riaVar.a;
                            np npVar = u56Var7.y;
                            long j8 = u56Var7.z;
                            boolean zC2 = lja.c(j6);
                            ag7 ag7Var5 = ag7Var2;
                            if (!zC2) {
                                npVar.f(j8);
                                int iB3 = ag7Var5.b(lja.f(j6));
                                int iB4 = ag7Var5.b(lja.e(j6));
                                if (iB3 != iB4) {
                                    n41VarA.c(riaVar.i(iB3, iB4), npVar);
                                }
                            } else if (lja.c(j7)) {
                                kha khaVar11 = khaVar3;
                                if (!lja.c(khaVar11.b)) {
                                    npVar.f(j8);
                                    long j9 = khaVar11.b;
                                    int iB5 = ag7Var5.b(lja.f(j9));
                                    int iB6 = ag7Var5.b(lja.e(j9));
                                    if (iB5 != iB6) {
                                        n41VarA.c(riaVar.i(iB5, iB6), npVar);
                                    }
                                }
                            } else {
                                long jB = qiaVar.b.b();
                                uh1 uh1Var = new uh1(jB);
                                if (jB == 16) {
                                    uh1Var = null;
                                }
                                long j10 = uh1Var != null ? uh1Var.a : uh1.b;
                                npVar.f(uh1.b(uh1.d(j10) * 0.2f, j10));
                                int iB7 = ag7Var5.b(lja.f(j7));
                                int iB8 = ag7Var5.b(lja.e(j7));
                                if (iB7 != iB8) {
                                    n41VarA.c(riaVar.i(iB7, iB8), npVar);
                                }
                            }
                            boolean z216 = riaVar.d() && qiaVar.f != 3;
                            if (z216) {
                                long j11 = riaVar.c;
                                sk8 sk8VarA = tk8.a(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                n41VarA.f();
                                n41VarA.r(sk8VarA);
                            }
                            ww9 ww9Var = qiaVar.b.a;
                            fda fdaVar = ww9Var.m;
                            mha mhaVar = ww9Var.a;
                            if (fdaVar == null) {
                                fdaVar = fda.b;
                            }
                            fda fdaVar2 = fdaVar;
                            el9 el9Var = ww9Var.n;
                            if (el9Var == null) {
                                el9Var = el9.d;
                            }
                            el9 el9Var2 = el9Var;
                            e73 e73Var = ww9Var.p;
                            if (e73Var == null) {
                                e73Var = zy3.a;
                            }
                            e73 e73Var2 = e73Var;
                            try {
                                fx0 fx0VarE = mhaVar.e();
                                mha.a aVar5 = mha.a.a;
                                if (fx0VarE != null) {
                                    l07.j(l07Var, n41VarA, fx0VarE, mhaVar != aVar5 ? mhaVar.a() : 1.0f, el9Var2, fdaVar2, e73Var2);
                                } else {
                                    l07.i(l07Var, n41VarA, mhaVar != aVar5 ? mhaVar.c() : uh1.b, el9Var2, fdaVar2, e73Var2);
                                }
                            } finally {
                                if (z216) {
                                    n41VarA.o();
                                }
                            }
                        }
                        return g2b.a;
                    }
                });
                boolean zJ115 = bj4Var4.j(u56Var4);
                if (i7 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zJ116 = zJ115 | z17 | bj4Var4.J(mmbVar) | bj4Var4.j(qgaVar3);
                if (i8 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zJ3 = zJ116 | z18 | bj4Var4.j(ag7Var2);
                objF7 = bj4Var4.f();
                if (zJ3) {
                    final kha khaVar11 = khaVar3;
                    oh4 oh4Var17 = new oh4() { // from class: c62
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            gia giaVar2;
                            qq5 qq5Var;
                            qq5 qq5Var2;
                            u56 u56Var7 = u56Var4;
                            dt7 dt7Var = u56Var7.o;
                            qq5 qq5Var3 = (qq5) obj;
                            u56Var7.h = qq5Var3;
                            sia siaVarD = u56Var7.d();
                            if (siaVarD != null) {
                                siaVarD.b = qq5Var3;
                            }
                            if (z2) {
                                bt4 bt4VarA = u56Var7.a();
                                bt4 bt4Var = bt4.u;
                                qga qgaVar4 = qgaVar3;
                                kha khaVar12 = khaVar11;
                                if (bt4VarA == bt4Var) {
                                    if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                        qgaVar4.r();
                                    } else {
                                        qgaVar4.o();
                                    }
                                    u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                    dt7Var.setValue(Boolean.valueOf(lja.c(khaVar12.b)));
                                } else if (u56Var7.a() == bt4.v) {
                                    dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                }
                                ag7 ag7Var5 = ag7Var2;
                                m62.f(u56Var7, khaVar12, ag7Var5);
                                sia siaVarD2 = u56Var7.d();
                                if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                    ria riaVar = siaVarD2.a;
                                    zda zdaVar = new zda(qq5Var);
                                    sk8 sk8VarA = fb9.a(qq5Var);
                                    sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                    if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                        giaVar2.b.c(khaVar12, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                    }
                                }
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(oh4Var17);
                    objF7 = oh4Var17;
                } else {
                    final kha khaVar12 = khaVar3;
                    oh4 oh4Var18 = new oh4() { // from class: c62
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            gia giaVar2;
                            qq5 qq5Var;
                            qq5 qq5Var2;
                            u56 u56Var7 = u56Var4;
                            dt7 dt7Var = u56Var7.o;
                            qq5 qq5Var3 = (qq5) obj;
                            u56Var7.h = qq5Var3;
                            sia siaVarD = u56Var7.d();
                            if (siaVarD != null) {
                                siaVarD.b = qq5Var3;
                            }
                            if (z2) {
                                bt4 bt4VarA = u56Var7.a();
                                bt4 bt4Var = bt4.u;
                                qga qgaVar4 = qgaVar3;
                                kha khaVar13 = khaVar12;
                                if (bt4VarA == bt4Var) {
                                    if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                        qgaVar4.r();
                                    } else {
                                        qgaVar4.o();
                                    }
                                    u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                    dt7Var.setValue(Boolean.valueOf(lja.c(khaVar13.b)));
                                } else if (u56Var7.a() == bt4.v) {
                                    dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                }
                                ag7 ag7Var5 = ag7Var2;
                                m62.f(u56Var7, khaVar13, ag7Var5);
                                sia siaVarD2 = u56Var7.d();
                                if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                    ria riaVar = siaVarD2.a;
                                    zda zdaVar = new zda(qq5Var);
                                    sk8 sk8VarA = fb9.a(qq5Var);
                                    sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                    if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                        giaVar2.b.c(khaVar13, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                    }
                                }
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(oh4Var18);
                    objF7 = oh4Var18;
                }
                final ox6 ox6VarB6 = oh7.b(aVar2, (oh4) objF7);
                u56Var5 = u56Var4;
                p62 p62Var5 = new p62(mvaVar, khaVar, u56Var5, z3, z2, ag7Var2, qgaVar3, s85Var, p94Var);
                if (!z2) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    ox6VarA = it1.a(aVar2, new ei4() { // from class: qda
                        /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Object objE;
                            ox6 ox6Var10 = (ox6) obj;
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(-84507373);
                            boolean zBooleanValue2 = ((Boolean) jt1Var2.F(qu1.x)).booleanValue();
                            boolean zC2 = jt1Var2.c(zBooleanValue2);
                            Object objF113 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (zC2 || objF113 == c0187a2) {
                                objF113 = new cd2(zBooleanValue2);
                                jt1Var2.C(objF113);
                            }
                            final cd2 cd2Var = (cd2) objF113;
                            final fx0 fx0Var3 = fx0Var;
                            boolean z216 = ((fx0Var3 instanceof aw9) && ((aw9) fx0Var3).a == 16) ? false : true;
                            if (((mmb) jt1Var2.F(qu1.u)).a()) {
                                final u56 u56Var7 = u56Var5;
                                if (u56Var7.b()) {
                                    final kha khaVar13 = khaVar;
                                    if (lja.c(khaVar13.b) && z216) {
                                        jt1Var2.K(-707487962);
                                        iw iwVar5 = khaVar13.a;
                                        lja ljaVar3 = new lja(khaVar13.b);
                                        boolean zJ117 = jt1Var2.j(cd2Var);
                                        Object objF20 = jt1Var2.f();
                                        if (zJ117 || objF20 == c0187a2) {
                                            objF20 = new sda(cd2Var, null);
                                            jt1Var2.C(objF20);
                                        }
                                        wd3.f(iwVar5, ljaVar3, (ci4) objF20, jt1Var2);
                                        boolean zJ118 = jt1Var2.j(cd2Var);
                                        final ag7 ag7Var5 = ag7Var2;
                                        boolean zJ119 = jt1Var2.j(ag7Var5) | zJ118 | jt1Var2.J(khaVar13) | jt1Var2.j(u56Var7) | jt1Var2.J(fx0Var3);
                                        Object objF21 = jt1Var2.f();
                                        if (zJ119 || objF21 == c0187a2) {
                                            oh4 oh4Var19 = new oh4() { // from class: rda
                                                @Override // defpackage.oh4
                                                public final Object invoke(Object obj4) {
                                                    cz1 cz1Var = (cz1) obj4;
                                                    cz1Var.K1();
                                                    float fH = cd2Var.c.h();
                                                    if (fH != 0.0f) {
                                                        long j6 = khaVar13.b;
                                                        int i19 = lja.c;
                                                        int iB3 = ag7Var5.b((int) (j6 >> 32));
                                                        sia siaVarD = u56Var7.d();
                                                        sk8 sk8VarC = siaVarD != null ? siaVarD.a.c(iB3) : new sk8(0.0f, 0.0f, 0.0f, 0.0f);
                                                        float fFloor = (float) Math.floor(cz1Var.U0(2.0f));
                                                        float f = fFloor < 1.0f ? 1.0f : fFloor;
                                                        float f2 = f / 2.0f;
                                                        float f3 = sk8VarC.a + f2;
                                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() >> 32)) - f2;
                                                        if (f3 > fIntBitsToFloat) {
                                                            f3 = fIntBitsToFloat;
                                                        }
                                                        if (f3 >= f2) {
                                                            f2 = f3;
                                                        }
                                                        float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                                                        cz1Var.T0(fx0Var3, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.d)) & 4294967295L), f, fH);
                                                    }
                                                    return g2b.a;
                                                }
                                            };
                                            jt1Var2.C(oh4Var19);
                                            objF21 = oh4Var19;
                                        }
                                        objE = z63.e(ox6Var10, (oh4) objF21);
                                        jt1Var2.B();
                                    } else {
                                        jt1Var2.K(-705473241);
                                        jt1Var2.B();
                                        objE = ox6.a.t;
                                    }
                                } else {
                                    jt1Var2.K(-705473241);
                                    jt1Var2.B();
                                    objE = ox6.a.t;
                                }
                            } else {
                                jt1Var2.K(-705473241);
                                jt1Var2.B();
                                objE = ox6.a.t;
                            }
                            jt1Var2.B();
                            return objE;
                        }
                    });
                } else {
                    ox6VarA = aVar2;
                }
                zJ4 = bj4Var4.j(qgaVar3);
                objF8 = bj4Var4.f();
                if (zJ4) {
                    objF8 = new oh4() { // from class: d62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return new k62(qgaVar3);
                        }
                    };
                    bj4Var4.C(objF8);
                } else {
                    objF8 = new oh4() { // from class: d62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return new k62(qgaVar3);
                        }
                    };
                    bj4Var4.C(objF8);
                }
                wd3.a(qgaVar3, (oh4) objF8, bj4Var4);
                boolean zJ117 = bj4Var4.j(u56Var5) | bj4Var4.j(xhaVar2);
                if (i8 == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = zJ117 | z20 | ((i10 <= 32 && bj4Var4.J(s85Var)) || (i12 & 48) == 32);
                objF9 = bj4Var4.f();
                if (z21) {
                    objF9 = new oh4() { // from class: e62
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            u56 u56Var7 = u56Var5;
                            if (u56Var7.b()) {
                                nd3 nd3Var2 = u56Var7.d;
                                g75 g75Var5 = u56Var7.v;
                                s56 s56Var = u56Var7.w;
                                gl8 gl8Var = new gl8();
                                yda ydaVar = new yda(nd3Var2, g75Var5, gl8Var);
                                xha xhaVar4 = xhaVar2;
                                y18 y18Var = xhaVar4.a;
                                y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                ?? giaVar2 = new gia(xhaVar4, y18Var);
                                xhaVar4.b.set((gia) giaVar2);
                                gl8Var.t = giaVar2;
                                u56Var7.e = giaVar2;
                            }
                            return new l62();
                        }
                    };
                    bj4Var4.C(objF9);
                } else {
                    objF9 = new oh4() { // from class: e62
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            u56 u56Var7 = u56Var5;
                            if (u56Var7.b()) {
                                nd3 nd3Var2 = u56Var7.d;
                                g75 g75Var5 = u56Var7.v;
                                s56 s56Var = u56Var7.w;
                                gl8 gl8Var = new gl8();
                                yda ydaVar = new yda(nd3Var2, g75Var5, gl8Var);
                                xha xhaVar4 = xhaVar2;
                                y18 y18Var = xhaVar4.a;
                                y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                ?? giaVar2 = new gia(xhaVar4, y18Var);
                                xhaVar4.b.set((gia) giaVar2);
                                gl8Var.t = giaVar2;
                                u56Var7.e = giaVar2;
                            }
                            return new l62();
                        }
                    };
                    bj4Var4.C(objF9);
                }
                wd3.a(s85Var, (oh4) objF9, bj4Var4);
                final oh4 g75Var5 = u56Var5.v;
                if (i == 1) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                final int i19 = s85Var.e;
                final z1b z1bVar7 = z1bVar2;
                ox6 ox6VarA11 = it1.a(aVar2, new ei4() { // from class: cfa
                    @Override // defpackage.ei4
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        jt1 jt1Var2 = (jt1) obj2;
                        ((Integer) obj3).getClass();
                        jt1Var2.K(851809892);
                        Object objF113 = jt1Var2.f();
                        jt1.a.C0187a c0187a2 = jt1.a.a;
                        if (objF113 == c0187a2) {
                            objF113 = new kja();
                            jt1Var2.C(objF113);
                        }
                        kja kjaVar = (kja) objF113;
                        Object objF20 = jt1Var2.f();
                        if (objF20 == c0187a2) {
                            objF20 = new vm2();
                            jt1Var2.C(objF20);
                        }
                        bfa bfaVar = new bfa(u56Var5, qgaVar3, khaVar, z212, z22, kjaVar, ag7Var2, z1bVar7, (vm2) objF20, g75Var5, i19);
                        boolean zJ118 = jt1Var2.j(bfaVar);
                        Object objF21 = jt1Var2.f();
                        if (zJ118 || objF21 == c0187a2) {
                            dfa dfaVar = new dfa(1, bfaVar, bfa.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                            jt1Var2.C(dfaVar);
                            objF21 = dfaVar;
                        }
                        qo5 qo5Var = new qo5((oh4) ((yn5) objF21), null);
                        jt1Var2.B();
                        return qo5Var;
                    }
                });
                i11 = s85Var.d;
                if (i11 == 7) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                zBooleanValue = ((Boolean) h37VarJ.getValue()).booleanValue();
                zC = bj4Var4.c(z23) | bj4Var4.j(n56Var);
                objF10 = bj4Var4.f();
                if (zC) {
                    objF10 = new mh4() { // from class: f62
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            if (z23) {
                                n56Var.i();
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(objF10);
                } else {
                    objF10 = new mh4() { // from class: f62
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            if (z23) {
                                n56Var.i();
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(objF10);
                }
                mh4 mh4Var5 = (mh4) objF10;
                if (zBooleanValue) {
                    ox6VarH = aVar2;
                } else {
                    ox6VarH = aVar2;
                }
                fx0Var2 = (fx0) bj4Var4.F(lf0.a);
                j2 = ((uh1) bj4Var4.F(lf0.b)).a;
                if (uh1.c(j2, u7d.c(1308617531))) {
                    aw9Var = new aw9(j2);
                } else {
                    aw9Var = fx0Var2;
                }
                zJ5 = bj4Var4.j(u56Var5) | bj4Var4.J(aw9Var);
                objF11 = bj4Var4.f();
                if (zJ5) {
                    z24 = false;
                    objF11 = new r52(0, u56Var5, aw9Var);
                    bj4Var4.C(objF11);
                } else {
                    z24 = false;
                    objF11 = new r52(0, u56Var5, aw9Var);
                    bj4Var4.C(objF11);
                }
                ox6 ox6VarH11 = oh7.b(it1.a(ro5.a(ro5.a(ox6Var.H(z63.e(aVar2, (oh4) objF11)).H(new f56(n56Var, u56Var5, qgaVar3)).H(ox6VarH).H(ox6VarA10), new cea(d94Var, u56Var5)), new o62(u56Var5, qgaVar3)).H(ox6VarA11), new ei4() { // from class: bga
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ei4
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        gga ggaVar2 = ggaVar;
                        dt7 dt7Var = ggaVar2.f;
                        jt1 jt1Var2 = (jt1) obj2;
                        ((Integer) obj3).getClass();
                        jt1Var2.K(-2137546592);
                        boolean z216 = ((fl7) dt7Var.getValue()) == fl7.t || !(jt1Var2.F(qu1.n) == tq5.u);
                        boolean zJ118 = jt1Var2.J(ggaVar2);
                        Object objF113 = jt1Var2.f();
                        jt1.a.C0187a c0187a2 = jt1.a.a;
                        if (zJ118 || objF113 == c0187a2) {
                            objF113 = new a26(1, ggaVar2);
                            jt1Var2.C(objF113);
                        }
                        h37 h37VarJ2 = bl7.j((oh4) objF113, jt1Var2);
                        Object objF20 = jt1Var2.f();
                        if (objF20 == c0187a2) {
                            ht2 ht2Var = new ht2(new r58(1, h37VarJ2));
                            jt1Var2.C(ht2Var);
                            objF20 = ht2Var;
                        }
                        s79 s79Var = (s79) objF20;
                        boolean zJ119 = jt1Var2.J(s79Var) | jt1Var2.J(ggaVar2);
                        Object objF21 = jt1Var2.f();
                        if (zJ119 || objF21 == c0187a2) {
                            objF21 = new cga(s79Var, ggaVar2);
                            jt1Var2.C(objF21);
                        }
                        ox6 ox6VarB7 = d79.b((cga) objF21, (fl7) dt7Var.getValue(), z2 && ggaVar2.b.h() != 0.0f, z216, h27Var);
                        jt1Var2.B();
                        return ox6VarB7;
                    }
                }).H(ox6VarC9).H(p62Var5), new j11(1, u56Var5)).H(new mb(new d11(1, qgaVar3, t72Var7)));
                if (z2) {
                    z24 = true;
                }
                if (z24) {
                    ox6VarA2 = aVar2;
                } else {
                    ox6VarA2 = aVar2;
                }
                final boolean z216 = z24;
                bj4 bj4Var9 = bj4Var4;
                final fw0 fw0Var7 = fw0Var2;
                final ox6 ox6Var10 = ox6VarA2;
                final tx2 tx2Var8 = tx2Var2;
                final ox6 ox6Var11 = ox6VarA;
                ci4 ci4Var5 = new ci4() { // from class: z52
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        jt1 jt1Var2 = (jt1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final u56 u56Var7 = u56Var5;
                            final wja wjaVar3 = wjaVar;
                            final int i110 = i2;
                            final int i111 = i;
                            final gga ggaVar2 = ggaVar;
                            final kha khaVar13 = khaVar;
                            final ojb ojbVar2 = ojbVar;
                            final ox6 ox6Var12 = ox6Var11;
                            final ox6 ox6Var13 = ox6VarC10;
                            final ox6 ox6Var14 = ox6VarB6;
                            final ox6 ox6Var15 = ox6Var10;
                            final fw0 fw0Var8 = fw0Var7;
                            final qga qgaVar4 = qgaVar3;
                            final boolean z30 = z216;
                            final boolean z31 = z3;
                            final oh4 oh4Var19 = oh4Var2;
                            final ag7 ag7Var5 = ag7Var2;
                            final tx2 tx2Var9 = tx2Var8;
                            ei4Var.invoke(gr1.b(-44346382, new ci4() { // from class: u52
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj3, Object obj4) {
                                    ox6 kebVar;
                                    jt1 jt1Var3 = (jt1) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (jt1Var3.A(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        final u56 u56Var8 = u56Var7;
                                        ox6 ox6VarE = ir9.e(ox6.a.t, ((y43) u56Var8.g.getValue()).t, 0.0f, 2);
                                        int i112 = i110;
                                        final int i113 = i111;
                                        cv4.a(i112, i113);
                                        wja wjaVar4 = wjaVar3;
                                        if (i112 != 1 || i113 != Integer.MAX_VALUE) {
                                            ox6VarE = ox6VarE.H(new bv4(wjaVar4, i112, i113));
                                        }
                                        boolean zJ118 = jt1Var3.j(u56Var8);
                                        Object objF113 = jt1Var3.f();
                                        if (zJ118 || objF113 == jt1.a.a) {
                                            objF113 = new w01(1, u56Var8);
                                            jt1Var3.C(objF113);
                                        }
                                        mh4 mh4Var6 = (mh4) objF113;
                                        gga ggaVar3 = ggaVar2;
                                        fl7 fl7Var3 = (fl7) ggaVar3.f.getValue();
                                        final kha khaVar14 = khaVar13;
                                        long j6 = khaVar14.b;
                                        int i20 = lja.c;
                                        int iF = (int) (j6 >> 32);
                                        long j7 = ggaVar3.e;
                                        if (iF == ((int) (j7 >> 32)) && (iF = (int) (j6 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                                            iF = lja.f(j6);
                                        }
                                        ggaVar3.e = khaVar14.b;
                                        mva mvaVarA2 = n7b.a(ojbVar2, khaVar14.a);
                                        int iOrdinal = fl7Var3.ordinal();
                                        if (iOrdinal == 0) {
                                            kebVar = new keb(ggaVar3, iF, mvaVarA2, mh4Var6);
                                        } else {
                                            if (iOrdinal != 1) {
                                                u.b();
                                                return null;
                                            }
                                            kebVar = new l15(ggaVar3, iF, mvaVarA2, mh4Var6);
                                        }
                                        ox6 ox6VarA12 = kw0.a(uma.b(ox6VarE).H(kebVar).H(ox6Var12).H(ox6Var13).H(new gha(wjaVar4)).H(ox6Var14).H(ox6Var15), fw0Var8);
                                        final qga qgaVar5 = qgaVar4;
                                        final boolean z32 = z30;
                                        final boolean z33 = z31;
                                        final oh4 oh4Var110 = oh4Var19;
                                        final ag7 ag7Var6 = ag7Var5;
                                        final tx2 tx2Var10 = tx2Var9;
                                        lp9.a(ox6VarA12, gr1.b(1412697320, new ci4() { // from class: v52
                                            /* JADX WARN: Code duplicated, block: B:22:0x0099  */
                                            @Override // defpackage.ci4
                                            public final Object invoke(Object obj5, Object obj6) {
                                                boolean z34;
                                                jt1 jt1Var4 = (jt1) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                if (jt1Var4.A(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    u56 u56Var9 = u56Var8;
                                                    i62 i62Var = new i62(u56Var9, oh4Var110, khaVar14, ag7Var6, tx2Var10, i113);
                                                    int iHashCode = Long.hashCode(jt1Var4.v());
                                                    kw7 kw7VarY = jt1Var4.y();
                                                    ox6 ox6VarC11 = it1.c(jt1Var4, ox6.a.t);
                                                    bt1.c.getClass();
                                                    qr5.a aVar5 = bt1.a.b;
                                                    if (jt1Var4.s() == null) {
                                                        ml5.c();
                                                        throw null;
                                                    }
                                                    jt1Var4.q();
                                                    if (jt1Var4.l()) {
                                                        jt1Var4.k(aVar5);
                                                    } else {
                                                        jt1Var4.z();
                                                    }
                                                    rd7.d(jt1Var4, bt1.a.f, i62Var);
                                                    rd7.d(jt1Var4, bt1.a.e, kw7VarY);
                                                    rd7.d(jt1Var4, bt1.a.g, Integer.valueOf(iHashCode));
                                                    rd7.c(jt1Var4, bt1.a.h);
                                                    rd7.d(jt1Var4, bt1.a.d, ox6VarC11);
                                                    jt1Var4.I();
                                                    bt4 bt4VarA = u56Var9.a();
                                                    bt4 bt4Var = bt4.t;
                                                    boolean z35 = z32;
                                                    if (bt4VarA != bt4Var && u56Var9.c() != null) {
                                                        qq5 qq5VarC = u56Var9.c();
                                                        qq5VarC.getClass();
                                                        z34 = qq5VarC.e() && z35;
                                                    }
                                                    qga qgaVar6 = qgaVar5;
                                                    m62.c(qgaVar6, z34, jt1Var4, 0);
                                                    if (u56Var9.a() == bt4.v && !z33 && z35) {
                                                        jt1Var4.K(-714666198);
                                                        m62.d(qgaVar6, jt1Var4, 0);
                                                        jt1Var4.B();
                                                    } else {
                                                        jt1Var4.K(-714589318);
                                                        jt1Var4.B();
                                                    }
                                                } else {
                                                    jt1Var4.u();
                                                }
                                                return g2b.a;
                                            }
                                        }, jt1Var3), jt1Var3, 48);
                                    } else {
                                        jt1Var3.u();
                                    }
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 6);
                        } else {
                            jt1Var2.u();
                        }
                        return g2b.a;
                    }
                };
                bj4Var = bj4Var9;
                b(ox6VarH11, qgaVar3, gr1.b(-814563849, ci4Var5, bj4Var), bj4Var, 384);
            } else {
                iwVar = iwVar3;
            }
            tx2Var2 = tx2Var;
            hdaVar2 = new hda(iwVar, wjaVar2, z, tx2Var2, aVar, 0);
            if (u56Var6.a != hdaVar2) {
                u56Var6.p = true;
            }
            u56Var6.a = hdaVar2;
            nd3Var = u56Var6.d;
            giaVar = u56Var6.e;
            nd3Var.getClass();
            ljaVar = khaVar.c;
            boolean zA2 = xj5.a(ljaVar, nd3Var.b.c());
            str = nd3Var.a.a.u;
            iwVar2 = khaVar.a;
            if (xj5.a(str, iwVar2.u)) {
                nd3Var.b = new td3(iwVar2, j5);
                d94Var = d94Var2;
                z5 = true;
            } else {
                d94Var = d94Var2;
                if (lja.b(nd3Var.a.b, j5)) {
                    nd3Var.b.h(lja.f(j5), lja.e(j5));
                    z5 = false;
                    z6 = true;
                } else {
                    z5 = false;
                }
                if (ljaVar == null) {
                    td3 td3Var6 = nd3Var.b;
                    td3Var6.d = -1;
                    td3Var6.e = -1;
                    bj4Var2 = bj4VarO;
                } else {
                    bj4Var2 = bj4VarO;
                    j = ljaVar.a;
                    if (!lja.c(j)) {
                        nd3Var.b.g(lja.f(j), lja.e(j));
                    }
                }
                if (z5) {
                    td3 td3Var7 = nd3Var.b;
                    td3Var7.d = -1;
                    td3Var7.e = -1;
                    khaVarA = kha.a(khaVar, null, 0L, 3);
                } else {
                    td3 td3Var8 = nd3Var.b;
                    td3Var8.d = -1;
                    td3Var8.e = -1;
                    khaVarA = kha.a(khaVar, null, 0L, 3);
                }
                khaVar2 = nd3Var.a;
                nd3Var.a = khaVarA;
                if (giaVar != null) {
                    giaVar.a(khaVar2, khaVarA);
                }
                objF = bj4Var2.f();
                if (objF == c0187a) {
                    objF = new z1b(0);
                    bj4Var3 = bj4Var2;
                    bj4Var3.C(objF);
                } else {
                    bj4Var3 = bj4Var2;
                }
                z1bVar = (z1b) objF;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (z1bVar.f) {
                    z1bVar.e = Long.valueOf(jCurrentTimeMillis);
                    z1bVar.a(khaVar);
                } else {
                    l = z1bVar.e;
                    if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                        z1bVar.e = Long.valueOf(jCurrentTimeMillis);
                        z1bVar.a(khaVar);
                    }
                }
                objF2 = bj4Var3.f();
                if (objF2 == c0187a) {
                    c33 c33Var3 = wd3.a;
                    objF2 = m78.a(bj4Var3.x(), bj4Var3);
                }
                t72Var = (t72) objF2;
                objF3 = bj4Var3.f();
                if (objF3 == c0187a) {
                    objF3 = new jw0();
                    bj4Var3.C(objF3);
                }
                fw0Var = (fw0) objF3;
                objF4 = bj4Var3.f();
                if (objF4 == c0187a) {
                    objF4 = new qga(z1bVar);
                    bj4Var3.C(objF4);
                }
                qgaVar = (qga) objF4;
                qgaVar.b = ag7Var4;
                qgaVar.c = u56Var6.v;
                qgaVar.d = u56Var6;
                qgaVar.e.setValue(khaVar);
                qgaVar.w = new lja(j5);
                qgaVar.g = (pf1) bj4Var3.F(qu1.f);
                qgaVar.h = t72Var;
                qgaVar.j = (xja) bj4Var3.F(qu1.r);
                qgaVar.k = (st4) bj4Var3.F(qu1.l);
                qgaVar.l = p94Var;
                final boolean z217 = !z3;
                qgaVar.m.setValue(Boolean.valueOf(z217));
                qgaVar.n.setValue(Boolean.valueOf(z2));
                bj4Var3.K(1966756105);
                ad6Var = wjaVar2.a.k;
                y0a y0aVar3 = q18.a;
                bj4Var3.K(430530635);
                if (Build.VERSION.SDK_INT < 28) {
                    bj4Var3.B();
                    j18Var = null;
                } else {
                    context = (Context) bj4Var3.F(AndroidCompositionLocals_androidKt.b);
                    h72Var = (h72) bj4Var3.F(q18.a);
                    zJ = bj4Var3.J(h72Var) | bj4Var3.J(context) | bj4Var3.J(ad6Var);
                    objF5 = bj4Var3.f();
                    if (zJ) {
                        q18.b.getClass();
                        objF5 = new o18(h72Var, context, aa9.t, ad6Var);
                        bj4Var3.C(objF5);
                    } else {
                        q18.b.getClass();
                        objF5 = new o18(h72Var, context, aa9.t, ad6Var);
                        bj4Var3.C(objF5);
                    }
                    j18Var = (j18) objF5;
                    bj4Var3.B();
                }
                qgaVar.i = j18Var;
                bj4Var3.U(false);
                u56Var6.b();
                boolean zJ22 = bj4Var3.j(u56Var6);
                i7 = i12 & 7168;
                if (i7 == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z218 = zJ22 | z7;
                if ((i12 & 57344) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z219 = z8 | z218;
                xhaVar = xhaVar3;
                boolean zJ23 = z219 | bj4Var3.j(xhaVar);
                i8 = i13;
                if (i8 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z9 | zJ23;
                i9 = (i12 & 112) ^ 48;
                if (i9 > 32) {
                    s85Var2 = s85Var;
                    if (!bj4Var3.J(s85Var2)) {
                        z11 = z10;
                        i10 = i9;
                    }
                    z12 = true;
                    zJ2 = z11 | z12 | bj4Var3.j(ag7Var4) | bj4Var3.j(t72Var) | bj4Var3.j(fw0Var) | bj4Var3.j(qgaVar);
                    objF6 = bj4Var3.f();
                    if (zJ2) {
                        bj4Var4 = bj4Var3;
                        u56Var2 = u56Var6;
                        z1bVar2 = z1bVar;
                        s85Var3 = s85Var2;
                        oh4 oh4Var19 = new oh4() { // from class: b62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                sia siaVarD;
                                v94 v94Var = (v94) obj;
                                u56 u56Var7 = u56Var2;
                                if (u56Var7.b() == v94Var.e()) {
                                    return g2b.a;
                                }
                                u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                                boolean zB = u56Var7.b();
                                kha khaVar13 = khaVar;
                                ag7 ag7Var5 = ag7Var4;
                                if (zB && z2 && !z3) {
                                    m62.g(xhaVar, u56Var7, khaVar13, s85Var3, ag7Var5);
                                } else {
                                    m62.e(u56Var7);
                                }
                                if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                    oy0.d(t72Var, null, null, new j62(fw0Var, khaVar13, u56Var7, siaVarD, ag7Var5, null), 3);
                                }
                                if (!v94Var.e()) {
                                    qgaVar.g(null);
                                }
                                return g2b.a;
                            }
                        };
                        xhaVar = xhaVar;
                        ag7Var = ag7Var4;
                        qgaVar2 = qgaVar;
                        fw0Var2 = fw0Var;
                        z13 = z2;
                        khaVar3 = khaVar;
                        t72Var2 = t72Var;
                        bj4Var4.C(oh4Var19);
                        objF6 = oh4Var19;
                    } else {
                        bj4Var4 = bj4Var3;
                        u56Var2 = u56Var6;
                        z1bVar2 = z1bVar;
                        s85Var3 = s85Var2;
                        oh4 oh4Var110 = new oh4() { // from class: b62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                sia siaVarD;
                                v94 v94Var = (v94) obj;
                                u56 u56Var7 = u56Var2;
                                if (u56Var7.b() == v94Var.e()) {
                                    return g2b.a;
                                }
                                u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                                boolean zB = u56Var7.b();
                                kha khaVar13 = khaVar;
                                ag7 ag7Var5 = ag7Var4;
                                if (zB && z2 && !z3) {
                                    m62.g(xhaVar, u56Var7, khaVar13, s85Var3, ag7Var5);
                                } else {
                                    m62.e(u56Var7);
                                }
                                if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                    oy0.d(t72Var, null, null, new j62(fw0Var, khaVar13, u56Var7, siaVarD, ag7Var5, null), 3);
                                }
                                if (!v94Var.e()) {
                                    qgaVar.g(null);
                                }
                                return g2b.a;
                            }
                        };
                        xhaVar = xhaVar;
                        ag7Var = ag7Var4;
                        qgaVar2 = qgaVar;
                        fw0Var2 = fw0Var;
                        z13 = z2;
                        khaVar3 = khaVar;
                        t72Var2 = t72Var;
                        bj4Var4.C(oh4Var110);
                        objF6 = oh4Var110;
                    }
                    aVar2 = ox6.a.t;
                    ox6 ox6VarA12 = ia4.a(j84.c(ym2.b(aVar2, p94Var), (oh4) objF6), z13, h27Var);
                    if (z13) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    h37VarJ = bl7.j(Boolean.valueOf(z14), bj4Var4);
                    g2b g2bVar5 = g2b.a;
                    boolean zJ118 = bj4Var4.J(h37VarJ) | bj4Var4.j(u56Var2) | bj4Var4.j(xhaVar) | bj4Var4.j(qgaVar2);
                    if (i10 > 32) {
                        u56Var3 = u56Var2;
                        if ((r4 & 48) != 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        u56Var3 = u56Var2;
                        if ((r4 & 48) != 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    z16 = zJ118 | z15;
                    Object objF113 = bj4Var4.f();
                    if (z16) {
                        u56Var4 = u56Var3;
                        g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                        bj4Var4.C(g62Var);
                    } else {
                        u56Var4 = u56Var3;
                        g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                        bj4Var4.C(g62Var);
                    }
                    wd3.d(bj4Var4, (ci4) g62Var, g2bVar5);
                    ox6VarB = t6a.b(aVar2, 8675309, new va9(new rfa(u56Var4)));
                    qgaVar3 = qgaVar2;
                    t72 t72Var8 = t72Var2;
                    ag7Var2 = ag7Var;
                    xhaVar2 = xhaVar;
                    r0 = new oh4() { // from class: sfa
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            xv9 xv9Var2;
                            vf7 vf7Var = (vf7) obj;
                            u56 u56Var7 = u56Var4;
                            if (!u56Var7.b()) {
                                p94.a(p94Var);
                            } else if (!z3 && (xv9Var2 = u56Var7.c) != null) {
                                xv9Var2.b();
                            }
                            if (u56Var7.b() && z2) {
                                if (u56Var7.a() != bt4.u) {
                                    sia siaVarD = u56Var7.d();
                                    if (siaVarD != null) {
                                        long j6 = vf7Var.a;
                                        nd3 nd3Var2 = u56Var7.d;
                                        g75 g75Var6 = u56Var7.v;
                                        int iA = ag7Var2.a(siaVarD.b(j6, true));
                                        g75Var6.invoke(kha.a(nd3Var2.a, null, ay.c(iA, iA), 5));
                                        if (u56Var7.a.a.u.length() > 0) {
                                            u56Var7.k.setValue(bt4.v);
                                        }
                                    }
                                } else {
                                    qgaVar3.g(vf7Var);
                                }
                            }
                            return g2b.a;
                        }
                    };
                    if (z2) {
                        ox6VarB = it1.a(ox6VarB, new ei4() { // from class: vfa
                            @Override // defpackage.ei4
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                jt1 jt1Var2 = (jt1) obj2;
                                ((Integer) obj3).getClass();
                                jt1Var2.K(-102778667);
                                Object objF114 = jt1Var2.f();
                                jt1.a.C0187a c0187a2 = jt1.a.a;
                                if (objF114 == c0187a2) {
                                    c33 c33Var4 = wd3.a;
                                    nm8 nm8Var = new nm8(jt1Var2.x());
                                    jt1Var2.C(nm8Var);
                                    objF114 = nm8Var;
                                }
                                t72 t72Var9 = (t72) objF114;
                                Object objF20 = jt1Var2.f();
                                if (objF20 == c0187a2) {
                                    objF20 = bl7.i(null);
                                    jt1Var2.C(objF20);
                                }
                                final h37 h37Var = (h37) objF20;
                                h37 h37VarJ2 = bl7.j(r0, jt1Var2);
                                final h27 h27Var2 = h27Var;
                                boolean zJ119 = jt1Var2.J(h27Var2);
                                Object objF21 = jt1Var2.f();
                                if (zJ119 || objF21 == c0187a2) {
                                    objF21 = new oh4() { // from class: wfa
                                        @Override // defpackage.oh4
                                        public final Object invoke(Object obj4) {
                                            return new zfa(h37Var, h27Var2);
                                        }
                                    };
                                    jt1Var2.C(objF21);
                                }
                                wd3.a(h27Var2, (oh4) objF21, jt1Var2);
                                boolean zJ1110 = jt1Var2.j(t72Var9) | jt1Var2.J(h27Var2) | jt1Var2.J(h37VarJ2);
                                Object objF22 = jt1Var2.f();
                                if (zJ1110 || objF22 == c0187a2) {
                                    objF22 = new yfa(t72Var9, h37Var, h27Var2, h37VarJ2);
                                    jt1Var2.C(objF22);
                                }
                                ox6 ox6VarB7 = t6a.b(ox6.a.t, h27Var2, (PointerInputEventHandler) objF22);
                                jt1Var2.B();
                                return ox6VarB7;
                            }
                        });
                    }
                    ox6 ox6VarH12 = ox6VarB.H(new q6a(qgaVar3.A, qgaVar3.z, new tfa(qgaVar3), 4));
                    w48.a.getClass();
                    ox6 ox6VarC11 = by5.c(ox6VarH12, y48.u);
                    final ox6 ox6VarC12 = z63.c(aVar2, new oh4() { // from class: t52
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            d73 d73Var = (d73) obj;
                            u56 u56Var7 = u56Var4;
                            sia siaVarD = u56Var7.d();
                            if (siaVarD != null) {
                                n41 n41VarA = d73Var.Y0().a();
                                long j6 = ((lja) u56Var7.A.getValue()).a;
                                long j7 = ((lja) u56Var7.B.getValue()).a;
                                ria riaVar = siaVarD.a;
                                l07 l07Var = riaVar.b;
                                qia qiaVar = riaVar.a;
                                np npVar = u56Var7.y;
                                long j8 = u56Var7.z;
                                boolean zC2 = lja.c(j6);
                                ag7 ag7Var5 = ag7Var2;
                                if (!zC2) {
                                    npVar.f(j8);
                                    int iB3 = ag7Var5.b(lja.f(j6));
                                    int iB4 = ag7Var5.b(lja.e(j6));
                                    if (iB3 != iB4) {
                                        n41VarA.c(riaVar.i(iB3, iB4), npVar);
                                    }
                                } else if (lja.c(j7)) {
                                    kha khaVar13 = khaVar3;
                                    if (!lja.c(khaVar13.b)) {
                                        npVar.f(j8);
                                        long j9 = khaVar13.b;
                                        int iB5 = ag7Var5.b(lja.f(j9));
                                        int iB6 = ag7Var5.b(lja.e(j9));
                                        if (iB5 != iB6) {
                                            n41VarA.c(riaVar.i(iB5, iB6), npVar);
                                        }
                                    }
                                } else {
                                    long jB = qiaVar.b.b();
                                    uh1 uh1Var = new uh1(jB);
                                    if (jB == 16) {
                                        uh1Var = null;
                                    }
                                    long j10 = uh1Var != null ? uh1Var.a : uh1.b;
                                    npVar.f(uh1.b(uh1.d(j10) * 0.2f, j10));
                                    int iB7 = ag7Var5.b(lja.f(j7));
                                    int iB8 = ag7Var5.b(lja.e(j7));
                                    if (iB7 != iB8) {
                                        n41VarA.c(riaVar.i(iB7, iB8), npVar);
                                    }
                                }
                                boolean z2110 = riaVar.d() && qiaVar.f != 3;
                                if (z2110) {
                                    long j11 = riaVar.c;
                                    sk8 sk8VarA = tk8.a(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                    n41VarA.f();
                                    n41VarA.r(sk8VarA);
                                }
                                ww9 ww9Var = qiaVar.b.a;
                                fda fdaVar = ww9Var.m;
                                mha mhaVar = ww9Var.a;
                                if (fdaVar == null) {
                                    fdaVar = fda.b;
                                }
                                fda fdaVar2 = fdaVar;
                                el9 el9Var = ww9Var.n;
                                if (el9Var == null) {
                                    el9Var = el9.d;
                                }
                                el9 el9Var2 = el9Var;
                                e73 e73Var = ww9Var.p;
                                if (e73Var == null) {
                                    e73Var = zy3.a;
                                }
                                e73 e73Var2 = e73Var;
                                try {
                                    fx0 fx0VarE = mhaVar.e();
                                    mha.a aVar5 = mha.a.a;
                                    if (fx0VarE != null) {
                                        l07.j(l07Var, n41VarA, fx0VarE, mhaVar != aVar5 ? mhaVar.a() : 1.0f, el9Var2, fdaVar2, e73Var2);
                                    } else {
                                        l07.i(l07Var, n41VarA, mhaVar != aVar5 ? mhaVar.c() : uh1.b, el9Var2, fdaVar2, e73Var2);
                                    }
                                } finally {
                                    if (z2110) {
                                        n41VarA.o();
                                    }
                                }
                            }
                            return g2b.a;
                        }
                    });
                    boolean zJ119 = bj4Var4.j(u56Var4);
                    if (i7 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zJ1110 = zJ119 | z17 | bj4Var4.J(mmbVar) | bj4Var4.j(qgaVar3);
                    if (i8 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zJ3 = zJ1110 | z18 | bj4Var4.j(ag7Var2);
                    objF7 = bj4Var4.f();
                    if (zJ3) {
                        final kha khaVar13 = khaVar3;
                        oh4 oh4Var111 = new oh4() { // from class: c62
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                gia giaVar2;
                                qq5 qq5Var;
                                qq5 qq5Var2;
                                u56 u56Var7 = u56Var4;
                                dt7 dt7Var = u56Var7.o;
                                qq5 qq5Var3 = (qq5) obj;
                                u56Var7.h = qq5Var3;
                                sia siaVarD = u56Var7.d();
                                if (siaVarD != null) {
                                    siaVarD.b = qq5Var3;
                                }
                                if (z2) {
                                    bt4 bt4VarA = u56Var7.a();
                                    bt4 bt4Var = bt4.u;
                                    qga qgaVar4 = qgaVar3;
                                    kha khaVar14 = khaVar13;
                                    if (bt4VarA == bt4Var) {
                                        if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                            qgaVar4.r();
                                        } else {
                                            qgaVar4.o();
                                        }
                                        u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                        u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                        dt7Var.setValue(Boolean.valueOf(lja.c(khaVar14.b)));
                                    } else if (u56Var7.a() == bt4.v) {
                                        dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    }
                                    ag7 ag7Var5 = ag7Var2;
                                    m62.f(u56Var7, khaVar14, ag7Var5);
                                    sia siaVarD2 = u56Var7.d();
                                    if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                        ria riaVar = siaVarD2.a;
                                        zda zdaVar = new zda(qq5Var);
                                        sk8 sk8VarA = fb9.a(qq5Var);
                                        sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                        if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                            giaVar2.b.c(khaVar14, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                        }
                                    }
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(oh4Var111);
                        objF7 = oh4Var111;
                    } else {
                        final kha khaVar14 = khaVar3;
                        oh4 oh4Var112 = new oh4() { // from class: c62
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                gia giaVar2;
                                qq5 qq5Var;
                                qq5 qq5Var2;
                                u56 u56Var7 = u56Var4;
                                dt7 dt7Var = u56Var7.o;
                                qq5 qq5Var3 = (qq5) obj;
                                u56Var7.h = qq5Var3;
                                sia siaVarD = u56Var7.d();
                                if (siaVarD != null) {
                                    siaVarD.b = qq5Var3;
                                }
                                if (z2) {
                                    bt4 bt4VarA = u56Var7.a();
                                    bt4 bt4Var = bt4.u;
                                    qga qgaVar4 = qgaVar3;
                                    kha khaVar15 = khaVar14;
                                    if (bt4VarA == bt4Var) {
                                        if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                            qgaVar4.r();
                                        } else {
                                            qgaVar4.o();
                                        }
                                        u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                        u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                        dt7Var.setValue(Boolean.valueOf(lja.c(khaVar15.b)));
                                    } else if (u56Var7.a() == bt4.v) {
                                        dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    }
                                    ag7 ag7Var5 = ag7Var2;
                                    m62.f(u56Var7, khaVar15, ag7Var5);
                                    sia siaVarD2 = u56Var7.d();
                                    if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                        ria riaVar = siaVarD2.a;
                                        zda zdaVar = new zda(qq5Var);
                                        sk8 sk8VarA = fb9.a(qq5Var);
                                        sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                        if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                            giaVar2.b.c(khaVar15, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                        }
                                    }
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(oh4Var112);
                        objF7 = oh4Var112;
                    }
                    final ox6 ox6VarB7 = oh7.b(aVar2, (oh4) objF7);
                    u56Var5 = u56Var4;
                    p62 p62Var6 = new p62(mvaVar, khaVar, u56Var5, z3, z2, ag7Var2, qgaVar3, s85Var, p94Var);
                    if (!z2) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        ox6VarA = it1.a(aVar2, new ei4() { // from class: qda
                            /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
                            @Override // defpackage.ei4
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Object objE;
                                ox6 ox6Var12 = (ox6) obj;
                                jt1 jt1Var2 = (jt1) obj2;
                                ((Integer) obj3).getClass();
                                jt1Var2.K(-84507373);
                                boolean zBooleanValue2 = ((Boolean) jt1Var2.F(qu1.x)).booleanValue();
                                boolean zC2 = jt1Var2.c(zBooleanValue2);
                                Object objF114 = jt1Var2.f();
                                jt1.a.C0187a c0187a2 = jt1.a.a;
                                if (zC2 || objF114 == c0187a2) {
                                    objF114 = new cd2(zBooleanValue2);
                                    jt1Var2.C(objF114);
                                }
                                final cd2 cd2Var = (cd2) objF114;
                                final fx0 fx0Var3 = fx0Var;
                                boolean z2110 = ((fx0Var3 instanceof aw9) && ((aw9) fx0Var3).a == 16) ? false : true;
                                if (((mmb) jt1Var2.F(qu1.u)).a()) {
                                    final u56 u56Var7 = u56Var5;
                                    if (u56Var7.b()) {
                                        final kha khaVar15 = khaVar;
                                        if (lja.c(khaVar15.b) && z2110) {
                                            jt1Var2.K(-707487962);
                                            iw iwVar5 = khaVar15.a;
                                            lja ljaVar3 = new lja(khaVar15.b);
                                            boolean zJ1111 = jt1Var2.j(cd2Var);
                                            Object objF20 = jt1Var2.f();
                                            if (zJ1111 || objF20 == c0187a2) {
                                                objF20 = new sda(cd2Var, null);
                                                jt1Var2.C(objF20);
                                            }
                                            wd3.f(iwVar5, ljaVar3, (ci4) objF20, jt1Var2);
                                            boolean zJ1112 = jt1Var2.j(cd2Var);
                                            final ag7 ag7Var5 = ag7Var2;
                                            boolean zJ1113 = jt1Var2.j(ag7Var5) | zJ1112 | jt1Var2.J(khaVar15) | jt1Var2.j(u56Var7) | jt1Var2.J(fx0Var3);
                                            Object objF21 = jt1Var2.f();
                                            if (zJ1113 || objF21 == c0187a2) {
                                                oh4 oh4Var113 = new oh4() { // from class: rda
                                                    @Override // defpackage.oh4
                                                    public final Object invoke(Object obj4) {
                                                        cz1 cz1Var = (cz1) obj4;
                                                        cz1Var.K1();
                                                        float fH = cd2Var.c.h();
                                                        if (fH != 0.0f) {
                                                            long j6 = khaVar15.b;
                                                            int i110 = lja.c;
                                                            int iB3 = ag7Var5.b((int) (j6 >> 32));
                                                            sia siaVarD = u56Var7.d();
                                                            sk8 sk8VarC = siaVarD != null ? siaVarD.a.c(iB3) : new sk8(0.0f, 0.0f, 0.0f, 0.0f);
                                                            float fFloor = (float) Math.floor(cz1Var.U0(2.0f));
                                                            float f = fFloor < 1.0f ? 1.0f : fFloor;
                                                            float f2 = f / 2.0f;
                                                            float f3 = sk8VarC.a + f2;
                                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() >> 32)) - f2;
                                                            if (f3 > fIntBitsToFloat) {
                                                                f3 = fIntBitsToFloat;
                                                            }
                                                            if (f3 >= f2) {
                                                                f2 = f3;
                                                            }
                                                            float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                                                            cz1Var.T0(fx0Var3, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.d)) & 4294967295L), f, fH);
                                                        }
                                                        return g2b.a;
                                                    }
                                                };
                                                jt1Var2.C(oh4Var113);
                                                objF21 = oh4Var113;
                                            }
                                            objE = z63.e(ox6Var12, (oh4) objF21);
                                            jt1Var2.B();
                                        } else {
                                            jt1Var2.K(-705473241);
                                            jt1Var2.B();
                                            objE = ox6.a.t;
                                        }
                                    } else {
                                        jt1Var2.K(-705473241);
                                        jt1Var2.B();
                                        objE = ox6.a.t;
                                    }
                                } else {
                                    jt1Var2.K(-705473241);
                                    jt1Var2.B();
                                    objE = ox6.a.t;
                                }
                                jt1Var2.B();
                                return objE;
                            }
                        });
                    } else {
                        ox6VarA = aVar2;
                    }
                    zJ4 = bj4Var4.j(qgaVar3);
                    objF8 = bj4Var4.f();
                    if (zJ4) {
                        objF8 = new oh4() { // from class: d62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return new k62(qgaVar3);
                            }
                        };
                        bj4Var4.C(objF8);
                    } else {
                        objF8 = new oh4() { // from class: d62
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return new k62(qgaVar3);
                            }
                        };
                        bj4Var4.C(objF8);
                    }
                    wd3.a(qgaVar3, (oh4) objF8, bj4Var4);
                    boolean zJ1111 = bj4Var4.j(u56Var5) | bj4Var4.j(xhaVar2);
                    if (i8 == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    z21 = zJ1111 | z20 | ((i10 <= 32 && bj4Var4.J(s85Var)) || (i12 & 48) == 32);
                    objF9 = bj4Var4.f();
                    if (z21) {
                        objF9 = new oh4() { // from class: e62
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                u56 u56Var7 = u56Var5;
                                if (u56Var7.b()) {
                                    nd3 nd3Var2 = u56Var7.d;
                                    g75 g75Var6 = u56Var7.v;
                                    s56 s56Var = u56Var7.w;
                                    gl8 gl8Var = new gl8();
                                    yda ydaVar = new yda(nd3Var2, g75Var6, gl8Var);
                                    xha xhaVar4 = xhaVar2;
                                    y18 y18Var = xhaVar4.a;
                                    y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                    ?? giaVar2 = new gia(xhaVar4, y18Var);
                                    xhaVar4.b.set((gia) giaVar2);
                                    gl8Var.t = giaVar2;
                                    u56Var7.e = giaVar2;
                                }
                                return new l62();
                            }
                        };
                        bj4Var4.C(objF9);
                    } else {
                        objF9 = new oh4() { // from class: e62
                            /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                u56 u56Var7 = u56Var5;
                                if (u56Var7.b()) {
                                    nd3 nd3Var2 = u56Var7.d;
                                    g75 g75Var6 = u56Var7.v;
                                    s56 s56Var = u56Var7.w;
                                    gl8 gl8Var = new gl8();
                                    yda ydaVar = new yda(nd3Var2, g75Var6, gl8Var);
                                    xha xhaVar4 = xhaVar2;
                                    y18 y18Var = xhaVar4.a;
                                    y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                    ?? giaVar2 = new gia(xhaVar4, y18Var);
                                    xhaVar4.b.set((gia) giaVar2);
                                    gl8Var.t = giaVar2;
                                    u56Var7.e = giaVar2;
                                }
                                return new l62();
                            }
                        };
                        bj4Var4.C(objF9);
                    }
                    wd3.a(s85Var, (oh4) objF9, bj4Var4);
                    final oh4 g75Var6 = u56Var5.v;
                    if (i == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    final int i110 = s85Var.e;
                    final z1b z1bVar8 = z1bVar2;
                    ox6 ox6VarA13 = it1.a(aVar2, new ei4() { // from class: cfa
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(851809892);
                            Object objF114 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (objF114 == c0187a2) {
                                objF114 = new kja();
                                jt1Var2.C(objF114);
                            }
                            kja kjaVar = (kja) objF114;
                            Object objF20 = jt1Var2.f();
                            if (objF20 == c0187a2) {
                                objF20 = new vm2();
                                jt1Var2.C(objF20);
                            }
                            bfa bfaVar = new bfa(u56Var5, qgaVar3, khaVar, z217, z22, kjaVar, ag7Var2, z1bVar8, (vm2) objF20, g75Var6, i110);
                            boolean zJ1112 = jt1Var2.j(bfaVar);
                            Object objF21 = jt1Var2.f();
                            if (zJ1112 || objF21 == c0187a2) {
                                dfa dfaVar = new dfa(1, bfaVar, bfa.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                                jt1Var2.C(dfaVar);
                                objF21 = dfaVar;
                            }
                            qo5 qo5Var = new qo5((oh4) ((yn5) objF21), null);
                            jt1Var2.B();
                            return qo5Var;
                        }
                    });
                    i11 = s85Var.d;
                    if (i11 == 7) {
                        z23 = false;
                    } else {
                        z23 = true;
                    }
                    zBooleanValue = ((Boolean) h37VarJ.getValue()).booleanValue();
                    zC = bj4Var4.c(z23) | bj4Var4.j(n56Var);
                    objF10 = bj4Var4.f();
                    if (zC) {
                        objF10 = new mh4() { // from class: f62
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                if (z23) {
                                    n56Var.i();
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(objF10);
                    } else {
                        objF10 = new mh4() { // from class: f62
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                if (z23) {
                                    n56Var.i();
                                }
                                return g2b.a;
                            }
                        };
                        bj4Var4.C(objF10);
                    }
                    mh4 mh4Var6 = (mh4) objF10;
                    if (zBooleanValue) {
                        ox6VarH = aVar2;
                    } else {
                        ox6VarH = aVar2;
                    }
                    fx0Var2 = (fx0) bj4Var4.F(lf0.a);
                    j2 = ((uh1) bj4Var4.F(lf0.b)).a;
                    if (uh1.c(j2, u7d.c(1308617531))) {
                        aw9Var = new aw9(j2);
                    } else {
                        aw9Var = fx0Var2;
                    }
                    zJ5 = bj4Var4.j(u56Var5) | bj4Var4.J(aw9Var);
                    objF11 = bj4Var4.f();
                    if (zJ5) {
                        z24 = false;
                        objF11 = new r52(0, u56Var5, aw9Var);
                        bj4Var4.C(objF11);
                    } else {
                        z24 = false;
                        objF11 = new r52(0, u56Var5, aw9Var);
                        bj4Var4.C(objF11);
                    }
                    ox6 ox6VarH13 = oh7.b(it1.a(ro5.a(ro5.a(ox6Var.H(z63.e(aVar2, (oh4) objF11)).H(new f56(n56Var, u56Var5, qgaVar3)).H(ox6VarH).H(ox6VarA12), new cea(d94Var, u56Var5)), new o62(u56Var5, qgaVar3)).H(ox6VarA13), new ei4() { // from class: bga
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            gga ggaVar2 = ggaVar;
                            dt7 dt7Var = ggaVar2.f;
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(-2137546592);
                            boolean z2110 = ((fl7) dt7Var.getValue()) == fl7.t || !(jt1Var2.F(qu1.n) == tq5.u);
                            boolean zJ1112 = jt1Var2.J(ggaVar2);
                            Object objF114 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (zJ1112 || objF114 == c0187a2) {
                                objF114 = new a26(1, ggaVar2);
                                jt1Var2.C(objF114);
                            }
                            h37 h37VarJ2 = bl7.j((oh4) objF114, jt1Var2);
                            Object objF20 = jt1Var2.f();
                            if (objF20 == c0187a2) {
                                ht2 ht2Var = new ht2(new r58(1, h37VarJ2));
                                jt1Var2.C(ht2Var);
                                objF20 = ht2Var;
                            }
                            s79 s79Var = (s79) objF20;
                            boolean zJ1113 = jt1Var2.J(s79Var) | jt1Var2.J(ggaVar2);
                            Object objF21 = jt1Var2.f();
                            if (zJ1113 || objF21 == c0187a2) {
                                objF21 = new cga(s79Var, ggaVar2);
                                jt1Var2.C(objF21);
                            }
                            ox6 ox6VarB8 = d79.b((cga) objF21, (fl7) dt7Var.getValue(), z2 && ggaVar2.b.h() != 0.0f, z2110, h27Var);
                            jt1Var2.B();
                            return ox6VarB8;
                        }
                    }).H(ox6VarC11).H(p62Var6), new j11(1, u56Var5)).H(new mb(new d11(1, qgaVar3, t72Var8)));
                    if (z2) {
                        z24 = true;
                    }
                    if (z24) {
                        ox6VarA2 = aVar2;
                    } else {
                        ox6VarA2 = aVar2;
                    }
                    final boolean z2110 = z24;
                    bj4 bj4Var10 = bj4Var4;
                    final fw0 fw0Var8 = fw0Var2;
                    final ox6 ox6Var12 = ox6VarA2;
                    final tx2 tx2Var9 = tx2Var2;
                    final ox6 ox6Var13 = ox6VarA;
                    ci4 ci4Var6 = new ci4() { // from class: z52
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            jt1 jt1Var2 = (jt1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final u56 u56Var7 = u56Var5;
                                final wja wjaVar3 = wjaVar;
                                final int i111 = i2;
                                final int i112 = i;
                                final gga ggaVar2 = ggaVar;
                                final kha khaVar15 = khaVar;
                                final ojb ojbVar2 = ojbVar;
                                final ox6 ox6Var14 = ox6Var13;
                                final ox6 ox6Var15 = ox6VarC12;
                                final ox6 ox6Var16 = ox6VarB7;
                                final ox6 ox6Var17 = ox6Var12;
                                final fw0 fw0Var9 = fw0Var8;
                                final qga qgaVar4 = qgaVar3;
                                final boolean z30 = z2110;
                                final boolean z31 = z3;
                                final oh4 oh4Var113 = oh4Var2;
                                final ag7 ag7Var5 = ag7Var2;
                                final tx2 tx2Var10 = tx2Var9;
                                ei4Var.invoke(gr1.b(-44346382, new ci4() { // from class: u52
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj3, Object obj4) {
                                        ox6 kebVar;
                                        jt1 jt1Var3 = (jt1) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (jt1Var3.A(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            final u56 u56Var8 = u56Var7;
                                            ox6 ox6VarE = ir9.e(ox6.a.t, ((y43) u56Var8.g.getValue()).t, 0.0f, 2);
                                            int i113 = i111;
                                            final int i114 = i112;
                                            cv4.a(i113, i114);
                                            wja wjaVar4 = wjaVar3;
                                            if (i113 != 1 || i114 != Integer.MAX_VALUE) {
                                                ox6VarE = ox6VarE.H(new bv4(wjaVar4, i113, i114));
                                            }
                                            boolean zJ1112 = jt1Var3.j(u56Var8);
                                            Object objF114 = jt1Var3.f();
                                            if (zJ1112 || objF114 == jt1.a.a) {
                                                objF114 = new w01(1, u56Var8);
                                                jt1Var3.C(objF114);
                                            }
                                            mh4 mh4Var7 = (mh4) objF114;
                                            gga ggaVar3 = ggaVar2;
                                            fl7 fl7Var3 = (fl7) ggaVar3.f.getValue();
                                            final kha khaVar16 = khaVar15;
                                            long j6 = khaVar16.b;
                                            int i20 = lja.c;
                                            int iF = (int) (j6 >> 32);
                                            long j7 = ggaVar3.e;
                                            if (iF == ((int) (j7 >> 32)) && (iF = (int) (j6 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                                                iF = lja.f(j6);
                                            }
                                            ggaVar3.e = khaVar16.b;
                                            mva mvaVarA2 = n7b.a(ojbVar2, khaVar16.a);
                                            int iOrdinal = fl7Var3.ordinal();
                                            if (iOrdinal == 0) {
                                                kebVar = new keb(ggaVar3, iF, mvaVarA2, mh4Var7);
                                            } else {
                                                if (iOrdinal != 1) {
                                                    u.b();
                                                    return null;
                                                }
                                                kebVar = new l15(ggaVar3, iF, mvaVarA2, mh4Var7);
                                            }
                                            ox6 ox6VarA14 = kw0.a(uma.b(ox6VarE).H(kebVar).H(ox6Var14).H(ox6Var15).H(new gha(wjaVar4)).H(ox6Var16).H(ox6Var17), fw0Var9);
                                            final qga qgaVar5 = qgaVar4;
                                            final boolean z32 = z30;
                                            final boolean z33 = z31;
                                            final oh4 oh4Var114 = oh4Var113;
                                            final ag7 ag7Var6 = ag7Var5;
                                            final tx2 tx2Var11 = tx2Var10;
                                            lp9.a(ox6VarA14, gr1.b(1412697320, new ci4() { // from class: v52
                                                /* JADX WARN: Code duplicated, block: B:22:0x0099  */
                                                @Override // defpackage.ci4
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    boolean z34;
                                                    jt1 jt1Var4 = (jt1) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (jt1Var4.A(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        u56 u56Var9 = u56Var8;
                                                        i62 i62Var = new i62(u56Var9, oh4Var114, khaVar16, ag7Var6, tx2Var11, i114);
                                                        int iHashCode = Long.hashCode(jt1Var4.v());
                                                        kw7 kw7VarY = jt1Var4.y();
                                                        ox6 ox6VarC13 = it1.c(jt1Var4, ox6.a.t);
                                                        bt1.c.getClass();
                                                        qr5.a aVar5 = bt1.a.b;
                                                        if (jt1Var4.s() == null) {
                                                            ml5.c();
                                                            throw null;
                                                        }
                                                        jt1Var4.q();
                                                        if (jt1Var4.l()) {
                                                            jt1Var4.k(aVar5);
                                                        } else {
                                                            jt1Var4.z();
                                                        }
                                                        rd7.d(jt1Var4, bt1.a.f, i62Var);
                                                        rd7.d(jt1Var4, bt1.a.e, kw7VarY);
                                                        rd7.d(jt1Var4, bt1.a.g, Integer.valueOf(iHashCode));
                                                        rd7.c(jt1Var4, bt1.a.h);
                                                        rd7.d(jt1Var4, bt1.a.d, ox6VarC13);
                                                        jt1Var4.I();
                                                        bt4 bt4VarA = u56Var9.a();
                                                        bt4 bt4Var = bt4.t;
                                                        boolean z35 = z32;
                                                        if (bt4VarA != bt4Var && u56Var9.c() != null) {
                                                            qq5 qq5VarC = u56Var9.c();
                                                            qq5VarC.getClass();
                                                            z34 = qq5VarC.e() && z35;
                                                        }
                                                        qga qgaVar6 = qgaVar5;
                                                        m62.c(qgaVar6, z34, jt1Var4, 0);
                                                        if (u56Var9.a() == bt4.v && !z33 && z35) {
                                                            jt1Var4.K(-714666198);
                                                            m62.d(qgaVar6, jt1Var4, 0);
                                                            jt1Var4.B();
                                                        } else {
                                                            jt1Var4.K(-714589318);
                                                            jt1Var4.B();
                                                        }
                                                    } else {
                                                        jt1Var4.u();
                                                    }
                                                    return g2b.a;
                                                }
                                            }, jt1Var3), jt1Var3, 48);
                                        } else {
                                            jt1Var3.u();
                                        }
                                        return g2b.a;
                                    }
                                }, jt1Var2), jt1Var2, 6);
                            } else {
                                jt1Var2.u();
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var = bj4Var10;
                    b(ox6VarH13, qgaVar3, gr1.b(-814563849, ci4Var6, bj4Var), bj4Var, 384);
                } else {
                    s85Var2 = s85Var;
                }
                z11 = z10;
                i10 = i9;
                if ((i12 & 48) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zJ2 = z11 | z12 | bj4Var3.j(ag7Var4) | bj4Var3.j(t72Var) | bj4Var3.j(fw0Var) | bj4Var3.j(qgaVar);
                objF6 = bj4Var3.f();
                if (zJ2) {
                    bj4Var4 = bj4Var3;
                    u56Var2 = u56Var6;
                    z1bVar2 = z1bVar;
                    s85Var3 = s85Var2;
                    oh4 oh4Var113 = new oh4() { // from class: b62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            sia siaVarD;
                            v94 v94Var = (v94) obj;
                            u56 u56Var7 = u56Var2;
                            if (u56Var7.b() == v94Var.e()) {
                                return g2b.a;
                            }
                            u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                            boolean zB = u56Var7.b();
                            kha khaVar15 = khaVar;
                            ag7 ag7Var5 = ag7Var4;
                            if (zB && z2 && !z3) {
                                m62.g(xhaVar, u56Var7, khaVar15, s85Var3, ag7Var5);
                            } else {
                                m62.e(u56Var7);
                            }
                            if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                oy0.d(t72Var, null, null, new j62(fw0Var, khaVar15, u56Var7, siaVarD, ag7Var5, null), 3);
                            }
                            if (!v94Var.e()) {
                                qgaVar.g(null);
                            }
                            return g2b.a;
                        }
                    };
                    xhaVar = xhaVar;
                    ag7Var = ag7Var4;
                    qgaVar2 = qgaVar;
                    fw0Var2 = fw0Var;
                    z13 = z2;
                    khaVar3 = khaVar;
                    t72Var2 = t72Var;
                    bj4Var4.C(oh4Var113);
                    objF6 = oh4Var113;
                } else {
                    bj4Var4 = bj4Var3;
                    u56Var2 = u56Var6;
                    z1bVar2 = z1bVar;
                    s85Var3 = s85Var2;
                    oh4 oh4Var114 = new oh4() { // from class: b62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            sia siaVarD;
                            v94 v94Var = (v94) obj;
                            u56 u56Var7 = u56Var2;
                            if (u56Var7.b() == v94Var.e()) {
                                return g2b.a;
                            }
                            u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                            boolean zB = u56Var7.b();
                            kha khaVar15 = khaVar;
                            ag7 ag7Var5 = ag7Var4;
                            if (zB && z2 && !z3) {
                                m62.g(xhaVar, u56Var7, khaVar15, s85Var3, ag7Var5);
                            } else {
                                m62.e(u56Var7);
                            }
                            if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                oy0.d(t72Var, null, null, new j62(fw0Var, khaVar15, u56Var7, siaVarD, ag7Var5, null), 3);
                            }
                            if (!v94Var.e()) {
                                qgaVar.g(null);
                            }
                            return g2b.a;
                        }
                    };
                    xhaVar = xhaVar;
                    ag7Var = ag7Var4;
                    qgaVar2 = qgaVar;
                    fw0Var2 = fw0Var;
                    z13 = z2;
                    khaVar3 = khaVar;
                    t72Var2 = t72Var;
                    bj4Var4.C(oh4Var114);
                    objF6 = oh4Var114;
                }
                aVar2 = ox6.a.t;
                ox6 ox6VarA14 = ia4.a(j84.c(ym2.b(aVar2, p94Var), (oh4) objF6), z13, h27Var);
                if (z13) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                h37VarJ = bl7.j(Boolean.valueOf(z14), bj4Var4);
                g2b g2bVar6 = g2b.a;
                boolean zJ1112 = bj4Var4.J(h37VarJ) | bj4Var4.j(u56Var2) | bj4Var4.j(xhaVar) | bj4Var4.j(qgaVar2);
                if (i10 > 32) {
                    u56Var3 = u56Var2;
                    if ((r4 & 48) != 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                } else {
                    u56Var3 = u56Var2;
                    if ((r4 & 48) != 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                z16 = zJ1112 | z15;
                Object objF114 = bj4Var4.f();
                if (z16) {
                    u56Var4 = u56Var3;
                    g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                    bj4Var4.C(g62Var);
                } else {
                    u56Var4 = u56Var3;
                    g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                    bj4Var4.C(g62Var);
                }
                wd3.d(bj4Var4, (ci4) g62Var, g2bVar6);
                ox6VarB = t6a.b(aVar2, 8675309, new va9(new rfa(u56Var4)));
                qgaVar3 = qgaVar2;
                t72 t72Var9 = t72Var2;
                ag7Var2 = ag7Var;
                xhaVar2 = xhaVar;
                r0 = new oh4() { // from class: sfa
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        xv9 xv9Var2;
                        vf7 vf7Var = (vf7) obj;
                        u56 u56Var7 = u56Var4;
                        if (!u56Var7.b()) {
                            p94.a(p94Var);
                        } else if (!z3 && (xv9Var2 = u56Var7.c) != null) {
                            xv9Var2.b();
                        }
                        if (u56Var7.b() && z2) {
                            if (u56Var7.a() != bt4.u) {
                                sia siaVarD = u56Var7.d();
                                if (siaVarD != null) {
                                    long j6 = vf7Var.a;
                                    nd3 nd3Var2 = u56Var7.d;
                                    g75 g75Var7 = u56Var7.v;
                                    int iA = ag7Var2.a(siaVarD.b(j6, true));
                                    g75Var7.invoke(kha.a(nd3Var2.a, null, ay.c(iA, iA), 5));
                                    if (u56Var7.a.a.u.length() > 0) {
                                        u56Var7.k.setValue(bt4.v);
                                    }
                                }
                            } else {
                                qgaVar3.g(vf7Var);
                            }
                        }
                        return g2b.a;
                    }
                };
                if (z2) {
                    ox6VarB = it1.a(ox6VarB, new ei4() { // from class: vfa
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(-102778667);
                            Object objF115 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (objF115 == c0187a2) {
                                c33 c33Var4 = wd3.a;
                                nm8 nm8Var = new nm8(jt1Var2.x());
                                jt1Var2.C(nm8Var);
                                objF115 = nm8Var;
                            }
                            t72 t72Var10 = (t72) objF115;
                            Object objF20 = jt1Var2.f();
                            if (objF20 == c0187a2) {
                                objF20 = bl7.i(null);
                                jt1Var2.C(objF20);
                            }
                            final h37 h37Var = (h37) objF20;
                            h37 h37VarJ2 = bl7.j(r0, jt1Var2);
                            final h27 h27Var2 = h27Var;
                            boolean zJ1113 = jt1Var2.J(h27Var2);
                            Object objF21 = jt1Var2.f();
                            if (zJ1113 || objF21 == c0187a2) {
                                objF21 = new oh4() { // from class: wfa
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj4) {
                                        return new zfa(h37Var, h27Var2);
                                    }
                                };
                                jt1Var2.C(objF21);
                            }
                            wd3.a(h27Var2, (oh4) objF21, jt1Var2);
                            boolean zJ1114 = jt1Var2.j(t72Var10) | jt1Var2.J(h27Var2) | jt1Var2.J(h37VarJ2);
                            Object objF22 = jt1Var2.f();
                            if (zJ1114 || objF22 == c0187a2) {
                                objF22 = new yfa(t72Var10, h37Var, h27Var2, h37VarJ2);
                                jt1Var2.C(objF22);
                            }
                            ox6 ox6VarB8 = t6a.b(ox6.a.t, h27Var2, (PointerInputEventHandler) objF22);
                            jt1Var2.B();
                            return ox6VarB8;
                        }
                    });
                }
                ox6 ox6VarH14 = ox6VarB.H(new q6a(qgaVar3.A, qgaVar3.z, new tfa(qgaVar3), 4));
                w48.a.getClass();
                ox6 ox6VarC13 = by5.c(ox6VarH14, y48.u);
                final ox6 ox6VarC14 = z63.c(aVar2, new oh4() { // from class: t52
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        d73 d73Var = (d73) obj;
                        u56 u56Var7 = u56Var4;
                        sia siaVarD = u56Var7.d();
                        if (siaVarD != null) {
                            n41 n41VarA = d73Var.Y0().a();
                            long j6 = ((lja) u56Var7.A.getValue()).a;
                            long j7 = ((lja) u56Var7.B.getValue()).a;
                            ria riaVar = siaVarD.a;
                            l07 l07Var = riaVar.b;
                            qia qiaVar = riaVar.a;
                            np npVar = u56Var7.y;
                            long j8 = u56Var7.z;
                            boolean zC2 = lja.c(j6);
                            ag7 ag7Var5 = ag7Var2;
                            if (!zC2) {
                                npVar.f(j8);
                                int iB3 = ag7Var5.b(lja.f(j6));
                                int iB4 = ag7Var5.b(lja.e(j6));
                                if (iB3 != iB4) {
                                    n41VarA.c(riaVar.i(iB3, iB4), npVar);
                                }
                            } else if (lja.c(j7)) {
                                kha khaVar15 = khaVar3;
                                if (!lja.c(khaVar15.b)) {
                                    npVar.f(j8);
                                    long j9 = khaVar15.b;
                                    int iB5 = ag7Var5.b(lja.f(j9));
                                    int iB6 = ag7Var5.b(lja.e(j9));
                                    if (iB5 != iB6) {
                                        n41VarA.c(riaVar.i(iB5, iB6), npVar);
                                    }
                                }
                            } else {
                                long jB = qiaVar.b.b();
                                uh1 uh1Var = new uh1(jB);
                                if (jB == 16) {
                                    uh1Var = null;
                                }
                                long j10 = uh1Var != null ? uh1Var.a : uh1.b;
                                npVar.f(uh1.b(uh1.d(j10) * 0.2f, j10));
                                int iB7 = ag7Var5.b(lja.f(j7));
                                int iB8 = ag7Var5.b(lja.e(j7));
                                if (iB7 != iB8) {
                                    n41VarA.c(riaVar.i(iB7, iB8), npVar);
                                }
                            }
                            boolean z2111 = riaVar.d() && qiaVar.f != 3;
                            if (z2111) {
                                long j11 = riaVar.c;
                                sk8 sk8VarA = tk8.a(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                n41VarA.f();
                                n41VarA.r(sk8VarA);
                            }
                            ww9 ww9Var = qiaVar.b.a;
                            fda fdaVar = ww9Var.m;
                            mha mhaVar = ww9Var.a;
                            if (fdaVar == null) {
                                fdaVar = fda.b;
                            }
                            fda fdaVar2 = fdaVar;
                            el9 el9Var = ww9Var.n;
                            if (el9Var == null) {
                                el9Var = el9.d;
                            }
                            el9 el9Var2 = el9Var;
                            e73 e73Var = ww9Var.p;
                            if (e73Var == null) {
                                e73Var = zy3.a;
                            }
                            e73 e73Var2 = e73Var;
                            try {
                                fx0 fx0VarE = mhaVar.e();
                                mha.a aVar5 = mha.a.a;
                                if (fx0VarE != null) {
                                    l07.j(l07Var, n41VarA, fx0VarE, mhaVar != aVar5 ? mhaVar.a() : 1.0f, el9Var2, fdaVar2, e73Var2);
                                } else {
                                    l07.i(l07Var, n41VarA, mhaVar != aVar5 ? mhaVar.c() : uh1.b, el9Var2, fdaVar2, e73Var2);
                                }
                            } finally {
                                if (z2111) {
                                    n41VarA.o();
                                }
                            }
                        }
                        return g2b.a;
                    }
                });
                boolean zJ1113 = bj4Var4.j(u56Var4);
                if (i7 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zJ1114 = zJ1113 | z17 | bj4Var4.J(mmbVar) | bj4Var4.j(qgaVar3);
                if (i8 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zJ3 = zJ1114 | z18 | bj4Var4.j(ag7Var2);
                objF7 = bj4Var4.f();
                if (zJ3) {
                    final kha khaVar15 = khaVar3;
                    oh4 oh4Var115 = new oh4() { // from class: c62
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            gia giaVar2;
                            qq5 qq5Var;
                            qq5 qq5Var2;
                            u56 u56Var7 = u56Var4;
                            dt7 dt7Var = u56Var7.o;
                            qq5 qq5Var3 = (qq5) obj;
                            u56Var7.h = qq5Var3;
                            sia siaVarD = u56Var7.d();
                            if (siaVarD != null) {
                                siaVarD.b = qq5Var3;
                            }
                            if (z2) {
                                bt4 bt4VarA = u56Var7.a();
                                bt4 bt4Var = bt4.u;
                                qga qgaVar4 = qgaVar3;
                                kha khaVar16 = khaVar15;
                                if (bt4VarA == bt4Var) {
                                    if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                        qgaVar4.r();
                                    } else {
                                        qgaVar4.o();
                                    }
                                    u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                    dt7Var.setValue(Boolean.valueOf(lja.c(khaVar16.b)));
                                } else if (u56Var7.a() == bt4.v) {
                                    dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                }
                                ag7 ag7Var5 = ag7Var2;
                                m62.f(u56Var7, khaVar16, ag7Var5);
                                sia siaVarD2 = u56Var7.d();
                                if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                    ria riaVar = siaVarD2.a;
                                    zda zdaVar = new zda(qq5Var);
                                    sk8 sk8VarA = fb9.a(qq5Var);
                                    sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                    if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                        giaVar2.b.c(khaVar16, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                    }
                                }
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(oh4Var115);
                    objF7 = oh4Var115;
                } else {
                    final kha khaVar16 = khaVar3;
                    oh4 oh4Var116 = new oh4() { // from class: c62
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            gia giaVar2;
                            qq5 qq5Var;
                            qq5 qq5Var2;
                            u56 u56Var7 = u56Var4;
                            dt7 dt7Var = u56Var7.o;
                            qq5 qq5Var3 = (qq5) obj;
                            u56Var7.h = qq5Var3;
                            sia siaVarD = u56Var7.d();
                            if (siaVarD != null) {
                                siaVarD.b = qq5Var3;
                            }
                            if (z2) {
                                bt4 bt4VarA = u56Var7.a();
                                bt4 bt4Var = bt4.u;
                                qga qgaVar4 = qgaVar3;
                                kha khaVar17 = khaVar16;
                                if (bt4VarA == bt4Var) {
                                    if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                        qgaVar4.r();
                                    } else {
                                        qgaVar4.o();
                                    }
                                    u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                    dt7Var.setValue(Boolean.valueOf(lja.c(khaVar17.b)));
                                } else if (u56Var7.a() == bt4.v) {
                                    dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                }
                                ag7 ag7Var5 = ag7Var2;
                                m62.f(u56Var7, khaVar17, ag7Var5);
                                sia siaVarD2 = u56Var7.d();
                                if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                    ria riaVar = siaVarD2.a;
                                    zda zdaVar = new zda(qq5Var);
                                    sk8 sk8VarA = fb9.a(qq5Var);
                                    sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                    if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                        giaVar2.b.c(khaVar17, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                    }
                                }
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(oh4Var116);
                    objF7 = oh4Var116;
                }
                final ox6 ox6VarB8 = oh7.b(aVar2, (oh4) objF7);
                u56Var5 = u56Var4;
                p62 p62Var7 = new p62(mvaVar, khaVar, u56Var5, z3, z2, ag7Var2, qgaVar3, s85Var, p94Var);
                if (!z2) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    ox6VarA = it1.a(aVar2, new ei4() { // from class: qda
                        /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Object objE;
                            ox6 ox6Var14 = (ox6) obj;
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(-84507373);
                            boolean zBooleanValue2 = ((Boolean) jt1Var2.F(qu1.x)).booleanValue();
                            boolean zC2 = jt1Var2.c(zBooleanValue2);
                            Object objF115 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (zC2 || objF115 == c0187a2) {
                                objF115 = new cd2(zBooleanValue2);
                                jt1Var2.C(objF115);
                            }
                            final cd2 cd2Var = (cd2) objF115;
                            final fx0 fx0Var3 = fx0Var;
                            boolean z2111 = ((fx0Var3 instanceof aw9) && ((aw9) fx0Var3).a == 16) ? false : true;
                            if (((mmb) jt1Var2.F(qu1.u)).a()) {
                                final u56 u56Var7 = u56Var5;
                                if (u56Var7.b()) {
                                    final kha khaVar17 = khaVar;
                                    if (lja.c(khaVar17.b) && z2111) {
                                        jt1Var2.K(-707487962);
                                        iw iwVar5 = khaVar17.a;
                                        lja ljaVar3 = new lja(khaVar17.b);
                                        boolean zJ1115 = jt1Var2.j(cd2Var);
                                        Object objF20 = jt1Var2.f();
                                        if (zJ1115 || objF20 == c0187a2) {
                                            objF20 = new sda(cd2Var, null);
                                            jt1Var2.C(objF20);
                                        }
                                        wd3.f(iwVar5, ljaVar3, (ci4) objF20, jt1Var2);
                                        boolean zJ1116 = jt1Var2.j(cd2Var);
                                        final ag7 ag7Var5 = ag7Var2;
                                        boolean zJ1117 = jt1Var2.j(ag7Var5) | zJ1116 | jt1Var2.J(khaVar17) | jt1Var2.j(u56Var7) | jt1Var2.J(fx0Var3);
                                        Object objF21 = jt1Var2.f();
                                        if (zJ1117 || objF21 == c0187a2) {
                                            oh4 oh4Var117 = new oh4() { // from class: rda
                                                @Override // defpackage.oh4
                                                public final Object invoke(Object obj4) {
                                                    cz1 cz1Var = (cz1) obj4;
                                                    cz1Var.K1();
                                                    float fH = cd2Var.c.h();
                                                    if (fH != 0.0f) {
                                                        long j6 = khaVar17.b;
                                                        int i111 = lja.c;
                                                        int iB3 = ag7Var5.b((int) (j6 >> 32));
                                                        sia siaVarD = u56Var7.d();
                                                        sk8 sk8VarC = siaVarD != null ? siaVarD.a.c(iB3) : new sk8(0.0f, 0.0f, 0.0f, 0.0f);
                                                        float fFloor = (float) Math.floor(cz1Var.U0(2.0f));
                                                        float f = fFloor < 1.0f ? 1.0f : fFloor;
                                                        float f2 = f / 2.0f;
                                                        float f3 = sk8VarC.a + f2;
                                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() >> 32)) - f2;
                                                        if (f3 > fIntBitsToFloat) {
                                                            f3 = fIntBitsToFloat;
                                                        }
                                                        if (f3 >= f2) {
                                                            f2 = f3;
                                                        }
                                                        float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                                                        cz1Var.T0(fx0Var3, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.d)) & 4294967295L), f, fH);
                                                    }
                                                    return g2b.a;
                                                }
                                            };
                                            jt1Var2.C(oh4Var117);
                                            objF21 = oh4Var117;
                                        }
                                        objE = z63.e(ox6Var14, (oh4) objF21);
                                        jt1Var2.B();
                                    } else {
                                        jt1Var2.K(-705473241);
                                        jt1Var2.B();
                                        objE = ox6.a.t;
                                    }
                                } else {
                                    jt1Var2.K(-705473241);
                                    jt1Var2.B();
                                    objE = ox6.a.t;
                                }
                            } else {
                                jt1Var2.K(-705473241);
                                jt1Var2.B();
                                objE = ox6.a.t;
                            }
                            jt1Var2.B();
                            return objE;
                        }
                    });
                } else {
                    ox6VarA = aVar2;
                }
                zJ4 = bj4Var4.j(qgaVar3);
                objF8 = bj4Var4.f();
                if (zJ4) {
                    objF8 = new oh4() { // from class: d62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return new k62(qgaVar3);
                        }
                    };
                    bj4Var4.C(objF8);
                } else {
                    objF8 = new oh4() { // from class: d62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return new k62(qgaVar3);
                        }
                    };
                    bj4Var4.C(objF8);
                }
                wd3.a(qgaVar3, (oh4) objF8, bj4Var4);
                boolean zJ1115 = bj4Var4.j(u56Var5) | bj4Var4.j(xhaVar2);
                if (i8 == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = zJ1115 | z20 | ((i10 <= 32 && bj4Var4.J(s85Var)) || (i12 & 48) == 32);
                objF9 = bj4Var4.f();
                if (z21) {
                    objF9 = new oh4() { // from class: e62
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            u56 u56Var7 = u56Var5;
                            if (u56Var7.b()) {
                                nd3 nd3Var2 = u56Var7.d;
                                g75 g75Var7 = u56Var7.v;
                                s56 s56Var = u56Var7.w;
                                gl8 gl8Var = new gl8();
                                yda ydaVar = new yda(nd3Var2, g75Var7, gl8Var);
                                xha xhaVar4 = xhaVar2;
                                y18 y18Var = xhaVar4.a;
                                y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                ?? giaVar2 = new gia(xhaVar4, y18Var);
                                xhaVar4.b.set((gia) giaVar2);
                                gl8Var.t = giaVar2;
                                u56Var7.e = giaVar2;
                            }
                            return new l62();
                        }
                    };
                    bj4Var4.C(objF9);
                } else {
                    objF9 = new oh4() { // from class: e62
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            u56 u56Var7 = u56Var5;
                            if (u56Var7.b()) {
                                nd3 nd3Var2 = u56Var7.d;
                                g75 g75Var7 = u56Var7.v;
                                s56 s56Var = u56Var7.w;
                                gl8 gl8Var = new gl8();
                                yda ydaVar = new yda(nd3Var2, g75Var7, gl8Var);
                                xha xhaVar4 = xhaVar2;
                                y18 y18Var = xhaVar4.a;
                                y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                ?? giaVar2 = new gia(xhaVar4, y18Var);
                                xhaVar4.b.set((gia) giaVar2);
                                gl8Var.t = giaVar2;
                                u56Var7.e = giaVar2;
                            }
                            return new l62();
                        }
                    };
                    bj4Var4.C(objF9);
                }
                wd3.a(s85Var, (oh4) objF9, bj4Var4);
                final oh4 g75Var7 = u56Var5.v;
                if (i == 1) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                final int i111 = s85Var.e;
                final z1b z1bVar9 = z1bVar2;
                ox6 ox6VarA15 = it1.a(aVar2, new ei4() { // from class: cfa
                    @Override // defpackage.ei4
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        jt1 jt1Var2 = (jt1) obj2;
                        ((Integer) obj3).getClass();
                        jt1Var2.K(851809892);
                        Object objF115 = jt1Var2.f();
                        jt1.a.C0187a c0187a2 = jt1.a.a;
                        if (objF115 == c0187a2) {
                            objF115 = new kja();
                            jt1Var2.C(objF115);
                        }
                        kja kjaVar = (kja) objF115;
                        Object objF20 = jt1Var2.f();
                        if (objF20 == c0187a2) {
                            objF20 = new vm2();
                            jt1Var2.C(objF20);
                        }
                        bfa bfaVar = new bfa(u56Var5, qgaVar3, khaVar, z217, z22, kjaVar, ag7Var2, z1bVar9, (vm2) objF20, g75Var7, i111);
                        boolean zJ1116 = jt1Var2.j(bfaVar);
                        Object objF21 = jt1Var2.f();
                        if (zJ1116 || objF21 == c0187a2) {
                            dfa dfaVar = new dfa(1, bfaVar, bfa.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                            jt1Var2.C(dfaVar);
                            objF21 = dfaVar;
                        }
                        qo5 qo5Var = new qo5((oh4) ((yn5) objF21), null);
                        jt1Var2.B();
                        return qo5Var;
                    }
                });
                i11 = s85Var.d;
                if (i11 == 7) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                zBooleanValue = ((Boolean) h37VarJ.getValue()).booleanValue();
                zC = bj4Var4.c(z23) | bj4Var4.j(n56Var);
                objF10 = bj4Var4.f();
                if (zC) {
                    objF10 = new mh4() { // from class: f62
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            if (z23) {
                                n56Var.i();
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(objF10);
                } else {
                    objF10 = new mh4() { // from class: f62
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            if (z23) {
                                n56Var.i();
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(objF10);
                }
                mh4 mh4Var7 = (mh4) objF10;
                if (zBooleanValue) {
                    ox6VarH = aVar2;
                } else {
                    ox6VarH = aVar2;
                }
                fx0Var2 = (fx0) bj4Var4.F(lf0.a);
                j2 = ((uh1) bj4Var4.F(lf0.b)).a;
                if (uh1.c(j2, u7d.c(1308617531))) {
                    aw9Var = new aw9(j2);
                } else {
                    aw9Var = fx0Var2;
                }
                zJ5 = bj4Var4.j(u56Var5) | bj4Var4.J(aw9Var);
                objF11 = bj4Var4.f();
                if (zJ5) {
                    z24 = false;
                    objF11 = new r52(0, u56Var5, aw9Var);
                    bj4Var4.C(objF11);
                } else {
                    z24 = false;
                    objF11 = new r52(0, u56Var5, aw9Var);
                    bj4Var4.C(objF11);
                }
                ox6 ox6VarH15 = oh7.b(it1.a(ro5.a(ro5.a(ox6Var.H(z63.e(aVar2, (oh4) objF11)).H(new f56(n56Var, u56Var5, qgaVar3)).H(ox6VarH).H(ox6VarA14), new cea(d94Var, u56Var5)), new o62(u56Var5, qgaVar3)).H(ox6VarA15), new ei4() { // from class: bga
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ei4
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        gga ggaVar2 = ggaVar;
                        dt7 dt7Var = ggaVar2.f;
                        jt1 jt1Var2 = (jt1) obj2;
                        ((Integer) obj3).getClass();
                        jt1Var2.K(-2137546592);
                        boolean z2111 = ((fl7) dt7Var.getValue()) == fl7.t || !(jt1Var2.F(qu1.n) == tq5.u);
                        boolean zJ1116 = jt1Var2.J(ggaVar2);
                        Object objF115 = jt1Var2.f();
                        jt1.a.C0187a c0187a2 = jt1.a.a;
                        if (zJ1116 || objF115 == c0187a2) {
                            objF115 = new a26(1, ggaVar2);
                            jt1Var2.C(objF115);
                        }
                        h37 h37VarJ2 = bl7.j((oh4) objF115, jt1Var2);
                        Object objF20 = jt1Var2.f();
                        if (objF20 == c0187a2) {
                            ht2 ht2Var = new ht2(new r58(1, h37VarJ2));
                            jt1Var2.C(ht2Var);
                            objF20 = ht2Var;
                        }
                        s79 s79Var = (s79) objF20;
                        boolean zJ1117 = jt1Var2.J(s79Var) | jt1Var2.J(ggaVar2);
                        Object objF21 = jt1Var2.f();
                        if (zJ1117 || objF21 == c0187a2) {
                            objF21 = new cga(s79Var, ggaVar2);
                            jt1Var2.C(objF21);
                        }
                        ox6 ox6VarB9 = d79.b((cga) objF21, (fl7) dt7Var.getValue(), z2 && ggaVar2.b.h() != 0.0f, z2111, h27Var);
                        jt1Var2.B();
                        return ox6VarB9;
                    }
                }).H(ox6VarC13).H(p62Var7), new j11(1, u56Var5)).H(new mb(new d11(1, qgaVar3, t72Var9)));
                if (z2) {
                    z24 = true;
                }
                if (z24) {
                    ox6VarA2 = aVar2;
                } else {
                    ox6VarA2 = aVar2;
                }
                final boolean z2111 = z24;
                bj4 bj4Var11 = bj4Var4;
                final fw0 fw0Var9 = fw0Var2;
                final ox6 ox6Var14 = ox6VarA2;
                final tx2 tx2Var10 = tx2Var2;
                final ox6 ox6Var15 = ox6VarA;
                ci4 ci4Var7 = new ci4() { // from class: z52
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        jt1 jt1Var2 = (jt1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final u56 u56Var7 = u56Var5;
                            final wja wjaVar3 = wjaVar;
                            final int i112 = i2;
                            final int i113 = i;
                            final gga ggaVar2 = ggaVar;
                            final kha khaVar17 = khaVar;
                            final ojb ojbVar2 = ojbVar;
                            final ox6 ox6Var16 = ox6Var15;
                            final ox6 ox6Var17 = ox6VarC14;
                            final ox6 ox6Var18 = ox6VarB8;
                            final ox6 ox6Var19 = ox6Var14;
                            final fw0 fw0Var10 = fw0Var9;
                            final qga qgaVar4 = qgaVar3;
                            final boolean z30 = z2111;
                            final boolean z31 = z3;
                            final oh4 oh4Var117 = oh4Var2;
                            final ag7 ag7Var5 = ag7Var2;
                            final tx2 tx2Var11 = tx2Var10;
                            ei4Var.invoke(gr1.b(-44346382, new ci4() { // from class: u52
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj3, Object obj4) {
                                    ox6 kebVar;
                                    jt1 jt1Var3 = (jt1) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (jt1Var3.A(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        final u56 u56Var8 = u56Var7;
                                        ox6 ox6VarE = ir9.e(ox6.a.t, ((y43) u56Var8.g.getValue()).t, 0.0f, 2);
                                        int i114 = i112;
                                        final int i115 = i113;
                                        cv4.a(i114, i115);
                                        wja wjaVar4 = wjaVar3;
                                        if (i114 != 1 || i115 != Integer.MAX_VALUE) {
                                            ox6VarE = ox6VarE.H(new bv4(wjaVar4, i114, i115));
                                        }
                                        boolean zJ1116 = jt1Var3.j(u56Var8);
                                        Object objF115 = jt1Var3.f();
                                        if (zJ1116 || objF115 == jt1.a.a) {
                                            objF115 = new w01(1, u56Var8);
                                            jt1Var3.C(objF115);
                                        }
                                        mh4 mh4Var8 = (mh4) objF115;
                                        gga ggaVar3 = ggaVar2;
                                        fl7 fl7Var3 = (fl7) ggaVar3.f.getValue();
                                        final kha khaVar18 = khaVar17;
                                        long j6 = khaVar18.b;
                                        int i20 = lja.c;
                                        int iF = (int) (j6 >> 32);
                                        long j7 = ggaVar3.e;
                                        if (iF == ((int) (j7 >> 32)) && (iF = (int) (j6 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                                            iF = lja.f(j6);
                                        }
                                        ggaVar3.e = khaVar18.b;
                                        mva mvaVarA2 = n7b.a(ojbVar2, khaVar18.a);
                                        int iOrdinal = fl7Var3.ordinal();
                                        if (iOrdinal == 0) {
                                            kebVar = new keb(ggaVar3, iF, mvaVarA2, mh4Var8);
                                        } else {
                                            if (iOrdinal != 1) {
                                                u.b();
                                                return null;
                                            }
                                            kebVar = new l15(ggaVar3, iF, mvaVarA2, mh4Var8);
                                        }
                                        ox6 ox6VarA16 = kw0.a(uma.b(ox6VarE).H(kebVar).H(ox6Var16).H(ox6Var17).H(new gha(wjaVar4)).H(ox6Var18).H(ox6Var19), fw0Var10);
                                        final qga qgaVar5 = qgaVar4;
                                        final boolean z32 = z30;
                                        final boolean z33 = z31;
                                        final oh4 oh4Var118 = oh4Var117;
                                        final ag7 ag7Var6 = ag7Var5;
                                        final tx2 tx2Var12 = tx2Var11;
                                        lp9.a(ox6VarA16, gr1.b(1412697320, new ci4() { // from class: v52
                                            /* JADX WARN: Code duplicated, block: B:22:0x0099  */
                                            @Override // defpackage.ci4
                                            public final Object invoke(Object obj5, Object obj6) {
                                                boolean z34;
                                                jt1 jt1Var4 = (jt1) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                if (jt1Var4.A(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    u56 u56Var9 = u56Var8;
                                                    i62 i62Var = new i62(u56Var9, oh4Var118, khaVar18, ag7Var6, tx2Var12, i115);
                                                    int iHashCode = Long.hashCode(jt1Var4.v());
                                                    kw7 kw7VarY = jt1Var4.y();
                                                    ox6 ox6VarC15 = it1.c(jt1Var4, ox6.a.t);
                                                    bt1.c.getClass();
                                                    qr5.a aVar5 = bt1.a.b;
                                                    if (jt1Var4.s() == null) {
                                                        ml5.c();
                                                        throw null;
                                                    }
                                                    jt1Var4.q();
                                                    if (jt1Var4.l()) {
                                                        jt1Var4.k(aVar5);
                                                    } else {
                                                        jt1Var4.z();
                                                    }
                                                    rd7.d(jt1Var4, bt1.a.f, i62Var);
                                                    rd7.d(jt1Var4, bt1.a.e, kw7VarY);
                                                    rd7.d(jt1Var4, bt1.a.g, Integer.valueOf(iHashCode));
                                                    rd7.c(jt1Var4, bt1.a.h);
                                                    rd7.d(jt1Var4, bt1.a.d, ox6VarC15);
                                                    jt1Var4.I();
                                                    bt4 bt4VarA = u56Var9.a();
                                                    bt4 bt4Var = bt4.t;
                                                    boolean z35 = z32;
                                                    if (bt4VarA != bt4Var && u56Var9.c() != null) {
                                                        qq5 qq5VarC = u56Var9.c();
                                                        qq5VarC.getClass();
                                                        z34 = qq5VarC.e() && z35;
                                                    }
                                                    qga qgaVar6 = qgaVar5;
                                                    m62.c(qgaVar6, z34, jt1Var4, 0);
                                                    if (u56Var9.a() == bt4.v && !z33 && z35) {
                                                        jt1Var4.K(-714666198);
                                                        m62.d(qgaVar6, jt1Var4, 0);
                                                        jt1Var4.B();
                                                    } else {
                                                        jt1Var4.K(-714589318);
                                                        jt1Var4.B();
                                                    }
                                                } else {
                                                    jt1Var4.u();
                                                }
                                                return g2b.a;
                                            }
                                        }, jt1Var3), jt1Var3, 48);
                                    } else {
                                        jt1Var3.u();
                                    }
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 6);
                        } else {
                            jt1Var2.u();
                        }
                        return g2b.a;
                    }
                };
                bj4Var = bj4Var11;
                b(ox6VarH15, qgaVar3, gr1.b(-814563849, ci4Var7, bj4Var), bj4Var, 384);
            }
            z6 = false;
            if (ljaVar == null) {
                td3 td3Var9 = nd3Var.b;
                td3Var9.d = -1;
                td3Var9.e = -1;
                bj4Var2 = bj4VarO;
            } else {
                bj4Var2 = bj4VarO;
                j = ljaVar.a;
                if (!lja.c(j)) {
                    nd3Var.b.g(lja.f(j), lja.e(j));
                }
            }
            if (z5) {
                td3 td3Var10 = nd3Var.b;
                td3Var10.d = -1;
                td3Var10.e = -1;
                khaVarA = kha.a(khaVar, null, 0L, 3);
            } else {
                td3 td3Var11 = nd3Var.b;
                td3Var11.d = -1;
                td3Var11.e = -1;
                khaVarA = kha.a(khaVar, null, 0L, 3);
            }
            khaVar2 = nd3Var.a;
            nd3Var.a = khaVarA;
            if (giaVar != null) {
                giaVar.a(khaVar2, khaVarA);
            }
            objF = bj4Var2.f();
            if (objF == c0187a) {
                objF = new z1b(0);
                bj4Var3 = bj4Var2;
                bj4Var3.C(objF);
            } else {
                bj4Var3 = bj4Var2;
            }
            z1bVar = (z1b) objF;
            jCurrentTimeMillis = System.currentTimeMillis();
            if (z1bVar.f) {
                z1bVar.e = Long.valueOf(jCurrentTimeMillis);
                z1bVar.a(khaVar);
            } else {
                l = z1bVar.e;
                if (jCurrentTimeMillis > (l != null ? l.longValue() : 0L) + 5000) {
                    z1bVar.e = Long.valueOf(jCurrentTimeMillis);
                    z1bVar.a(khaVar);
                }
            }
            objF2 = bj4Var3.f();
            if (objF2 == c0187a) {
                c33 c33Var4 = wd3.a;
                objF2 = m78.a(bj4Var3.x(), bj4Var3);
            }
            t72Var = (t72) objF2;
            objF3 = bj4Var3.f();
            if (objF3 == c0187a) {
                objF3 = new jw0();
                bj4Var3.C(objF3);
            }
            fw0Var = (fw0) objF3;
            objF4 = bj4Var3.f();
            if (objF4 == c0187a) {
                objF4 = new qga(z1bVar);
                bj4Var3.C(objF4);
            }
            qgaVar = (qga) objF4;
            qgaVar.b = ag7Var4;
            qgaVar.c = u56Var6.v;
            qgaVar.d = u56Var6;
            qgaVar.e.setValue(khaVar);
            qgaVar.w = new lja(j5);
            qgaVar.g = (pf1) bj4Var3.F(qu1.f);
            qgaVar.h = t72Var;
            qgaVar.j = (xja) bj4Var3.F(qu1.r);
            qgaVar.k = (st4) bj4Var3.F(qu1.l);
            qgaVar.l = p94Var;
            final boolean z2112 = !z3;
            qgaVar.m.setValue(Boolean.valueOf(z2112));
            qgaVar.n.setValue(Boolean.valueOf(z2));
            bj4Var3.K(1966756105);
            ad6Var = wjaVar2.a.k;
            y0a y0aVar4 = q18.a;
            bj4Var3.K(430530635);
            if (Build.VERSION.SDK_INT < 28) {
                bj4Var3.B();
                j18Var = null;
            } else {
                context = (Context) bj4Var3.F(AndroidCompositionLocals_androidKt.b);
                h72Var = (h72) bj4Var3.F(q18.a);
                zJ = bj4Var3.J(h72Var) | bj4Var3.J(context) | bj4Var3.J(ad6Var);
                objF5 = bj4Var3.f();
                if (zJ) {
                    q18.b.getClass();
                    objF5 = new o18(h72Var, context, aa9.t, ad6Var);
                    bj4Var3.C(objF5);
                } else {
                    q18.b.getClass();
                    objF5 = new o18(h72Var, context, aa9.t, ad6Var);
                    bj4Var3.C(objF5);
                }
                j18Var = (j18) objF5;
                bj4Var3.B();
            }
            qgaVar.i = j18Var;
            bj4Var3.U(false);
            u56Var6.b();
            boolean zJ24 = bj4Var3.j(u56Var6);
            i7 = i12 & 7168;
            if (i7 == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z2113 = zJ24 | z7;
            if ((i12 & 57344) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z2114 = z8 | z2113;
            xhaVar = xhaVar3;
            boolean zJ25 = z2114 | bj4Var3.j(xhaVar);
            i8 = i13;
            if (i8 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z9 | zJ25;
            i9 = (i12 & 112) ^ 48;
            if (i9 > 32) {
                s85Var2 = s85Var;
                if (!bj4Var3.J(s85Var2)) {
                    z11 = z10;
                    i10 = i9;
                }
                z12 = true;
                zJ2 = z11 | z12 | bj4Var3.j(ag7Var4) | bj4Var3.j(t72Var) | bj4Var3.j(fw0Var) | bj4Var3.j(qgaVar);
                objF6 = bj4Var3.f();
                if (zJ2) {
                    bj4Var4 = bj4Var3;
                    u56Var2 = u56Var6;
                    z1bVar2 = z1bVar;
                    s85Var3 = s85Var2;
                    oh4 oh4Var117 = new oh4() { // from class: b62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            sia siaVarD;
                            v94 v94Var = (v94) obj;
                            u56 u56Var7 = u56Var2;
                            if (u56Var7.b() == v94Var.e()) {
                                return g2b.a;
                            }
                            u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                            boolean zB = u56Var7.b();
                            kha khaVar17 = khaVar;
                            ag7 ag7Var5 = ag7Var4;
                            if (zB && z2 && !z3) {
                                m62.g(xhaVar, u56Var7, khaVar17, s85Var3, ag7Var5);
                            } else {
                                m62.e(u56Var7);
                            }
                            if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                oy0.d(t72Var, null, null, new j62(fw0Var, khaVar17, u56Var7, siaVarD, ag7Var5, null), 3);
                            }
                            if (!v94Var.e()) {
                                qgaVar.g(null);
                            }
                            return g2b.a;
                        }
                    };
                    xhaVar = xhaVar;
                    ag7Var = ag7Var4;
                    qgaVar2 = qgaVar;
                    fw0Var2 = fw0Var;
                    z13 = z2;
                    khaVar3 = khaVar;
                    t72Var2 = t72Var;
                    bj4Var4.C(oh4Var117);
                    objF6 = oh4Var117;
                } else {
                    bj4Var4 = bj4Var3;
                    u56Var2 = u56Var6;
                    z1bVar2 = z1bVar;
                    s85Var3 = s85Var2;
                    oh4 oh4Var118 = new oh4() { // from class: b62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            sia siaVarD;
                            v94 v94Var = (v94) obj;
                            u56 u56Var7 = u56Var2;
                            if (u56Var7.b() == v94Var.e()) {
                                return g2b.a;
                            }
                            u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                            boolean zB = u56Var7.b();
                            kha khaVar17 = khaVar;
                            ag7 ag7Var5 = ag7Var4;
                            if (zB && z2 && !z3) {
                                m62.g(xhaVar, u56Var7, khaVar17, s85Var3, ag7Var5);
                            } else {
                                m62.e(u56Var7);
                            }
                            if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                                oy0.d(t72Var, null, null, new j62(fw0Var, khaVar17, u56Var7, siaVarD, ag7Var5, null), 3);
                            }
                            if (!v94Var.e()) {
                                qgaVar.g(null);
                            }
                            return g2b.a;
                        }
                    };
                    xhaVar = xhaVar;
                    ag7Var = ag7Var4;
                    qgaVar2 = qgaVar;
                    fw0Var2 = fw0Var;
                    z13 = z2;
                    khaVar3 = khaVar;
                    t72Var2 = t72Var;
                    bj4Var4.C(oh4Var118);
                    objF6 = oh4Var118;
                }
                aVar2 = ox6.a.t;
                ox6 ox6VarA16 = ia4.a(j84.c(ym2.b(aVar2, p94Var), (oh4) objF6), z13, h27Var);
                if (z13) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                h37VarJ = bl7.j(Boolean.valueOf(z14), bj4Var4);
                g2b g2bVar7 = g2b.a;
                boolean zJ1116 = bj4Var4.J(h37VarJ) | bj4Var4.j(u56Var2) | bj4Var4.j(xhaVar) | bj4Var4.j(qgaVar2);
                if (i10 > 32) {
                    u56Var3 = u56Var2;
                    if ((r4 & 48) != 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                } else {
                    u56Var3 = u56Var2;
                    if ((r4 & 48) != 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                z16 = zJ1116 | z15;
                Object objF115 = bj4Var4.f();
                if (z16) {
                    u56Var4 = u56Var3;
                    g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                    bj4Var4.C(g62Var);
                } else {
                    u56Var4 = u56Var3;
                    g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                    bj4Var4.C(g62Var);
                }
                wd3.d(bj4Var4, (ci4) g62Var, g2bVar7);
                ox6VarB = t6a.b(aVar2, 8675309, new va9(new rfa(u56Var4)));
                qgaVar3 = qgaVar2;
                t72 t72Var10 = t72Var2;
                ag7Var2 = ag7Var;
                xhaVar2 = xhaVar;
                r0 = new oh4() { // from class: sfa
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        xv9 xv9Var2;
                        vf7 vf7Var = (vf7) obj;
                        u56 u56Var7 = u56Var4;
                        if (!u56Var7.b()) {
                            p94.a(p94Var);
                        } else if (!z3 && (xv9Var2 = u56Var7.c) != null) {
                            xv9Var2.b();
                        }
                        if (u56Var7.b() && z2) {
                            if (u56Var7.a() != bt4.u) {
                                sia siaVarD = u56Var7.d();
                                if (siaVarD != null) {
                                    long j6 = vf7Var.a;
                                    nd3 nd3Var2 = u56Var7.d;
                                    g75 g75Var8 = u56Var7.v;
                                    int iA = ag7Var2.a(siaVarD.b(j6, true));
                                    g75Var8.invoke(kha.a(nd3Var2.a, null, ay.c(iA, iA), 5));
                                    if (u56Var7.a.a.u.length() > 0) {
                                        u56Var7.k.setValue(bt4.v);
                                    }
                                }
                            } else {
                                qgaVar3.g(vf7Var);
                            }
                        }
                        return g2b.a;
                    }
                };
                if (z2) {
                    ox6VarB = it1.a(ox6VarB, new ei4() { // from class: vfa
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(-102778667);
                            Object objF116 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (objF116 == c0187a2) {
                                c33 c33Var5 = wd3.a;
                                nm8 nm8Var = new nm8(jt1Var2.x());
                                jt1Var2.C(nm8Var);
                                objF116 = nm8Var;
                            }
                            t72 t72Var11 = (t72) objF116;
                            Object objF20 = jt1Var2.f();
                            if (objF20 == c0187a2) {
                                objF20 = bl7.i(null);
                                jt1Var2.C(objF20);
                            }
                            final h37 h37Var = (h37) objF20;
                            h37 h37VarJ2 = bl7.j(r0, jt1Var2);
                            final h27 h27Var2 = h27Var;
                            boolean zJ1117 = jt1Var2.J(h27Var2);
                            Object objF21 = jt1Var2.f();
                            if (zJ1117 || objF21 == c0187a2) {
                                objF21 = new oh4() { // from class: wfa
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj4) {
                                        return new zfa(h37Var, h27Var2);
                                    }
                                };
                                jt1Var2.C(objF21);
                            }
                            wd3.a(h27Var2, (oh4) objF21, jt1Var2);
                            boolean zJ1118 = jt1Var2.j(t72Var11) | jt1Var2.J(h27Var2) | jt1Var2.J(h37VarJ2);
                            Object objF22 = jt1Var2.f();
                            if (zJ1118 || objF22 == c0187a2) {
                                objF22 = new yfa(t72Var11, h37Var, h27Var2, h37VarJ2);
                                jt1Var2.C(objF22);
                            }
                            ox6 ox6VarB9 = t6a.b(ox6.a.t, h27Var2, (PointerInputEventHandler) objF22);
                            jt1Var2.B();
                            return ox6VarB9;
                        }
                    });
                }
                ox6 ox6VarH16 = ox6VarB.H(new q6a(qgaVar3.A, qgaVar3.z, new tfa(qgaVar3), 4));
                w48.a.getClass();
                ox6 ox6VarC15 = by5.c(ox6VarH16, y48.u);
                final ox6 ox6VarC16 = z63.c(aVar2, new oh4() { // from class: t52
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        d73 d73Var = (d73) obj;
                        u56 u56Var7 = u56Var4;
                        sia siaVarD = u56Var7.d();
                        if (siaVarD != null) {
                            n41 n41VarA = d73Var.Y0().a();
                            long j6 = ((lja) u56Var7.A.getValue()).a;
                            long j7 = ((lja) u56Var7.B.getValue()).a;
                            ria riaVar = siaVarD.a;
                            l07 l07Var = riaVar.b;
                            qia qiaVar = riaVar.a;
                            np npVar = u56Var7.y;
                            long j8 = u56Var7.z;
                            boolean zC2 = lja.c(j6);
                            ag7 ag7Var5 = ag7Var2;
                            if (!zC2) {
                                npVar.f(j8);
                                int iB3 = ag7Var5.b(lja.f(j6));
                                int iB4 = ag7Var5.b(lja.e(j6));
                                if (iB3 != iB4) {
                                    n41VarA.c(riaVar.i(iB3, iB4), npVar);
                                }
                            } else if (lja.c(j7)) {
                                kha khaVar17 = khaVar3;
                                if (!lja.c(khaVar17.b)) {
                                    npVar.f(j8);
                                    long j9 = khaVar17.b;
                                    int iB5 = ag7Var5.b(lja.f(j9));
                                    int iB6 = ag7Var5.b(lja.e(j9));
                                    if (iB5 != iB6) {
                                        n41VarA.c(riaVar.i(iB5, iB6), npVar);
                                    }
                                }
                            } else {
                                long jB = qiaVar.b.b();
                                uh1 uh1Var = new uh1(jB);
                                if (jB == 16) {
                                    uh1Var = null;
                                }
                                long j10 = uh1Var != null ? uh1Var.a : uh1.b;
                                npVar.f(uh1.b(uh1.d(j10) * 0.2f, j10));
                                int iB7 = ag7Var5.b(lja.f(j7));
                                int iB8 = ag7Var5.b(lja.e(j7));
                                if (iB7 != iB8) {
                                    n41VarA.c(riaVar.i(iB7, iB8), npVar);
                                }
                            }
                            boolean z2115 = riaVar.d() && qiaVar.f != 3;
                            if (z2115) {
                                long j11 = riaVar.c;
                                sk8 sk8VarA = tk8.a(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                                n41VarA.f();
                                n41VarA.r(sk8VarA);
                            }
                            ww9 ww9Var = qiaVar.b.a;
                            fda fdaVar = ww9Var.m;
                            mha mhaVar = ww9Var.a;
                            if (fdaVar == null) {
                                fdaVar = fda.b;
                            }
                            fda fdaVar2 = fdaVar;
                            el9 el9Var = ww9Var.n;
                            if (el9Var == null) {
                                el9Var = el9.d;
                            }
                            el9 el9Var2 = el9Var;
                            e73 e73Var = ww9Var.p;
                            if (e73Var == null) {
                                e73Var = zy3.a;
                            }
                            e73 e73Var2 = e73Var;
                            try {
                                fx0 fx0VarE = mhaVar.e();
                                mha.a aVar5 = mha.a.a;
                                if (fx0VarE != null) {
                                    l07.j(l07Var, n41VarA, fx0VarE, mhaVar != aVar5 ? mhaVar.a() : 1.0f, el9Var2, fdaVar2, e73Var2);
                                } else {
                                    l07.i(l07Var, n41VarA, mhaVar != aVar5 ? mhaVar.c() : uh1.b, el9Var2, fdaVar2, e73Var2);
                                }
                            } finally {
                                if (z2115) {
                                    n41VarA.o();
                                }
                            }
                        }
                        return g2b.a;
                    }
                });
                boolean zJ1117 = bj4Var4.j(u56Var4);
                if (i7 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zJ1118 = zJ1117 | z17 | bj4Var4.J(mmbVar) | bj4Var4.j(qgaVar3);
                if (i8 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zJ3 = zJ1118 | z18 | bj4Var4.j(ag7Var2);
                objF7 = bj4Var4.f();
                if (zJ3) {
                    final kha khaVar17 = khaVar3;
                    oh4 oh4Var119 = new oh4() { // from class: c62
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            gia giaVar2;
                            qq5 qq5Var;
                            qq5 qq5Var2;
                            u56 u56Var7 = u56Var4;
                            dt7 dt7Var = u56Var7.o;
                            qq5 qq5Var3 = (qq5) obj;
                            u56Var7.h = qq5Var3;
                            sia siaVarD = u56Var7.d();
                            if (siaVarD != null) {
                                siaVarD.b = qq5Var3;
                            }
                            if (z2) {
                                bt4 bt4VarA = u56Var7.a();
                                bt4 bt4Var = bt4.u;
                                qga qgaVar4 = qgaVar3;
                                kha khaVar18 = khaVar17;
                                if (bt4VarA == bt4Var) {
                                    if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                        qgaVar4.r();
                                    } else {
                                        qgaVar4.o();
                                    }
                                    u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                    dt7Var.setValue(Boolean.valueOf(lja.c(khaVar18.b)));
                                } else if (u56Var7.a() == bt4.v) {
                                    dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                }
                                ag7 ag7Var5 = ag7Var2;
                                m62.f(u56Var7, khaVar18, ag7Var5);
                                sia siaVarD2 = u56Var7.d();
                                if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                    ria riaVar = siaVarD2.a;
                                    zda zdaVar = new zda(qq5Var);
                                    sk8 sk8VarA = fb9.a(qq5Var);
                                    sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                    if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                        giaVar2.b.c(khaVar18, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                    }
                                }
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(oh4Var119);
                    objF7 = oh4Var119;
                } else {
                    final kha khaVar18 = khaVar3;
                    oh4 oh4Var1110 = new oh4() { // from class: c62
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            gia giaVar2;
                            qq5 qq5Var;
                            qq5 qq5Var2;
                            u56 u56Var7 = u56Var4;
                            dt7 dt7Var = u56Var7.o;
                            qq5 qq5Var3 = (qq5) obj;
                            u56Var7.h = qq5Var3;
                            sia siaVarD = u56Var7.d();
                            if (siaVarD != null) {
                                siaVarD.b = qq5Var3;
                            }
                            if (z2) {
                                bt4 bt4VarA = u56Var7.a();
                                bt4 bt4Var = bt4.u;
                                qga qgaVar4 = qgaVar3;
                                kha khaVar19 = khaVar18;
                                if (bt4VarA == bt4Var) {
                                    if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                        qgaVar4.r();
                                    } else {
                                        qgaVar4.o();
                                    }
                                    u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                    u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                    dt7Var.setValue(Boolean.valueOf(lja.c(khaVar19.b)));
                                } else if (u56Var7.a() == bt4.v) {
                                    dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                }
                                ag7 ag7Var5 = ag7Var2;
                                m62.f(u56Var7, khaVar19, ag7Var5);
                                sia siaVarD2 = u56Var7.d();
                                if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                    ria riaVar = siaVarD2.a;
                                    zda zdaVar = new zda(qq5Var);
                                    sk8 sk8VarA = fb9.a(qq5Var);
                                    sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                    if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                        giaVar2.b.c(khaVar19, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                    }
                                }
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(oh4Var1110);
                    objF7 = oh4Var1110;
                }
                final ox6 ox6VarB9 = oh7.b(aVar2, (oh4) objF7);
                u56Var5 = u56Var4;
                p62 p62Var8 = new p62(mvaVar, khaVar, u56Var5, z3, z2, ag7Var2, qgaVar3, s85Var, p94Var);
                if (!z2) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    ox6VarA = it1.a(aVar2, new ei4() { // from class: qda
                        /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
                        @Override // defpackage.ei4
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Object objE;
                            ox6 ox6Var16 = (ox6) obj;
                            jt1 jt1Var2 = (jt1) obj2;
                            ((Integer) obj3).getClass();
                            jt1Var2.K(-84507373);
                            boolean zBooleanValue2 = ((Boolean) jt1Var2.F(qu1.x)).booleanValue();
                            boolean zC2 = jt1Var2.c(zBooleanValue2);
                            Object objF116 = jt1Var2.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (zC2 || objF116 == c0187a2) {
                                objF116 = new cd2(zBooleanValue2);
                                jt1Var2.C(objF116);
                            }
                            final cd2 cd2Var = (cd2) objF116;
                            final fx0 fx0Var3 = fx0Var;
                            boolean z2115 = ((fx0Var3 instanceof aw9) && ((aw9) fx0Var3).a == 16) ? false : true;
                            if (((mmb) jt1Var2.F(qu1.u)).a()) {
                                final u56 u56Var7 = u56Var5;
                                if (u56Var7.b()) {
                                    final kha khaVar19 = khaVar;
                                    if (lja.c(khaVar19.b) && z2115) {
                                        jt1Var2.K(-707487962);
                                        iw iwVar5 = khaVar19.a;
                                        lja ljaVar3 = new lja(khaVar19.b);
                                        boolean zJ1119 = jt1Var2.j(cd2Var);
                                        Object objF20 = jt1Var2.f();
                                        if (zJ1119 || objF20 == c0187a2) {
                                            objF20 = new sda(cd2Var, null);
                                            jt1Var2.C(objF20);
                                        }
                                        wd3.f(iwVar5, ljaVar3, (ci4) objF20, jt1Var2);
                                        boolean zJ11110 = jt1Var2.j(cd2Var);
                                        final ag7 ag7Var5 = ag7Var2;
                                        boolean zJ11111 = jt1Var2.j(ag7Var5) | zJ11110 | jt1Var2.J(khaVar19) | jt1Var2.j(u56Var7) | jt1Var2.J(fx0Var3);
                                        Object objF21 = jt1Var2.f();
                                        if (zJ11111 || objF21 == c0187a2) {
                                            oh4 oh4Var1111 = new oh4() { // from class: rda
                                                @Override // defpackage.oh4
                                                public final Object invoke(Object obj4) {
                                                    cz1 cz1Var = (cz1) obj4;
                                                    cz1Var.K1();
                                                    float fH = cd2Var.c.h();
                                                    if (fH != 0.0f) {
                                                        long j6 = khaVar19.b;
                                                        int i112 = lja.c;
                                                        int iB3 = ag7Var5.b((int) (j6 >> 32));
                                                        sia siaVarD = u56Var7.d();
                                                        sk8 sk8VarC = siaVarD != null ? siaVarD.a.c(iB3) : new sk8(0.0f, 0.0f, 0.0f, 0.0f);
                                                        float fFloor = (float) Math.floor(cz1Var.U0(2.0f));
                                                        float f = fFloor < 1.0f ? 1.0f : fFloor;
                                                        float f2 = f / 2.0f;
                                                        float f3 = sk8VarC.a + f2;
                                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() >> 32)) - f2;
                                                        if (f3 > fIntBitsToFloat) {
                                                            f3 = fIntBitsToFloat;
                                                        }
                                                        if (f3 >= f2) {
                                                            f2 = f3;
                                                        }
                                                        float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                                                        cz1Var.T0(fx0Var3, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.d)) & 4294967295L), f, fH);
                                                    }
                                                    return g2b.a;
                                                }
                                            };
                                            jt1Var2.C(oh4Var1111);
                                            objF21 = oh4Var1111;
                                        }
                                        objE = z63.e(ox6Var16, (oh4) objF21);
                                        jt1Var2.B();
                                    } else {
                                        jt1Var2.K(-705473241);
                                        jt1Var2.B();
                                        objE = ox6.a.t;
                                    }
                                } else {
                                    jt1Var2.K(-705473241);
                                    jt1Var2.B();
                                    objE = ox6.a.t;
                                }
                            } else {
                                jt1Var2.K(-705473241);
                                jt1Var2.B();
                                objE = ox6.a.t;
                            }
                            jt1Var2.B();
                            return objE;
                        }
                    });
                } else {
                    ox6VarA = aVar2;
                }
                zJ4 = bj4Var4.j(qgaVar3);
                objF8 = bj4Var4.f();
                if (zJ4) {
                    objF8 = new oh4() { // from class: d62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return new k62(qgaVar3);
                        }
                    };
                    bj4Var4.C(objF8);
                } else {
                    objF8 = new oh4() { // from class: d62
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return new k62(qgaVar3);
                        }
                    };
                    bj4Var4.C(objF8);
                }
                wd3.a(qgaVar3, (oh4) objF8, bj4Var4);
                boolean zJ1119 = bj4Var4.j(u56Var5) | bj4Var4.j(xhaVar2);
                if (i8 == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = zJ1119 | z20 | ((i10 <= 32 && bj4Var4.J(s85Var)) || (i12 & 48) == 32);
                objF9 = bj4Var4.f();
                if (z21) {
                    objF9 = new oh4() { // from class: e62
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            u56 u56Var7 = u56Var5;
                            if (u56Var7.b()) {
                                nd3 nd3Var2 = u56Var7.d;
                                g75 g75Var8 = u56Var7.v;
                                s56 s56Var = u56Var7.w;
                                gl8 gl8Var = new gl8();
                                yda ydaVar = new yda(nd3Var2, g75Var8, gl8Var);
                                xha xhaVar4 = xhaVar2;
                                y18 y18Var = xhaVar4.a;
                                y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                ?? giaVar2 = new gia(xhaVar4, y18Var);
                                xhaVar4.b.set((gia) giaVar2);
                                gl8Var.t = giaVar2;
                                u56Var7.e = giaVar2;
                            }
                            return new l62();
                        }
                    };
                    bj4Var4.C(objF9);
                } else {
                    objF9 = new oh4() { // from class: e62
                        /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            u56 u56Var7 = u56Var5;
                            if (u56Var7.b()) {
                                nd3 nd3Var2 = u56Var7.d;
                                g75 g75Var8 = u56Var7.v;
                                s56 s56Var = u56Var7.w;
                                gl8 gl8Var = new gl8();
                                yda ydaVar = new yda(nd3Var2, g75Var8, gl8Var);
                                xha xhaVar4 = xhaVar2;
                                y18 y18Var = xhaVar4.a;
                                y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                                ?? giaVar2 = new gia(xhaVar4, y18Var);
                                xhaVar4.b.set((gia) giaVar2);
                                gl8Var.t = giaVar2;
                                u56Var7.e = giaVar2;
                            }
                            return new l62();
                        }
                    };
                    bj4Var4.C(objF9);
                }
                wd3.a(s85Var, (oh4) objF9, bj4Var4);
                final oh4 g75Var8 = u56Var5.v;
                if (i == 1) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                final int i112 = s85Var.e;
                final z1b z1bVar10 = z1bVar2;
                ox6 ox6VarA17 = it1.a(aVar2, new ei4() { // from class: cfa
                    @Override // defpackage.ei4
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        jt1 jt1Var2 = (jt1) obj2;
                        ((Integer) obj3).getClass();
                        jt1Var2.K(851809892);
                        Object objF116 = jt1Var2.f();
                        jt1.a.C0187a c0187a2 = jt1.a.a;
                        if (objF116 == c0187a2) {
                            objF116 = new kja();
                            jt1Var2.C(objF116);
                        }
                        kja kjaVar = (kja) objF116;
                        Object objF20 = jt1Var2.f();
                        if (objF20 == c0187a2) {
                            objF20 = new vm2();
                            jt1Var2.C(objF20);
                        }
                        bfa bfaVar = new bfa(u56Var5, qgaVar3, khaVar, z2112, z22, kjaVar, ag7Var2, z1bVar10, (vm2) objF20, g75Var8, i112);
                        boolean zJ11110 = jt1Var2.j(bfaVar);
                        Object objF21 = jt1Var2.f();
                        if (zJ11110 || objF21 == c0187a2) {
                            dfa dfaVar = new dfa(1, bfaVar, bfa.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                            jt1Var2.C(dfaVar);
                            objF21 = dfaVar;
                        }
                        qo5 qo5Var = new qo5((oh4) ((yn5) objF21), null);
                        jt1Var2.B();
                        return qo5Var;
                    }
                });
                i11 = s85Var.d;
                if (i11 == 7) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                zBooleanValue = ((Boolean) h37VarJ.getValue()).booleanValue();
                zC = bj4Var4.c(z23) | bj4Var4.j(n56Var);
                objF10 = bj4Var4.f();
                if (zC) {
                    objF10 = new mh4() { // from class: f62
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            if (z23) {
                                n56Var.i();
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(objF10);
                } else {
                    objF10 = new mh4() { // from class: f62
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            if (z23) {
                                n56Var.i();
                            }
                            return g2b.a;
                        }
                    };
                    bj4Var4.C(objF10);
                }
                mh4 mh4Var8 = (mh4) objF10;
                if (zBooleanValue) {
                    ox6VarH = aVar2;
                } else {
                    ox6VarH = aVar2;
                }
                fx0Var2 = (fx0) bj4Var4.F(lf0.a);
                j2 = ((uh1) bj4Var4.F(lf0.b)).a;
                if (uh1.c(j2, u7d.c(1308617531))) {
                    aw9Var = new aw9(j2);
                } else {
                    aw9Var = fx0Var2;
                }
                zJ5 = bj4Var4.j(u56Var5) | bj4Var4.J(aw9Var);
                objF11 = bj4Var4.f();
                if (zJ5) {
                    z24 = false;
                    objF11 = new r52(0, u56Var5, aw9Var);
                    bj4Var4.C(objF11);
                } else {
                    z24 = false;
                    objF11 = new r52(0, u56Var5, aw9Var);
                    bj4Var4.C(objF11);
                }
                ox6 ox6VarH17 = oh7.b(it1.a(ro5.a(ro5.a(ox6Var.H(z63.e(aVar2, (oh4) objF11)).H(new f56(n56Var, u56Var5, qgaVar3)).H(ox6VarH).H(ox6VarA16), new cea(d94Var, u56Var5)), new o62(u56Var5, qgaVar3)).H(ox6VarA17), new ei4() { // from class: bga
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ei4
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        gga ggaVar2 = ggaVar;
                        dt7 dt7Var = ggaVar2.f;
                        jt1 jt1Var2 = (jt1) obj2;
                        ((Integer) obj3).getClass();
                        jt1Var2.K(-2137546592);
                        boolean z2115 = ((fl7) dt7Var.getValue()) == fl7.t || !(jt1Var2.F(qu1.n) == tq5.u);
                        boolean zJ11110 = jt1Var2.J(ggaVar2);
                        Object objF116 = jt1Var2.f();
                        jt1.a.C0187a c0187a2 = jt1.a.a;
                        if (zJ11110 || objF116 == c0187a2) {
                            objF116 = new a26(1, ggaVar2);
                            jt1Var2.C(objF116);
                        }
                        h37 h37VarJ2 = bl7.j((oh4) objF116, jt1Var2);
                        Object objF20 = jt1Var2.f();
                        if (objF20 == c0187a2) {
                            ht2 ht2Var = new ht2(new r58(1, h37VarJ2));
                            jt1Var2.C(ht2Var);
                            objF20 = ht2Var;
                        }
                        s79 s79Var = (s79) objF20;
                        boolean zJ11111 = jt1Var2.J(s79Var) | jt1Var2.J(ggaVar2);
                        Object objF21 = jt1Var2.f();
                        if (zJ11111 || objF21 == c0187a2) {
                            objF21 = new cga(s79Var, ggaVar2);
                            jt1Var2.C(objF21);
                        }
                        ox6 ox6VarB10 = d79.b((cga) objF21, (fl7) dt7Var.getValue(), z2 && ggaVar2.b.h() != 0.0f, z2115, h27Var);
                        jt1Var2.B();
                        return ox6VarB10;
                    }
                }).H(ox6VarC15).H(p62Var8), new j11(1, u56Var5)).H(new mb(new d11(1, qgaVar3, t72Var10)));
                if (z2) {
                    z24 = true;
                }
                if (z24) {
                    ox6VarA2 = aVar2;
                } else {
                    ox6VarA2 = aVar2;
                }
                final boolean z2115 = z24;
                bj4 bj4Var12 = bj4Var4;
                final fw0 fw0Var10 = fw0Var2;
                final ox6 ox6Var16 = ox6VarA2;
                final tx2 tx2Var11 = tx2Var2;
                final ox6 ox6Var17 = ox6VarA;
                ci4 ci4Var8 = new ci4() { // from class: z52
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        jt1 jt1Var2 = (jt1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final u56 u56Var7 = u56Var5;
                            final wja wjaVar3 = wjaVar;
                            final int i113 = i2;
                            final int i114 = i;
                            final gga ggaVar2 = ggaVar;
                            final kha khaVar19 = khaVar;
                            final ojb ojbVar2 = ojbVar;
                            final ox6 ox6Var18 = ox6Var17;
                            final ox6 ox6Var19 = ox6VarC16;
                            final ox6 ox6Var110 = ox6VarB9;
                            final ox6 ox6Var111 = ox6Var16;
                            final fw0 fw0Var11 = fw0Var10;
                            final qga qgaVar4 = qgaVar3;
                            final boolean z30 = z2115;
                            final boolean z31 = z3;
                            final oh4 oh4Var1111 = oh4Var2;
                            final ag7 ag7Var5 = ag7Var2;
                            final tx2 tx2Var12 = tx2Var11;
                            ei4Var.invoke(gr1.b(-44346382, new ci4() { // from class: u52
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj3, Object obj4) {
                                    ox6 kebVar;
                                    jt1 jt1Var3 = (jt1) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (jt1Var3.A(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        final u56 u56Var8 = u56Var7;
                                        ox6 ox6VarE = ir9.e(ox6.a.t, ((y43) u56Var8.g.getValue()).t, 0.0f, 2);
                                        int i115 = i113;
                                        final int i116 = i114;
                                        cv4.a(i115, i116);
                                        wja wjaVar4 = wjaVar3;
                                        if (i115 != 1 || i116 != Integer.MAX_VALUE) {
                                            ox6VarE = ox6VarE.H(new bv4(wjaVar4, i115, i116));
                                        }
                                        boolean zJ11110 = jt1Var3.j(u56Var8);
                                        Object objF116 = jt1Var3.f();
                                        if (zJ11110 || objF116 == jt1.a.a) {
                                            objF116 = new w01(1, u56Var8);
                                            jt1Var3.C(objF116);
                                        }
                                        mh4 mh4Var9 = (mh4) objF116;
                                        gga ggaVar3 = ggaVar2;
                                        fl7 fl7Var3 = (fl7) ggaVar3.f.getValue();
                                        final kha khaVar110 = khaVar19;
                                        long j6 = khaVar110.b;
                                        int i20 = lja.c;
                                        int iF = (int) (j6 >> 32);
                                        long j7 = ggaVar3.e;
                                        if (iF == ((int) (j7 >> 32)) && (iF = (int) (j6 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                                            iF = lja.f(j6);
                                        }
                                        ggaVar3.e = khaVar110.b;
                                        mva mvaVarA2 = n7b.a(ojbVar2, khaVar110.a);
                                        int iOrdinal = fl7Var3.ordinal();
                                        if (iOrdinal == 0) {
                                            kebVar = new keb(ggaVar3, iF, mvaVarA2, mh4Var9);
                                        } else {
                                            if (iOrdinal != 1) {
                                                u.b();
                                                return null;
                                            }
                                            kebVar = new l15(ggaVar3, iF, mvaVarA2, mh4Var9);
                                        }
                                        ox6 ox6VarA18 = kw0.a(uma.b(ox6VarE).H(kebVar).H(ox6Var18).H(ox6Var19).H(new gha(wjaVar4)).H(ox6Var110).H(ox6Var111), fw0Var11);
                                        final qga qgaVar5 = qgaVar4;
                                        final boolean z32 = z30;
                                        final boolean z33 = z31;
                                        final oh4 oh4Var1112 = oh4Var1111;
                                        final ag7 ag7Var6 = ag7Var5;
                                        final tx2 tx2Var13 = tx2Var12;
                                        lp9.a(ox6VarA18, gr1.b(1412697320, new ci4() { // from class: v52
                                            /* JADX WARN: Code duplicated, block: B:22:0x0099  */
                                            @Override // defpackage.ci4
                                            public final Object invoke(Object obj5, Object obj6) {
                                                boolean z34;
                                                jt1 jt1Var4 = (jt1) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                if (jt1Var4.A(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    u56 u56Var9 = u56Var8;
                                                    i62 i62Var = new i62(u56Var9, oh4Var1112, khaVar110, ag7Var6, tx2Var13, i116);
                                                    int iHashCode = Long.hashCode(jt1Var4.v());
                                                    kw7 kw7VarY = jt1Var4.y();
                                                    ox6 ox6VarC17 = it1.c(jt1Var4, ox6.a.t);
                                                    bt1.c.getClass();
                                                    qr5.a aVar5 = bt1.a.b;
                                                    if (jt1Var4.s() == null) {
                                                        ml5.c();
                                                        throw null;
                                                    }
                                                    jt1Var4.q();
                                                    if (jt1Var4.l()) {
                                                        jt1Var4.k(aVar5);
                                                    } else {
                                                        jt1Var4.z();
                                                    }
                                                    rd7.d(jt1Var4, bt1.a.f, i62Var);
                                                    rd7.d(jt1Var4, bt1.a.e, kw7VarY);
                                                    rd7.d(jt1Var4, bt1.a.g, Integer.valueOf(iHashCode));
                                                    rd7.c(jt1Var4, bt1.a.h);
                                                    rd7.d(jt1Var4, bt1.a.d, ox6VarC17);
                                                    jt1Var4.I();
                                                    bt4 bt4VarA = u56Var9.a();
                                                    bt4 bt4Var = bt4.t;
                                                    boolean z35 = z32;
                                                    if (bt4VarA != bt4Var && u56Var9.c() != null) {
                                                        qq5 qq5VarC = u56Var9.c();
                                                        qq5VarC.getClass();
                                                        z34 = qq5VarC.e() && z35;
                                                    }
                                                    qga qgaVar6 = qgaVar5;
                                                    m62.c(qgaVar6, z34, jt1Var4, 0);
                                                    if (u56Var9.a() == bt4.v && !z33 && z35) {
                                                        jt1Var4.K(-714666198);
                                                        m62.d(qgaVar6, jt1Var4, 0);
                                                        jt1Var4.B();
                                                    } else {
                                                        jt1Var4.K(-714589318);
                                                        jt1Var4.B();
                                                    }
                                                } else {
                                                    jt1Var4.u();
                                                }
                                                return g2b.a;
                                            }
                                        }, jt1Var3), jt1Var3, 48);
                                    } else {
                                        jt1Var3.u();
                                    }
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 6);
                        } else {
                            jt1Var2.u();
                        }
                        return g2b.a;
                    }
                };
                bj4Var = bj4Var12;
                b(ox6VarH17, qgaVar3, gr1.b(-814563849, ci4Var8, bj4Var), bj4Var, 384);
            } else {
                s85Var2 = s85Var;
            }
            z11 = z10;
            i10 = i9;
            if ((i12 & 48) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            zJ2 = z11 | z12 | bj4Var3.j(ag7Var4) | bj4Var3.j(t72Var) | bj4Var3.j(fw0Var) | bj4Var3.j(qgaVar);
            objF6 = bj4Var3.f();
            if (zJ2) {
                bj4Var4 = bj4Var3;
                u56Var2 = u56Var6;
                z1bVar2 = z1bVar;
                s85Var3 = s85Var2;
                oh4 oh4Var1111 = new oh4() { // from class: b62
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        sia siaVarD;
                        v94 v94Var = (v94) obj;
                        u56 u56Var7 = u56Var2;
                        if (u56Var7.b() == v94Var.e()) {
                            return g2b.a;
                        }
                        u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                        boolean zB = u56Var7.b();
                        kha khaVar19 = khaVar;
                        ag7 ag7Var5 = ag7Var4;
                        if (zB && z2 && !z3) {
                            m62.g(xhaVar, u56Var7, khaVar19, s85Var3, ag7Var5);
                        } else {
                            m62.e(u56Var7);
                        }
                        if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                            oy0.d(t72Var, null, null, new j62(fw0Var, khaVar19, u56Var7, siaVarD, ag7Var5, null), 3);
                        }
                        if (!v94Var.e()) {
                            qgaVar.g(null);
                        }
                        return g2b.a;
                    }
                };
                xhaVar = xhaVar;
                ag7Var = ag7Var4;
                qgaVar2 = qgaVar;
                fw0Var2 = fw0Var;
                z13 = z2;
                khaVar3 = khaVar;
                t72Var2 = t72Var;
                bj4Var4.C(oh4Var1111);
                objF6 = oh4Var1111;
            } else {
                bj4Var4 = bj4Var3;
                u56Var2 = u56Var6;
                z1bVar2 = z1bVar;
                s85Var3 = s85Var2;
                oh4 oh4Var1112 = new oh4() { // from class: b62
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        sia siaVarD;
                        v94 v94Var = (v94) obj;
                        u56 u56Var7 = u56Var2;
                        if (u56Var7.b() == v94Var.e()) {
                            return g2b.a;
                        }
                        u56Var7.f.setValue(Boolean.valueOf(v94Var.e()));
                        boolean zB = u56Var7.b();
                        kha khaVar19 = khaVar;
                        ag7 ag7Var5 = ag7Var4;
                        if (zB && z2 && !z3) {
                            m62.g(xhaVar, u56Var7, khaVar19, s85Var3, ag7Var5);
                        } else {
                            m62.e(u56Var7);
                        }
                        if (v94Var.e() && (siaVarD = u56Var7.d()) != null) {
                            oy0.d(t72Var, null, null, new j62(fw0Var, khaVar19, u56Var7, siaVarD, ag7Var5, null), 3);
                        }
                        if (!v94Var.e()) {
                            qgaVar.g(null);
                        }
                        return g2b.a;
                    }
                };
                xhaVar = xhaVar;
                ag7Var = ag7Var4;
                qgaVar2 = qgaVar;
                fw0Var2 = fw0Var;
                z13 = z2;
                khaVar3 = khaVar;
                t72Var2 = t72Var;
                bj4Var4.C(oh4Var1112);
                objF6 = oh4Var1112;
            }
            aVar2 = ox6.a.t;
            ox6 ox6VarA18 = ia4.a(j84.c(ym2.b(aVar2, p94Var), (oh4) objF6), z13, h27Var);
            if (z13) {
                z14 = false;
            } else {
                z14 = false;
            }
            h37VarJ = bl7.j(Boolean.valueOf(z14), bj4Var4);
            g2b g2bVar8 = g2b.a;
            boolean zJ11110 = bj4Var4.J(h37VarJ) | bj4Var4.j(u56Var2) | bj4Var4.j(xhaVar) | bj4Var4.j(qgaVar2);
            if (i10 > 32) {
                u56Var3 = u56Var2;
                if ((r4 & 48) != 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } else {
                u56Var3 = u56Var2;
                if ((r4 & 48) != 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            z16 = zJ11110 | z15;
            Object objF116 = bj4Var4.f();
            if (z16) {
                u56Var4 = u56Var3;
                g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                bj4Var4.C(g62Var);
            } else {
                u56Var4 = u56Var3;
                g62Var = new g62(u56Var4, h37VarJ, xhaVar, qgaVar2, s85Var, null);
                bj4Var4.C(g62Var);
            }
            wd3.d(bj4Var4, (ci4) g62Var, g2bVar8);
            ox6VarB = t6a.b(aVar2, 8675309, new va9(new rfa(u56Var4)));
            qgaVar3 = qgaVar2;
            t72 t72Var11 = t72Var2;
            ag7Var2 = ag7Var;
            xhaVar2 = xhaVar;
            r0 = new oh4() { // from class: sfa
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    xv9 xv9Var2;
                    vf7 vf7Var = (vf7) obj;
                    u56 u56Var7 = u56Var4;
                    if (!u56Var7.b()) {
                        p94.a(p94Var);
                    } else if (!z3 && (xv9Var2 = u56Var7.c) != null) {
                        xv9Var2.b();
                    }
                    if (u56Var7.b() && z2) {
                        if (u56Var7.a() != bt4.u) {
                            sia siaVarD = u56Var7.d();
                            if (siaVarD != null) {
                                long j6 = vf7Var.a;
                                nd3 nd3Var2 = u56Var7.d;
                                g75 g75Var9 = u56Var7.v;
                                int iA = ag7Var2.a(siaVarD.b(j6, true));
                                g75Var9.invoke(kha.a(nd3Var2.a, null, ay.c(iA, iA), 5));
                                if (u56Var7.a.a.u.length() > 0) {
                                    u56Var7.k.setValue(bt4.v);
                                }
                            }
                        } else {
                            qgaVar3.g(vf7Var);
                        }
                    }
                    return g2b.a;
                }
            };
            if (z2) {
                ox6VarB = it1.a(ox6VarB, new ei4() { // from class: vfa
                    @Override // defpackage.ei4
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        jt1 jt1Var2 = (jt1) obj2;
                        ((Integer) obj3).getClass();
                        jt1Var2.K(-102778667);
                        Object objF117 = jt1Var2.f();
                        jt1.a.C0187a c0187a2 = jt1.a.a;
                        if (objF117 == c0187a2) {
                            c33 c33Var5 = wd3.a;
                            nm8 nm8Var = new nm8(jt1Var2.x());
                            jt1Var2.C(nm8Var);
                            objF117 = nm8Var;
                        }
                        t72 t72Var12 = (t72) objF117;
                        Object objF20 = jt1Var2.f();
                        if (objF20 == c0187a2) {
                            objF20 = bl7.i(null);
                            jt1Var2.C(objF20);
                        }
                        final h37 h37Var = (h37) objF20;
                        h37 h37VarJ2 = bl7.j(r0, jt1Var2);
                        final h27 h27Var2 = h27Var;
                        boolean zJ11111 = jt1Var2.J(h27Var2);
                        Object objF21 = jt1Var2.f();
                        if (zJ11111 || objF21 == c0187a2) {
                            objF21 = new oh4() { // from class: wfa
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj4) {
                                    return new zfa(h37Var, h27Var2);
                                }
                            };
                            jt1Var2.C(objF21);
                        }
                        wd3.a(h27Var2, (oh4) objF21, jt1Var2);
                        boolean zJ11112 = jt1Var2.j(t72Var12) | jt1Var2.J(h27Var2) | jt1Var2.J(h37VarJ2);
                        Object objF22 = jt1Var2.f();
                        if (zJ11112 || objF22 == c0187a2) {
                            objF22 = new yfa(t72Var12, h37Var, h27Var2, h37VarJ2);
                            jt1Var2.C(objF22);
                        }
                        ox6 ox6VarB10 = t6a.b(ox6.a.t, h27Var2, (PointerInputEventHandler) objF22);
                        jt1Var2.B();
                        return ox6VarB10;
                    }
                });
            }
            ox6 ox6VarH18 = ox6VarB.H(new q6a(qgaVar3.A, qgaVar3.z, new tfa(qgaVar3), 4));
            w48.a.getClass();
            ox6 ox6VarC17 = by5.c(ox6VarH18, y48.u);
            final ox6 ox6VarC18 = z63.c(aVar2, new oh4() { // from class: t52
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    d73 d73Var = (d73) obj;
                    u56 u56Var7 = u56Var4;
                    sia siaVarD = u56Var7.d();
                    if (siaVarD != null) {
                        n41 n41VarA = d73Var.Y0().a();
                        long j6 = ((lja) u56Var7.A.getValue()).a;
                        long j7 = ((lja) u56Var7.B.getValue()).a;
                        ria riaVar = siaVarD.a;
                        l07 l07Var = riaVar.b;
                        qia qiaVar = riaVar.a;
                        np npVar = u56Var7.y;
                        long j8 = u56Var7.z;
                        boolean zC2 = lja.c(j6);
                        ag7 ag7Var5 = ag7Var2;
                        if (!zC2) {
                            npVar.f(j8);
                            int iB3 = ag7Var5.b(lja.f(j6));
                            int iB4 = ag7Var5.b(lja.e(j6));
                            if (iB3 != iB4) {
                                n41VarA.c(riaVar.i(iB3, iB4), npVar);
                            }
                        } else if (lja.c(j7)) {
                            kha khaVar19 = khaVar3;
                            if (!lja.c(khaVar19.b)) {
                                npVar.f(j8);
                                long j9 = khaVar19.b;
                                int iB5 = ag7Var5.b(lja.f(j9));
                                int iB6 = ag7Var5.b(lja.e(j9));
                                if (iB5 != iB6) {
                                    n41VarA.c(riaVar.i(iB5, iB6), npVar);
                                }
                            }
                        } else {
                            long jB = qiaVar.b.b();
                            uh1 uh1Var = new uh1(jB);
                            if (jB == 16) {
                                uh1Var = null;
                            }
                            long j10 = uh1Var != null ? uh1Var.a : uh1.b;
                            npVar.f(uh1.b(uh1.d(j10) * 0.2f, j10));
                            int iB7 = ag7Var5.b(lja.f(j7));
                            int iB8 = ag7Var5.b(lja.e(j7));
                            if (iB7 != iB8) {
                                n41VarA.c(riaVar.i(iB7, iB8), npVar);
                            }
                        }
                        boolean z2116 = riaVar.d() && qiaVar.f != 3;
                        if (z2116) {
                            long j11 = riaVar.c;
                            sk8 sk8VarA = tk8.a(0L, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32));
                            n41VarA.f();
                            n41VarA.r(sk8VarA);
                        }
                        ww9 ww9Var = qiaVar.b.a;
                        fda fdaVar = ww9Var.m;
                        mha mhaVar = ww9Var.a;
                        if (fdaVar == null) {
                            fdaVar = fda.b;
                        }
                        fda fdaVar2 = fdaVar;
                        el9 el9Var = ww9Var.n;
                        if (el9Var == null) {
                            el9Var = el9.d;
                        }
                        el9 el9Var2 = el9Var;
                        e73 e73Var = ww9Var.p;
                        if (e73Var == null) {
                            e73Var = zy3.a;
                        }
                        e73 e73Var2 = e73Var;
                        try {
                            fx0 fx0VarE = mhaVar.e();
                            mha.a aVar5 = mha.a.a;
                            if (fx0VarE != null) {
                                l07.j(l07Var, n41VarA, fx0VarE, mhaVar != aVar5 ? mhaVar.a() : 1.0f, el9Var2, fdaVar2, e73Var2);
                            } else {
                                l07.i(l07Var, n41VarA, mhaVar != aVar5 ? mhaVar.c() : uh1.b, el9Var2, fdaVar2, e73Var2);
                            }
                        } finally {
                            if (z2116) {
                                n41VarA.o();
                            }
                        }
                    }
                    return g2b.a;
                }
            });
            boolean zJ11111 = bj4Var4.j(u56Var4);
            if (i7 == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zJ11112 = zJ11111 | z17 | bj4Var4.J(mmbVar) | bj4Var4.j(qgaVar3);
            if (i8 == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            zJ3 = zJ11112 | z18 | bj4Var4.j(ag7Var2);
            objF7 = bj4Var4.f();
            if (zJ3) {
                final kha khaVar19 = khaVar3;
                oh4 oh4Var1113 = new oh4() { // from class: c62
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        gia giaVar2;
                        qq5 qq5Var;
                        qq5 qq5Var2;
                        u56 u56Var7 = u56Var4;
                        dt7 dt7Var = u56Var7.o;
                        qq5 qq5Var3 = (qq5) obj;
                        u56Var7.h = qq5Var3;
                        sia siaVarD = u56Var7.d();
                        if (siaVarD != null) {
                            siaVarD.b = qq5Var3;
                        }
                        if (z2) {
                            bt4 bt4VarA = u56Var7.a();
                            bt4 bt4Var = bt4.u;
                            qga qgaVar4 = qgaVar3;
                            kha khaVar110 = khaVar19;
                            if (bt4VarA == bt4Var) {
                                if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                    qgaVar4.r();
                                } else {
                                    qgaVar4.o();
                                }
                                u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                dt7Var.setValue(Boolean.valueOf(lja.c(khaVar110.b)));
                            } else if (u56Var7.a() == bt4.v) {
                                dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                            }
                            ag7 ag7Var5 = ag7Var2;
                            m62.f(u56Var7, khaVar110, ag7Var5);
                            sia siaVarD2 = u56Var7.d();
                            if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                ria riaVar = siaVarD2.a;
                                zda zdaVar = new zda(qq5Var);
                                sk8 sk8VarA = fb9.a(qq5Var);
                                sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                    giaVar2.b.c(khaVar110, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                }
                            }
                        }
                        return g2b.a;
                    }
                };
                bj4Var4.C(oh4Var1113);
                objF7 = oh4Var1113;
            } else {
                final kha khaVar110 = khaVar3;
                oh4 oh4Var1114 = new oh4() { // from class: c62
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        gia giaVar2;
                        qq5 qq5Var;
                        qq5 qq5Var2;
                        u56 u56Var7 = u56Var4;
                        dt7 dt7Var = u56Var7.o;
                        qq5 qq5Var3 = (qq5) obj;
                        u56Var7.h = qq5Var3;
                        sia siaVarD = u56Var7.d();
                        if (siaVarD != null) {
                            siaVarD.b = qq5Var3;
                        }
                        if (z2) {
                            bt4 bt4VarA = u56Var7.a();
                            bt4 bt4Var = bt4.u;
                            qga qgaVar4 = qgaVar3;
                            kha khaVar111 = khaVar110;
                            if (bt4VarA == bt4Var) {
                                if (((Boolean) u56Var7.l.getValue()).booleanValue() && mmbVar.a()) {
                                    qgaVar4.r();
                                } else {
                                    qgaVar4.o();
                                }
                                u56Var7.m.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                                u56Var7.n.setValue(Boolean.valueOf(eha.a(qgaVar4, false)));
                                dt7Var.setValue(Boolean.valueOf(lja.c(khaVar111.b)));
                            } else if (u56Var7.a() == bt4.v) {
                                dt7Var.setValue(Boolean.valueOf(eha.a(qgaVar4, true)));
                            }
                            ag7 ag7Var5 = ag7Var2;
                            m62.f(u56Var7, khaVar111, ag7Var5);
                            sia siaVarD2 = u56Var7.d();
                            if (siaVarD2 != null && (giaVar2 = u56Var7.e) != null && u56Var7.b() && (qq5Var = siaVarD2.b) != null && qq5Var.e() && (qq5Var2 = siaVarD2.c) != null) {
                                ria riaVar = siaVarD2.a;
                                zda zdaVar = new zda(qq5Var);
                                sk8 sk8VarA = fb9.a(qq5Var);
                                sk8 sk8VarZ = qq5Var.Z(qq5Var2, false);
                                if (xj5.a(giaVar2.a.b.get(), giaVar2)) {
                                    giaVar2.b.c(khaVar111, ag7Var5, riaVar, zdaVar, sk8VarA, sk8VarZ);
                                }
                            }
                        }
                        return g2b.a;
                    }
                };
                bj4Var4.C(oh4Var1114);
                objF7 = oh4Var1114;
            }
            final ox6 ox6VarB10 = oh7.b(aVar2, (oh4) objF7);
            u56Var5 = u56Var4;
            p62 p62Var9 = new p62(mvaVar, khaVar, u56Var5, z3, z2, ag7Var2, qgaVar3, s85Var, p94Var);
            if (!z2) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (z19) {
                ox6VarA = it1.a(aVar2, new ei4() { // from class: qda
                    /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
                    @Override // defpackage.ei4
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Object objE;
                        ox6 ox6Var18 = (ox6) obj;
                        jt1 jt1Var2 = (jt1) obj2;
                        ((Integer) obj3).getClass();
                        jt1Var2.K(-84507373);
                        boolean zBooleanValue2 = ((Boolean) jt1Var2.F(qu1.x)).booleanValue();
                        boolean zC2 = jt1Var2.c(zBooleanValue2);
                        Object objF117 = jt1Var2.f();
                        jt1.a.C0187a c0187a2 = jt1.a.a;
                        if (zC2 || objF117 == c0187a2) {
                            objF117 = new cd2(zBooleanValue2);
                            jt1Var2.C(objF117);
                        }
                        final cd2 cd2Var = (cd2) objF117;
                        final fx0 fx0Var3 = fx0Var;
                        boolean z2116 = ((fx0Var3 instanceof aw9) && ((aw9) fx0Var3).a == 16) ? false : true;
                        if (((mmb) jt1Var2.F(qu1.u)).a()) {
                            final u56 u56Var7 = u56Var5;
                            if (u56Var7.b()) {
                                final kha khaVar111 = khaVar;
                                if (lja.c(khaVar111.b) && z2116) {
                                    jt1Var2.K(-707487962);
                                    iw iwVar5 = khaVar111.a;
                                    lja ljaVar3 = new lja(khaVar111.b);
                                    boolean zJ11113 = jt1Var2.j(cd2Var);
                                    Object objF20 = jt1Var2.f();
                                    if (zJ11113 || objF20 == c0187a2) {
                                        objF20 = new sda(cd2Var, null);
                                        jt1Var2.C(objF20);
                                    }
                                    wd3.f(iwVar5, ljaVar3, (ci4) objF20, jt1Var2);
                                    boolean zJ11114 = jt1Var2.j(cd2Var);
                                    final ag7 ag7Var5 = ag7Var2;
                                    boolean zJ11115 = jt1Var2.j(ag7Var5) | zJ11114 | jt1Var2.J(khaVar111) | jt1Var2.j(u56Var7) | jt1Var2.J(fx0Var3);
                                    Object objF21 = jt1Var2.f();
                                    if (zJ11115 || objF21 == c0187a2) {
                                        oh4 oh4Var1115 = new oh4() { // from class: rda
                                            @Override // defpackage.oh4
                                            public final Object invoke(Object obj4) {
                                                cz1 cz1Var = (cz1) obj4;
                                                cz1Var.K1();
                                                float fH = cd2Var.c.h();
                                                if (fH != 0.0f) {
                                                    long j6 = khaVar111.b;
                                                    int i113 = lja.c;
                                                    int iB3 = ag7Var5.b((int) (j6 >> 32));
                                                    sia siaVarD = u56Var7.d();
                                                    sk8 sk8VarC = siaVarD != null ? siaVarD.a.c(iB3) : new sk8(0.0f, 0.0f, 0.0f, 0.0f);
                                                    float fFloor = (float) Math.floor(cz1Var.U0(2.0f));
                                                    float f = fFloor < 1.0f ? 1.0f : fFloor;
                                                    float f2 = f / 2.0f;
                                                    float f3 = sk8VarC.a + f2;
                                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (cz1Var.c() >> 32)) - f2;
                                                    if (f3 > fIntBitsToFloat) {
                                                        f3 = fIntBitsToFloat;
                                                    }
                                                    if (f3 >= f2) {
                                                        f2 = f3;
                                                    }
                                                    float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                                                    cz1Var.T0(fx0Var3, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.d)) & 4294967295L), f, fH);
                                                }
                                                return g2b.a;
                                            }
                                        };
                                        jt1Var2.C(oh4Var1115);
                                        objF21 = oh4Var1115;
                                    }
                                    objE = z63.e(ox6Var18, (oh4) objF21);
                                    jt1Var2.B();
                                } else {
                                    jt1Var2.K(-705473241);
                                    jt1Var2.B();
                                    objE = ox6.a.t;
                                }
                            } else {
                                jt1Var2.K(-705473241);
                                jt1Var2.B();
                                objE = ox6.a.t;
                            }
                        } else {
                            jt1Var2.K(-705473241);
                            jt1Var2.B();
                            objE = ox6.a.t;
                        }
                        jt1Var2.B();
                        return objE;
                    }
                });
            } else {
                ox6VarA = aVar2;
            }
            zJ4 = bj4Var4.j(qgaVar3);
            objF8 = bj4Var4.f();
            if (zJ4) {
                objF8 = new oh4() { // from class: d62
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return new k62(qgaVar3);
                    }
                };
                bj4Var4.C(objF8);
            } else {
                objF8 = new oh4() { // from class: d62
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return new k62(qgaVar3);
                    }
                };
                bj4Var4.C(objF8);
            }
            wd3.a(qgaVar3, (oh4) objF8, bj4Var4);
            boolean zJ11113 = bj4Var4.j(u56Var5) | bj4Var4.j(xhaVar2);
            if (i8 == 4) {
                z20 = true;
            } else {
                z20 = false;
            }
            z21 = zJ11113 | z20 | ((i10 <= 32 && bj4Var4.J(s85Var)) || (i12 & 48) == 32);
            objF9 = bj4Var4.f();
            if (z21) {
                objF9 = new oh4() { // from class: e62
                    /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        u56 u56Var7 = u56Var5;
                        if (u56Var7.b()) {
                            nd3 nd3Var2 = u56Var7.d;
                            g75 g75Var9 = u56Var7.v;
                            s56 s56Var = u56Var7.w;
                            gl8 gl8Var = new gl8();
                            yda ydaVar = new yda(nd3Var2, g75Var9, gl8Var);
                            xha xhaVar4 = xhaVar2;
                            y18 y18Var = xhaVar4.a;
                            y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                            ?? giaVar2 = new gia(xhaVar4, y18Var);
                            xhaVar4.b.set((gia) giaVar2);
                            gl8Var.t = giaVar2;
                            u56Var7.e = giaVar2;
                        }
                        return new l62();
                    }
                };
                bj4Var4.C(objF9);
            } else {
                objF9 = new oh4() { // from class: e62
                    /* JADX WARN: Type inference failed for: r6v3, types: [T, gia, java.lang.Object] */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        u56 u56Var7 = u56Var5;
                        if (u56Var7.b()) {
                            nd3 nd3Var2 = u56Var7.d;
                            g75 g75Var9 = u56Var7.v;
                            s56 s56Var = u56Var7.w;
                            gl8 gl8Var = new gl8();
                            yda ydaVar = new yda(nd3Var2, g75Var9, gl8Var);
                            xha xhaVar4 = xhaVar2;
                            y18 y18Var = xhaVar4.a;
                            y18Var.e(khaVar, s85Var, ydaVar, s56Var);
                            ?? giaVar2 = new gia(xhaVar4, y18Var);
                            xhaVar4.b.set((gia) giaVar2);
                            gl8Var.t = giaVar2;
                            u56Var7.e = giaVar2;
                        }
                        return new l62();
                    }
                };
                bj4Var4.C(objF9);
            }
            wd3.a(s85Var, (oh4) objF9, bj4Var4);
            final oh4 g75Var9 = u56Var5.v;
            if (i == 1) {
                z22 = true;
            } else {
                z22 = false;
            }
            final int i113 = s85Var.e;
            final z1b z1bVar11 = z1bVar2;
            ox6 ox6VarA19 = it1.a(aVar2, new ei4() { // from class: cfa
                @Override // defpackage.ei4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    jt1 jt1Var2 = (jt1) obj2;
                    ((Integer) obj3).getClass();
                    jt1Var2.K(851809892);
                    Object objF117 = jt1Var2.f();
                    jt1.a.C0187a c0187a2 = jt1.a.a;
                    if (objF117 == c0187a2) {
                        objF117 = new kja();
                        jt1Var2.C(objF117);
                    }
                    kja kjaVar = (kja) objF117;
                    Object objF20 = jt1Var2.f();
                    if (objF20 == c0187a2) {
                        objF20 = new vm2();
                        jt1Var2.C(objF20);
                    }
                    bfa bfaVar = new bfa(u56Var5, qgaVar3, khaVar, z2112, z22, kjaVar, ag7Var2, z1bVar11, (vm2) objF20, g75Var9, i113);
                    boolean zJ11114 = jt1Var2.j(bfaVar);
                    Object objF21 = jt1Var2.f();
                    if (zJ11114 || objF21 == c0187a2) {
                        dfa dfaVar = new dfa(1, bfaVar, bfa.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                        jt1Var2.C(dfaVar);
                        objF21 = dfaVar;
                    }
                    qo5 qo5Var = new qo5((oh4) ((yn5) objF21), null);
                    jt1Var2.B();
                    return qo5Var;
                }
            });
            i11 = s85Var.d;
            if (i11 == 7) {
                z23 = false;
            } else {
                z23 = true;
            }
            zBooleanValue = ((Boolean) h37VarJ.getValue()).booleanValue();
            zC = bj4Var4.c(z23) | bj4Var4.j(n56Var);
            objF10 = bj4Var4.f();
            if (zC) {
                objF10 = new mh4() { // from class: f62
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        if (z23) {
                            n56Var.i();
                        }
                        return g2b.a;
                    }
                };
                bj4Var4.C(objF10);
            } else {
                objF10 = new mh4() { // from class: f62
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        if (z23) {
                            n56Var.i();
                        }
                        return g2b.a;
                    }
                };
                bj4Var4.C(objF10);
            }
            mh4 mh4Var9 = (mh4) objF10;
            if (zBooleanValue) {
                ox6VarH = aVar2;
            } else {
                ox6VarH = aVar2;
            }
            fx0Var2 = (fx0) bj4Var4.F(lf0.a);
            j2 = ((uh1) bj4Var4.F(lf0.b)).a;
            if (uh1.c(j2, u7d.c(1308617531))) {
                aw9Var = new aw9(j2);
            } else {
                aw9Var = fx0Var2;
            }
            zJ5 = bj4Var4.j(u56Var5) | bj4Var4.J(aw9Var);
            objF11 = bj4Var4.f();
            if (zJ5) {
                z24 = false;
                objF11 = new r52(0, u56Var5, aw9Var);
                bj4Var4.C(objF11);
            } else {
                z24 = false;
                objF11 = new r52(0, u56Var5, aw9Var);
                bj4Var4.C(objF11);
            }
            ox6 ox6VarH19 = oh7.b(it1.a(ro5.a(ro5.a(ox6Var.H(z63.e(aVar2, (oh4) objF11)).H(new f56(n56Var, u56Var5, qgaVar3)).H(ox6VarH).H(ox6VarA18), new cea(d94Var, u56Var5)), new o62(u56Var5, qgaVar3)).H(ox6VarA19), new ei4() { // from class: bga
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ei4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    gga ggaVar2 = ggaVar;
                    dt7 dt7Var = ggaVar2.f;
                    jt1 jt1Var2 = (jt1) obj2;
                    ((Integer) obj3).getClass();
                    jt1Var2.K(-2137546592);
                    boolean z2116 = ((fl7) dt7Var.getValue()) == fl7.t || !(jt1Var2.F(qu1.n) == tq5.u);
                    boolean zJ11114 = jt1Var2.J(ggaVar2);
                    Object objF117 = jt1Var2.f();
                    jt1.a.C0187a c0187a2 = jt1.a.a;
                    if (zJ11114 || objF117 == c0187a2) {
                        objF117 = new a26(1, ggaVar2);
                        jt1Var2.C(objF117);
                    }
                    h37 h37VarJ2 = bl7.j((oh4) objF117, jt1Var2);
                    Object objF20 = jt1Var2.f();
                    if (objF20 == c0187a2) {
                        ht2 ht2Var = new ht2(new r58(1, h37VarJ2));
                        jt1Var2.C(ht2Var);
                        objF20 = ht2Var;
                    }
                    s79 s79Var = (s79) objF20;
                    boolean zJ11115 = jt1Var2.J(s79Var) | jt1Var2.J(ggaVar2);
                    Object objF21 = jt1Var2.f();
                    if (zJ11115 || objF21 == c0187a2) {
                        objF21 = new cga(s79Var, ggaVar2);
                        jt1Var2.C(objF21);
                    }
                    ox6 ox6VarB11 = d79.b((cga) objF21, (fl7) dt7Var.getValue(), z2 && ggaVar2.b.h() != 0.0f, z2116, h27Var);
                    jt1Var2.B();
                    return ox6VarB11;
                }
            }).H(ox6VarC17).H(p62Var9), new j11(1, u56Var5)).H(new mb(new d11(1, qgaVar3, t72Var11)));
            if (z2) {
                z24 = true;
            }
            if (z24) {
                ox6VarA2 = aVar2;
            } else {
                ox6VarA2 = aVar2;
            }
            final boolean z2116 = z24;
            bj4 bj4Var13 = bj4Var4;
            final fw0 fw0Var11 = fw0Var2;
            final ox6 ox6Var18 = ox6VarA2;
            final tx2 tx2Var12 = tx2Var2;
            final ox6 ox6Var19 = ox6VarA;
            ci4 ci4Var9 = new ci4() { // from class: z52
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    jt1 jt1Var2 = (jt1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final u56 u56Var7 = u56Var5;
                        final wja wjaVar3 = wjaVar;
                        final int i114 = i2;
                        final int i115 = i;
                        final gga ggaVar2 = ggaVar;
                        final kha khaVar111 = khaVar;
                        final ojb ojbVar2 = ojbVar;
                        final ox6 ox6Var110 = ox6Var19;
                        final ox6 ox6Var111 = ox6VarC18;
                        final ox6 ox6Var112 = ox6VarB10;
                        final ox6 ox6Var113 = ox6Var18;
                        final fw0 fw0Var12 = fw0Var11;
                        final qga qgaVar4 = qgaVar3;
                        final boolean z30 = z2116;
                        final boolean z31 = z3;
                        final oh4 oh4Var1115 = oh4Var2;
                        final ag7 ag7Var5 = ag7Var2;
                        final tx2 tx2Var13 = tx2Var12;
                        ei4Var.invoke(gr1.b(-44346382, new ci4() { // from class: u52
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj3, Object obj4) {
                                ox6 kebVar;
                                jt1 jt1Var3 = (jt1) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (jt1Var3.A(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    final u56 u56Var8 = u56Var7;
                                    ox6 ox6VarE = ir9.e(ox6.a.t, ((y43) u56Var8.g.getValue()).t, 0.0f, 2);
                                    int i116 = i114;
                                    final int i117 = i115;
                                    cv4.a(i116, i117);
                                    wja wjaVar4 = wjaVar3;
                                    if (i116 != 1 || i117 != Integer.MAX_VALUE) {
                                        ox6VarE = ox6VarE.H(new bv4(wjaVar4, i116, i117));
                                    }
                                    boolean zJ11114 = jt1Var3.j(u56Var8);
                                    Object objF117 = jt1Var3.f();
                                    if (zJ11114 || objF117 == jt1.a.a) {
                                        objF117 = new w01(1, u56Var8);
                                        jt1Var3.C(objF117);
                                    }
                                    mh4 mh4Var10 = (mh4) objF117;
                                    gga ggaVar3 = ggaVar2;
                                    fl7 fl7Var3 = (fl7) ggaVar3.f.getValue();
                                    final kha khaVar112 = khaVar111;
                                    long j6 = khaVar112.b;
                                    int i20 = lja.c;
                                    int iF = (int) (j6 >> 32);
                                    long j7 = ggaVar3.e;
                                    if (iF == ((int) (j7 >> 32)) && (iF = (int) (j6 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                                        iF = lja.f(j6);
                                    }
                                    ggaVar3.e = khaVar112.b;
                                    mva mvaVarA2 = n7b.a(ojbVar2, khaVar112.a);
                                    int iOrdinal = fl7Var3.ordinal();
                                    if (iOrdinal == 0) {
                                        kebVar = new keb(ggaVar3, iF, mvaVarA2, mh4Var10);
                                    } else {
                                        if (iOrdinal != 1) {
                                            u.b();
                                            return null;
                                        }
                                        kebVar = new l15(ggaVar3, iF, mvaVarA2, mh4Var10);
                                    }
                                    ox6 ox6VarA110 = kw0.a(uma.b(ox6VarE).H(kebVar).H(ox6Var110).H(ox6Var111).H(new gha(wjaVar4)).H(ox6Var112).H(ox6Var113), fw0Var12);
                                    final qga qgaVar5 = qgaVar4;
                                    final boolean z32 = z30;
                                    final boolean z33 = z31;
                                    final oh4 oh4Var1116 = oh4Var1115;
                                    final ag7 ag7Var6 = ag7Var5;
                                    final tx2 tx2Var14 = tx2Var13;
                                    lp9.a(ox6VarA110, gr1.b(1412697320, new ci4() { // from class: v52
                                        /* JADX WARN: Code duplicated, block: B:22:0x0099  */
                                        @Override // defpackage.ci4
                                        public final Object invoke(Object obj5, Object obj6) {
                                            boolean z34;
                                            jt1 jt1Var4 = (jt1) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            if (jt1Var4.A(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                u56 u56Var9 = u56Var8;
                                                i62 i62Var = new i62(u56Var9, oh4Var1116, khaVar112, ag7Var6, tx2Var14, i117);
                                                int iHashCode = Long.hashCode(jt1Var4.v());
                                                kw7 kw7VarY = jt1Var4.y();
                                                ox6 ox6VarC19 = it1.c(jt1Var4, ox6.a.t);
                                                bt1.c.getClass();
                                                qr5.a aVar5 = bt1.a.b;
                                                if (jt1Var4.s() == null) {
                                                    ml5.c();
                                                    throw null;
                                                }
                                                jt1Var4.q();
                                                if (jt1Var4.l()) {
                                                    jt1Var4.k(aVar5);
                                                } else {
                                                    jt1Var4.z();
                                                }
                                                rd7.d(jt1Var4, bt1.a.f, i62Var);
                                                rd7.d(jt1Var4, bt1.a.e, kw7VarY);
                                                rd7.d(jt1Var4, bt1.a.g, Integer.valueOf(iHashCode));
                                                rd7.c(jt1Var4, bt1.a.h);
                                                rd7.d(jt1Var4, bt1.a.d, ox6VarC19);
                                                jt1Var4.I();
                                                bt4 bt4VarA = u56Var9.a();
                                                bt4 bt4Var = bt4.t;
                                                boolean z35 = z32;
                                                if (bt4VarA != bt4Var && u56Var9.c() != null) {
                                                    qq5 qq5VarC = u56Var9.c();
                                                    qq5VarC.getClass();
                                                    z34 = qq5VarC.e() && z35;
                                                }
                                                qga qgaVar6 = qgaVar5;
                                                m62.c(qgaVar6, z34, jt1Var4, 0);
                                                if (u56Var9.a() == bt4.v && !z33 && z35) {
                                                    jt1Var4.K(-714666198);
                                                    m62.d(qgaVar6, jt1Var4, 0);
                                                    jt1Var4.B();
                                                } else {
                                                    jt1Var4.K(-714589318);
                                                    jt1Var4.B();
                                                }
                                            } else {
                                                jt1Var4.u();
                                            }
                                            return g2b.a;
                                        }
                                    }, jt1Var3), jt1Var3, 48);
                                } else {
                                    jt1Var3.u();
                                }
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 6);
                    } else {
                        jt1Var2.u();
                    }
                    return g2b.a;
                }
            };
            bj4Var = bj4Var13;
            b(ox6VarH19, qgaVar3, gr1.b(-814563849, ci4Var9, bj4Var), bj4Var, 384);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: a62
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i3 | 1);
                    int iS2 = gz3.s(i4);
                    m62.a(khaVar, oh4Var, ox6Var, wjaVar, ojbVar, oh4Var2, h27Var, fx0Var, z, i, i2, s85Var, bp5Var, z2, z3, ei4Var, (jt1) obj, iS, iS2);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final ox6 ox6Var, final qga qgaVar, final fr1 fr1Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(2036174316);
        int i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i | (bj4VarO.j(qgaVar) ? 32 : 16);
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            fl6 fl6VarD = dv0.d(di.a.a, true);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            pp0.a(qgaVar, fr1Var, bj4VarO, (i2 >> 3) & 126);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(qgaVar, fr1Var, i) { // from class: s52
                public final /* synthetic */ qga u;
                public final /* synthetic */ fr1 v;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(385);
                    m62.b(this.t, this.u, this.v, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final qga qgaVar, final boolean z, jt1 jt1Var, final int i) {
        sia siaVarD;
        bj4 bj4VarO = jt1Var.o(626339208);
        int i2 = (bj4VarO.j(qgaVar) ? 4 : 2) | i | (bj4VarO.c(z) ? 32 : 16);
        if (!bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            bj4VarO.u();
        } else if (z) {
            bj4VarO.K(1530097388);
            u56 u56Var = qgaVar.d;
            ria riaVar = null;
            if (u56Var != null && (siaVarD = u56Var.d()) != null) {
                ria riaVar2 = siaVarD.a;
                u56 u56Var2 = qgaVar.d;
                if (!(u56Var2 != null ? u56Var2.p : true)) {
                    riaVar = riaVar2;
                }
            }
            if (riaVar == null) {
                bj4VarO.K(1530097387);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(1530097388);
                if (lja.c(qgaVar.n().b)) {
                    bj4VarO.K(2110860558);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(2109807302);
                    int iB = qgaVar.b.b((int) (qgaVar.n().b >> 32));
                    int iB2 = qgaVar.b.b((int) (qgaVar.n().b & 4294967295L));
                    jt8 jt8VarA = riaVar.a(iB);
                    jt8 jt8VarA2 = riaVar.a(Math.max(iB2 - 1, 0));
                    u56 u56Var3 = qgaVar.d;
                    if (u56Var3 == null || !((Boolean) u56Var3.m.getValue()).booleanValue()) {
                        bj4VarO.K(2110490542);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(2110225306);
                        uga.a(true, jt8VarA, qgaVar, bj4VarO, ((i2 << 6) & 896) | 6);
                        bj4VarO.U(false);
                    }
                    u56 u56Var4 = qgaVar.d;
                    if (u56Var4 == null || !((Boolean) u56Var4.n.getValue()).booleanValue()) {
                        bj4VarO.K(2110838734);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(2110574459);
                        uga.a(false, jt8VarA2, qgaVar, bj4VarO, ((i2 << 6) & 896) | 6);
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(false);
                }
                u56 u56Var5 = qgaVar.d;
                if (u56Var5 != null) {
                    dt7 dt7Var = u56Var5.l;
                    if (!xj5.a(qgaVar.u.a.u, qgaVar.n().a.u)) {
                        dt7Var.setValue(Boolean.FALSE);
                    }
                    if (u56Var5.b()) {
                        if (((Boolean) dt7Var.getValue()).booleanValue()) {
                            qgaVar.r();
                        } else {
                            qgaVar.o();
                        }
                    }
                    g2b g2bVar = g2b.a;
                }
                bj4VarO.U(false);
            }
            bj4VarO.U(false);
        } else {
            bj4VarO.K(1989076778);
            bj4VarO.U(false);
            qgaVar.o();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(z, i) { // from class: y52
                public final /* synthetic */ boolean u;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    m62.c(this.t, this.u, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final qga qgaVar, jt1 jt1Var, final int i) {
        iw iwVarM;
        bj4 bj4VarO = jt1Var.o(-1436003720);
        int i2 = (bj4VarO.j(qgaVar) ? 4 : 2) | i;
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            u56 u56Var = qgaVar.d;
            if (u56Var == null || !((Boolean) u56Var.o.getValue()).booleanValue() || (iwVarM = qgaVar.m()) == null || iwVarM.u.length() <= 0) {
                bj4VarO.K(-2111042550);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-2112351432);
                boolean zJ = bj4VarO.J(qgaVar);
                Object objF = bj4VarO.f();
                jt1.a.C0187a c0187a = jt1.a.a;
                if (zJ || objF == c0187a) {
                    objF = new mga(qgaVar);
                    bj4VarO.C(objF);
                }
                lda ldaVar = (lda) objF;
                tx2 tx2Var = (tx2) bj4VarO.F(qu1.h);
                ag7 ag7Var = qgaVar.b;
                long j = qgaVar.n().b;
                int i3 = lja.c;
                int iB = ag7Var.b((int) (j >> 32));
                u56 u56Var2 = qgaVar.d;
                sia siaVarD = u56Var2 != null ? u56Var2.d() : null;
                siaVarD.getClass();
                ria riaVar = siaVarD.a;
                sk8 sk8VarC = riaVar.c(uh8.g(iB, 0, riaVar.a.a.u.length()));
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((tx2Var.U0(2.0f) / 2.0f) + sk8VarC.a)) << 32) | (((long) Float.floatToRawIntBits(sk8VarC.d)) & 4294967295L);
                boolean zI = bj4VarO.i(jFloatToRawIntBits);
                Object objF2 = bj4VarO.f();
                if (zI || objF2 == c0187a) {
                    objF2 = new a(jFloatToRawIntBits);
                    bj4VarO.C(objF2);
                }
                cg7 cg7Var = (cg7) objF2;
                boolean zJ2 = bj4VarO.j(ldaVar) | bj4VarO.j(qgaVar);
                Object objF3 = bj4VarO.f();
                if (zJ2 || objF3 == c0187a) {
                    objF3 = new b(ldaVar, qgaVar);
                    bj4VarO.C(objF3);
                }
                ox6 ox6VarB = t6a.b(ox6.a.t, ldaVar, (PointerInputEventHandler) objF3);
                boolean zI2 = bj4VarO.i(jFloatToRawIntBits);
                Object objF4 = bj4VarO.f();
                if (zI2 || objF4 == c0187a) {
                    objF4 = new oh4() { // from class: w52
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            ((hc9) obj).d(ab9.a, new za9(ys4.t, jFloatToRawIntBits, ya9.u, true));
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF4);
                }
                mn.a(cg7Var, pb9.b(ox6VarB, false, (oh4) objF4), 0L, bj4VarO, 0);
                bj4VarO.U(false);
            }
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i) { // from class: x52
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    m62.d(this.t, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void e(u56 u56Var) {
        gia giaVar = u56Var.e;
        if (giaVar != null) {
            u56Var.v.invoke(kha.a(u56Var.d.a, null, 0L, 3));
            xha xhaVar = giaVar.a;
            AtomicReference<gia> atomicReference = xhaVar.b;
            while (!atomicReference.compareAndSet(giaVar, null)) {
                if (atomicReference.get() != giaVar) {
                }
            }
            xhaVar.a.d();
        }
        u56Var.e = null;
    }

    public static final void f(u56 u56Var, kha khaVar, ag7 ag7Var) {
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            sia siaVarD = u56Var.d();
            if (siaVarD == null) {
                return;
            }
            gia giaVar = u56Var.e;
            if (giaVar == null) {
                return;
            }
            qq5 qq5VarC = u56Var.c();
            if (qq5VarC == null) {
                return;
            }
            aea.a(khaVar, u56Var.a, siaVarD.a, qq5VarC, giaVar, u56Var.b(), ag7Var);
            g2b g2bVar = g2b.a;
        } finally {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, gia, java.lang.Object] */
    public static final void g(xha xhaVar, u56 u56Var, kha khaVar, s85 s85Var, ag7 ag7Var) {
        nd3 nd3Var = u56Var.d;
        g75 g75Var = u56Var.v;
        s56 s56Var = u56Var.w;
        gl8 gl8Var = new gl8();
        yda ydaVar = new yda(nd3Var, g75Var, gl8Var);
        y18 y18Var = xhaVar.a;
        y18Var.e(khaVar, s85Var, ydaVar, s56Var);
        ?? giaVar = new gia(xhaVar, y18Var);
        xhaVar.b.set((gia) giaVar);
        gl8Var.t = giaVar;
        u56Var.e = giaVar;
        f(u56Var, khaVar, ag7Var);
    }
}
