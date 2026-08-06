package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ai1;
import defpackage.b85;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.f50;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.k50;
import defpackage.k85;
import defpackage.ox6;
import defpackage.xj8;
import defpackage.y0a;
import defpackage.z75;
import defpackage.zh1;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiRatingKt;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class EmojiRatingKt {
    public static final void EmojiRating(final String str, final String str2, boolean z, final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        final boolean z2;
        str.getClass();
        str2.getClass();
        ox6Var.getClass();
        bj4 bj4VarO = jt1Var.o(-538688650);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.c(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            ox6Var2 = ox6Var;
        } else {
            ox6Var2 = ox6Var;
            if ((i & 3072) == 0) {
                i3 |= bj4VarO.J(ox6Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            z2 = z;
        } else {
            boolean z3 = i4 != 0 ? true : z;
            y0a y0aVar = AndroidCompositionLocals_androidKt.b;
            b85 imageLoader = IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(y0aVar));
            bj4VarO.e(1750824323);
            k85.a aVar = new k85.a((Context) bj4VarO.F(y0aVar));
            aVar.c = str;
            aVar.b();
            f50 f50VarA = k50.a(aVar.a(), imageLoader, null, null, bj4VarO, 124);
            bj4VarO.U(false);
            float[] fArrB = zh1.b();
            zh1.d(fArrB, z3 ? 1.0f : 0.0f);
            g2b g2bVar = g2b.a;
            ai1 ai1Var = new ai1(new ColorMatrixColorFilter(fArrB));
            ai1Var.b = fArrB;
            z75.a(f50VarA, str2, ox6Var2, null, null, 0.0f, ai1Var, bj4VarO, ((i3 >> 3) & 896) | (i3 & 112), 56);
            z2 = z3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ue3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    ox6 ox6Var3 = ox6Var;
                    return EmojiRatingKt.EmojiRating$lambda$2(str, str2, z2, ox6Var3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmojiRating$lambda$2(String str, String str2, boolean z, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        EmojiRating(str, str2, z, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void SelectedEmoji(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1230381561);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            EmojiRating("https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩", true, ir9.j(ox6.a.t, 44.0f), bj4VarO, 3510, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: se3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return EmojiRatingKt.SelectedEmoji$lambda$3(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SelectedEmoji$lambda$3(int i, jt1 jt1Var, int i2) {
        SelectedEmoji(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void UnSelectedEmoji(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(2043776160);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            EmojiRating("https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩", false, ir9.j(ox6.a.t, 44.0f), bj4VarO, 3510, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: te3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return EmojiRatingKt.UnSelectedEmoji$lambda$4(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UnSelectedEmoji$lambda$4(int i, jt1 jt1Var, int i2) {
        UnSelectedEmoji(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
