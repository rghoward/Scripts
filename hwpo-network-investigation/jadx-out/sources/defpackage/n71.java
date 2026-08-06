package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsViewModel$observeFileDownloading$1", f = "ChallengeEntryDetailsViewModel.kt", l = {107, 108}, m = "invokeSuspend", v = 2)
public final class n71 extends p6a implements ci4<xd3<? extends Exception, ? extends ww3>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ w71 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<ww3, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(ww3 ww3Var, r02<? super g2b> r02Var) {
            Object obj;
            ww3 ww3Var2 = ww3Var;
            w71 w71Var = (w71) this.receiver;
            int i = w71.O;
            d71 d71Var = w71Var.b().d;
            if (d71Var != null) {
                List<l89> list = d71Var.o;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((l89) obj2).v == u60.w) {
                        arrayList.add(obj2);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                do {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i3);
                    i3++;
                } while (!xj5.a(((l89) obj).w, ww3Var2.a()));
                l89 l89Var = (l89) obj;
                if (l89Var != null) {
                    l89 l89VarA = l89.a(l89Var, fk2.a(ww3Var2), null, 15359);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            i2 = -1;
                            break;
                        }
                        Object obj3 = arrayList.get(i4);
                        i4++;
                        if (((l89) obj3).t == l89VarA.t) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.set(i2, l89VarA);
                        w71Var.e(new n61.b(d71.a(d71Var, false, false, false, false, false, false, null, null, null, null, null, arrayList2, 16383)));
                    }
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
            ((rma.a) this.receiver).b(th);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n71(w71 w71Var, r02<? super n71> r02Var) {
        super(2, r02Var);
        this.v = w71Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        n71 n71Var = new n71(this.v, r02Var);
        n71Var.u = obj;
        return n71Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends ww3> xd3Var, r02<? super g2b> r02Var) {
        return ((n71) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r14, r6, r13) == r5) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = r13.u
            xd3 r0 = (defpackage.xd3) r0
            int r1 = r13.t
            r2 = 0
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.dv8.b(r14)
            goto L58
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r2
        L1b:
            defpackage.dv8.b(r14)
            goto L3c
        L1f:
            defpackage.dv8.b(r14)
            n71$a r6 = new n71$a
            java.lang.String r11 = "updateFileStatus(Lcom/hwpo_training_app/domain/entity/FileDownloadingStatus;)V"
            r12 = 4
            r7 = 2
            w71 r8 = r13.v
            java.lang.Class<w71> r9 = defpackage.w71.class
            java.lang.String r10 = "updateFileStatus"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.u = r2
            r13.t = r4
            java.lang.Object r14 = defpackage.yd3.b(r0, r6, r13)
            if (r14 != r5) goto L3c
            goto L57
        L3c:
            xd3 r14 = (defpackage.xd3) r14
            n71$b r6 = new n71$b
            rma$a r8 = defpackage.rma.a
            java.lang.String r11 = "e(Ljava/lang/Throwable;)V"
            r12 = 4
            r7 = 2
            java.lang.Class<rma$a> r9 = rma.a.class
            java.lang.String r10 = "e"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.u = r2
            r13.t = r3
            java.lang.Object r13 = defpackage.yd3.a(r14, r6, r13)
            if (r13 != r5) goto L58
        L57:
            return r5
        L58:
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
