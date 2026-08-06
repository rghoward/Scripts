package defpackage;

import androidx.appcompat.widget.AppCompatEditText;
import io.intercom.android.sdk.m5.preview.ui.MediaPickerButtonKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cu1 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ cu1(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    @Override // defpackage.mh4
    public final Object invoke() {
        List listK;
        yr9 yr9VarL1;
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                bj4 bj4Var = ((du1) obj2).t;
                zr9 zr9Var = bj4Var.c;
                yr9 yr9VarL2 = zr9Var.l1();
                int i2 = 0;
                while (true) {
                    try {
                        ne7 ne7Var = null;
                        if (i2 < zr9Var.y) {
                            if (yr9VarL2.l(i2)) {
                                Object objN = yr9VarL2.n(i2);
                                if (objN != obj) {
                                    jm8 jm8Var = objN instanceof jm8 ? (jm8) objN : null;
                                    if ((jm8Var != null ? jm8Var.c() : null) == obj) {
                                    }
                                }
                                ne7 ne7Var2 = new ne7(i2, null);
                                yr9VarL2.c();
                                ne7Var = ne7Var2;
                                if (ne7Var != null) {
                                    int i3 = ne7Var.a;
                                    Integer num = ne7Var.b;
                                    yr9VarL1 = zr9Var.l1();
                                    try {
                                        ArrayList arrayListC = zs1.c(yr9VarL1, i3, num);
                                        yr9VarL1.c();
                                        listK = th1.K(arrayListC, bj4Var.h0());
                                    } catch (Throwable th) {
                                        yr9VarL1.c();
                                        throw th;
                                    }
                                } else {
                                    listK = hf3.t;
                                }
                                return new xs1(listK, bj4Var.C);
                            }
                            int[] iArr = yr9VarL2.b;
                            int i4 = i2 + 1;
                            int iC = (i4 < yr9VarL2.c ? iArr[(i4 * 5) + 4] : yr9VarL2.e) - bs9.c(iArr, i2);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= iC) {
                                    i2 = i4;
                                } else {
                                    Object objH = yr9VarL2.h(i2, i5);
                                    if (objH != obj) {
                                        jm8 jm8Var2 = objH instanceof jm8 ? (jm8) objH : null;
                                        if ((jm8Var2 != null ? jm8Var2.c() : null) != obj) {
                                            i5++;
                                        }
                                    }
                                    ne7Var = new ne7(i2, Integer.valueOf(i5));
                                }
                            }
                        } else {
                            g2b g2bVar = g2b.a;
                        }
                        yr9VarL2.c();
                        if (ne7Var != null) {
                            int i6 = ne7Var.a;
                            Integer num2 = ne7Var.b;
                            yr9VarL1 = zr9Var.l1();
                            ArrayList arrayListC2 = zs1.c(yr9VarL1, i6, num2);
                            yr9VarL1.c();
                            listK = th1.K(arrayListC2, bj4Var.h0());
                        } else {
                            listK = hf3.t;
                        }
                        return new xs1(listK, bj4Var.C);
                    } catch (Throwable th2) {
                        yr9VarL2.c();
                        throw th2;
                    }
                }
            case 1:
                return MediaPickerButtonKt.MediaPickerButton$lambda$8$lambda$7((mh4) obj2, (eh6) obj);
            default:
                ((AppCompatEditText) obj2).removeTextChangedListener((wgb.a) obj);
                return g2b.a;
        }
    }
}
