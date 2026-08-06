package defpackage;

import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xl0 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ xl0(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return g2b.a;
            case 1:
                int i = w71.O;
                return ((y71) obj).e;
            case 2:
                return FileActionSheetKt.FileActionSheet$lambda$9$lambda$8((List) obj);
            default:
                obj.getClass();
                return new ob4(((Integer) obj).intValue());
        }
    }
}
