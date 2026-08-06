package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import defpackage.fda;
import defpackage.fja;
import defpackage.g2b;
import defpackage.iw;
import defpackage.l86;
import defpackage.m86;
import defpackage.mb4;
import defpackage.ob4;
import defpackage.u7d;
import defpackage.ww9;
import defpackage.z2a;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockExtensionsKt {
    private static final void appendStringWithLink(iw.b bVar, ww9 ww9Var, final Context context, Spanned spanned) {
        int i = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        int i2 = 0;
        while (i < length) {
            final URLSpan uRLSpan = uRLSpanArr[i];
            l86.a aVar = new l86.a("url", new fja(ww9Var, 14), new m86() { // from class: zq0
                @Override // defpackage.m86
                public final void a(l86 l86Var) {
                    BlockExtensionsKt.appendStringWithLink$lambda$8$lambda$6(uRLSpan, context, l86Var);
                }
            });
            int spanStart = spanned.getSpanStart(uRLSpan);
            int spanEnd = spanned.getSpanEnd(uRLSpan);
            if (spanStart > i2) {
                bVar.c(spanned.subSequence(i2, spanStart).toString());
            }
            int iF = bVar.f(aVar);
            try {
                bVar.c(spanned.subSequence(spanStart, spanEnd).toString());
                g2b g2bVar = g2b.a;
                bVar.e(iF);
                i++;
                i2 = spanEnd;
            } catch (Throwable th) {
                bVar.e(iF);
                throw th;
            }
        }
        if (i2 < spanned.length()) {
            bVar.c(spanned.subSequence(i2, spanned.length()).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendStringWithLink$lambda$8$lambda$6(URLSpan uRLSpan, Context context, l86 l86Var) {
        l86Var.getClass();
        String url = uRLSpan.getURL();
        url.getClass();
        if (z2a.w(url)) {
            return;
        }
        LinkOpener.handleUrl(uRLSpan.getURL(), context, Injector.get().getApi());
    }

    public static final int getTextAlign(BlockAlignment blockAlignment) {
        blockAlignment.getClass();
        int gravity = blockAlignment.getGravity();
        if (gravity != 1) {
            return (gravity == 8388611 || gravity != 8388613) ? 5 : 6;
        }
        return 3;
    }

    public static final iw toAnnotatedString(CharSequence charSequence, Context context, ww9 ww9Var) {
        charSequence.getClass();
        context.getClass();
        ww9Var.getClass();
        if (!(charSequence instanceof Spanned)) {
            iw.b bVar = new iw.b();
            bVar.c(bVar.toString());
            return bVar.i();
        }
        iw.b bVar2 = new iw.b();
        Spanned spanned = (Spanned) charSequence;
        StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class);
        UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) spanned.getSpans(0, spanned.length(), UnderlineSpan.class);
        StrikethroughSpan[] strikethroughSpanArr = (StrikethroughSpan[]) spanned.getSpans(0, spanned.length(), StrikethroughSpan.class);
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spanned.getSpans(0, spanned.length(), ForegroundColorSpan.class);
        appendStringWithLink(bVar2, ww9Var, context, spanned);
        for (StyleSpan styleSpan : styleSpanArr) {
            int spanStart = spanned.getSpanStart(styleSpan);
            int spanEnd = spanned.getSpanEnd(styleSpan);
            int style = styleSpan.getStyle();
            if (style == 1) {
                bVar2.a(new ww9(0L, 0L, ob4.B, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), spanStart, spanEnd);
            } else if (style == 2) {
                bVar2.a(new ww9(0L, 0L, null, new mb4(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527), spanStart, spanEnd);
            } else if (style == 3) {
                bVar2.a(new ww9(0L, 0L, ob4.B, new mb4(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523), spanStart, spanEnd);
            }
        }
        for (UnderlineSpan underlineSpan : underlineSpanArr) {
            bVar2.a(new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439), spanned.getSpanStart(underlineSpan), spanned.getSpanEnd(underlineSpan));
        }
        for (StrikethroughSpan strikethroughSpan : strikethroughSpanArr) {
            bVar2.a(new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.d, null, 61439), spanned.getSpanStart(strikethroughSpan), spanned.getSpanEnd(strikethroughSpan));
        }
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            bVar2.a(new ww9(u7d.c(foregroundColorSpan.getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), spanned.getSpanStart(foregroundColorSpan), spanned.getSpanEnd(foregroundColorSpan));
        }
        return bVar2.i();
    }
}
