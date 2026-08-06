package io.intercom.android.sdk.m5.preview.ui;

import android.net.Uri;
import defpackage.aa0;
import defpackage.bw2;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.eh6;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import io.ably.lib.transport.Defaults;
import io.intercom.android.sdk.m5.preview.data.DeleteType;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.preview.ui.MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1$1", f = "MediaPickerButton.kt", l = {Defaults.PORT}, m = "invokeSuspend")
public final class MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ List<Uri> $it;
    final /* synthetic */ MediaPickerButtonCTAStyle $mediaPickerButtonCTAStyle;
    final /* synthetic */ eh6<IntercomPreviewArgs, List<Uri>> $previewLauncher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1$1(eh6<IntercomPreviewArgs, List<Uri>> eh6Var, List<? extends Uri> list, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, r02<? super MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1$1> r02Var) {
        super(2, r02Var);
        this.$previewLauncher = eh6Var;
        this.$it = list;
        this.$mediaPickerButtonCTAStyle = mediaPickerButtonCTAStyle;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1$1(this.$previewLauncher, this.$it, this.$mediaPickerButtonCTAStyle, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            this.label = 1;
            Object objB = bw2.b(50L, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        eh6<IntercomPreviewArgs, List<Uri>> eh6Var = this.$previewLauncher;
        List<Uri> list = this.$it;
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new IntercomPreviewFile.LocalFile((Uri) it.next()));
        }
        MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle = this.$mediaPickerButtonCTAStyle;
        String ctaText = mediaPickerButtonCTAStyle instanceof MediaPickerButtonCTAStyle.TextButton ? ((MediaPickerButtonCTAStyle.TextButton) mediaPickerButtonCTAStyle).getCtaText() : null;
        eh6Var.a(new IntercomPreviewArgs(arrayList, DeleteType.Remove.INSTANCE, ctaText, this.$mediaPickerButtonCTAStyle instanceof MediaPickerButtonCTAStyle.TopBarButton, 0, null, 48, null));
        return g2b.a;
    }
}
