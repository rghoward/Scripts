package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.net.Uri;
import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.ws0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-7$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$MessageComposerKt$lambda7$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$MessageComposerKt$lambda7$1 INSTANCE = new ComposableSingletons$MessageComposerKt$lambda7$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(String str, List list) {
        str.getClass();
        list.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) throws Throwable {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(1440469873);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new j0();
            jt1Var.C(objF);
        }
        jt1Var.B();
        StringProvider.StringRes stringRes = new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null);
        List listI = ws0.i(BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE, BottomBarUiState.BottomBarButton.GifInsert.INSTANCE, BottomBarUiState.BottomBarButton.VoiceNotesInsert.INSTANCE);
        Uri uri = Uri.EMPTY;
        uri.getClass();
        MessageComposerKt.MessageComposer(null, (ci4) objF, new ComposerState.TextInput(BuildConfig.FLAVOR, stringRes, false, listI, ws0.i(new MediaUploadItem(null, new MediaData.Media.Other("application/pdf", 0L, "pdf_document.pdf", uri), new MediaUploadItem.UploadState.Success(new Block.Builder()), 1, null), new MediaUploadItem(null, new MediaData.Media.Other("text/plain", 0L, "txt_document.txt", uri), new MediaUploadItem.UploadState.Success(new Block.Builder()), 1, null)), null, 36, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, jt1Var, 48, 0, 131065);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) throws Throwable {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
