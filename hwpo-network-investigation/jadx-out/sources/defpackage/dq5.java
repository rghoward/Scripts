package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dq5 implements ci4 {
    public final /* synthetic */ int t;

    public /* synthetic */ dq5(int i) {
        this.t = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                y96 y96VarInflate = y96.inflate(layoutInflater, viewGroup, false);
                y96VarInflate.getClass();
                return y96VarInflate;
            default:
                return TicketDetailDestinationKt.TicketDetailScreen$lambda$20$lambda$19((String) obj, ((Boolean) obj2).booleanValue());
        }
    }
}
