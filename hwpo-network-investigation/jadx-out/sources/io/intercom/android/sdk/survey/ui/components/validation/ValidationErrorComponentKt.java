package io.intercom.android.sdk.survey.ui.components.validation;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.fh1;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.js7;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.xj8;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.ui.components.validation.ValidationErrorComponentKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ValidationErrorComponentKt {
    public static final void ErrorPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1851250451);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ValidationErrorComponentKt.INSTANCE.m455getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new fh1(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ErrorPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        ErrorPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110 A[LOOP:0: B:50:0x010a->B:52:0x0110, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0176  */
    /* JADX WARN: Code duplicated, block: B:58:0x0183  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ValidationErrorComponent-FNF3uiM, reason: not valid java name */
    public static final void m456ValidationErrorComponentFNF3uiM(ox6 ox6Var, ValidationError.ValidationStringError validationStringError, final long j, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        ValidationError.ValidationStringError validationStringError2;
        long j2;
        int i4;
        ox6.a aVar;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        Phrase phraseFrom;
        Iterator<T> it;
        xj8 xj8VarW;
        validationStringError.getClass();
        bj4 bj4VarO = jt1Var.o(-1195832801);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                validationStringError2 = validationStringError;
                i3 |= bj4VarO.j(validationStringError2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 384) == 0) {
                    if (bj4VarO.i(j2)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i3 |= i4;
                }
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i5 != 0) {
                    ox6Var2 = aVar;
                }
                ox6 ox6VarM = eo7.m(ir9.c(ox6Var2, 1.0f), 0.0f, 2.0f, 0.0f, 2.0f, 5);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarM);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                m65.b(is7.a(R.drawable.intercom_ic_error, bj4VarO, 0), null, ir9.n(aVar, 16.0f), j2, bj4VarO, 440 | ((i3 << 3) & 7168), 0);
                phraseFrom = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), validationStringError2.getStringRes());
                it = validationStringError2.getParams().iterator();
                while (it.hasNext()) {
                    js7 js7Var = (js7) it.next();
                    phraseFrom.put((String) js7Var.t, (CharSequence) js7Var.u);
                }
                mia.b(phraseFrom.format().toString(), eo7.m(ir9.c(aVar, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), bj4VarO, (i3 & 896) | 48, 0, 131064);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
            } else {
                bj4VarO.u();
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                final ValidationError.ValidationStringError validationStringError3 = validationStringError2;
                xj8VarW.d = new ci4() { // from class: o7b
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ValidationErrorComponentKt.ValidationErrorComponent_FNF3uiM$lambda$2(ox6Var2, validationStringError3, j, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        validationStringError2 = validationStringError;
        if ((i2 & 4) != 0) {
            i3 |= 384;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 384) == 0) {
                if (bj4VarO.i(j2)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
        }
        if ((i3 & 147) == 146) {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var2 = aVar;
            }
            ox6 ox6VarM2 = eo7.m(ir9.c(ox6Var2, 1.0f), 0.0f, 2.0f, 0.0f, 2.0f, 5);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarM2);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            m65.b(is7.a(R.drawable.intercom_ic_error, bj4VarO, 0), null, ir9.n(aVar, 16.0f), j2, bj4VarO, 440 | ((i3 << 3) & 7168), 0);
            phraseFrom = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), validationStringError2.getStringRes());
            it = validationStringError2.getParams().iterator();
            while (it.hasNext()) {
                js7 js7Var2 = (js7) it.next();
                phraseFrom.put((String) js7Var2.t, (CharSequence) js7Var2.u);
            }
            mia.b(phraseFrom.format().toString(), eo7.m(ir9.c(aVar, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), bj4VarO, (i3 & 896) | 48, 0, 131064);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
        } else {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var2 = aVar;
            }
            ox6 ox6VarM3 = eo7.m(ir9.c(ox6Var2, 1.0f), 0.0f, 2.0f, 0.0f, 2.0f, 5);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarM3);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            m65.b(is7.a(R.drawable.intercom_ic_error, bj4VarO, 0), null, ir9.n(aVar, 16.0f), j2, bj4VarO, 440 | ((i3 << 3) & 7168), 0);
            phraseFrom = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), validationStringError2.getStringRes());
            it = validationStringError2.getParams().iterator();
            while (it.hasNext()) {
                js7 js7Var3 = (js7) it.next();
                phraseFrom.put((String) js7Var3.t, (CharSequence) js7Var3.u);
            }
            mia.b(phraseFrom.format().toString(), eo7.m(ir9.c(aVar, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), bj4VarO, (i3 & 896) | 48, 0, 131064);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final ValidationError.ValidationStringError validationStringError4 = validationStringError2;
            xj8VarW.d = new ci4() { // from class: o7b
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ValidationErrorComponentKt.ValidationErrorComponent_FNF3uiM$lambda$2(ox6Var2, validationStringError4, j, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ValidationErrorComponent_FNF3uiM$lambda$2(ox6 ox6Var, ValidationError.ValidationStringError validationStringError, long j, int i, int i2, jt1 jt1Var, int i3) {
        m456ValidationErrorComponentFNF3uiM(ox6Var, validationStringError, j, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
