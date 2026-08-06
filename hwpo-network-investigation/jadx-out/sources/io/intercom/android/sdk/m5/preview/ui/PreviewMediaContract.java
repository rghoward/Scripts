package io.intercom.android.sdk.m5.preview.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import defpackage.hf3;
import defpackage.o9;
import defpackage.ty0;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewArgs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PreviewMediaContract extends o9<IntercomPreviewArgs, List<Uri>> {
    public static final int $stable = 0;

    @Override // defpackage.o9
    public Intent createIntent(Context context, IntercomPreviewArgs intercomPreviewArgs) {
        context.getClass();
        intercomPreviewArgs.getClass();
        return IntercomPreviewActivity.Companion.createIntent(context, intercomPreviewArgs);
    }

    @Override // defpackage.o9
    public List<Uri> parseResult(int i, Intent intent) {
        Bundle extras;
        if (i != -1) {
            intent = null;
        }
        if (intent != null && (extras = intent.getExtras()) != null) {
            ArrayList arrayListB = Build.VERSION.SDK_INT >= 34 ? ty0.a.b(extras, "MEDIA_RESULT_URIS", Uri.class) : extras.getParcelableArrayList("MEDIA_RESULT_URIS");
            if (arrayListB != null) {
                return arrayListB;
            }
        }
        return hf3.t;
    }
}
