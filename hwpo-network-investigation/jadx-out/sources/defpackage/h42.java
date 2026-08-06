package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h42 implements ci4 {
    public final /* synthetic */ int t;

    public /* synthetic */ h42(int i) {
        this.t = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$156$lambda$155(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            default:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                qa6 qa6VarInflate = qa6.inflate(layoutInflater, viewGroup, false);
                qa6VarInflate.getClass();
                return qa6VarInflate;
        }
    }
}
