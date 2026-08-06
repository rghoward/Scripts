package defpackage;

import com.hwpo_training_app.leaderboards.list.common.presentation.entity.TopValueUiEntity;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ny implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ di4 u;

    public /* synthetic */ ny(di4 di4Var, int i) {
        this.t = i;
        this.u = di4Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        di4 di4Var = this.u;
        switch (i) {
            case 0:
                ((ro4) obj).b(((Number) ((mh4) di4Var).invoke()).floatValue());
                return g2b.a;
            case 1:
                return FileActionSheetKt.FileActionSheet$lambda$7$lambda$6((mh4) di4Var, (IntercomPreviewFile) obj);
            case 2:
                hc9 hc9Var = (hc9) obj;
                Object objInvoke = ((mh4) di4Var).invoke();
                if (Float.isNaN(((Number) objInvoke).floatValue())) {
                    objInvoke = null;
                }
                Float f = (Float) objInvoke;
                ud8 ud8Var = new ud8(f != null ? f.floatValue() : 0.0f, new gg1(1.0f));
                ho5<Object>[] ho5VarArr = ec9.a;
                gc9<ud8> gc9Var = ac9.c;
                ho5<Object> ho5Var = ec9.a[1];
                hc9Var.d(gc9Var, ud8Var);
                return g2b.a;
            default:
                TopValueUiEntity topValueUiEntity = (TopValueUiEntity) obj;
                topValueUiEntity.getClass();
                ((oh4) di4Var).invoke(topValueUiEntity);
                return g2b.a;
        }
    }
}
