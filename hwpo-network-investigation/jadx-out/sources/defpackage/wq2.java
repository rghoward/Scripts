package defpackage;

import android.content.Context;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.data.model.ApiError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wq2 implements cm3 {
    public final Context a;
    public final sl5 b;
    public final String c;
    public final ApiError.Placement.b d;

    public wq2(Context context, yl3 yl3Var, sl5 sl5Var) {
        this.a = context;
        this.b = sl5Var;
        String string = context.getString(R.string.unknown_error);
        string.getClass();
        this.c = string;
        this.d = ApiError.Placement.u;
    }

    @Override // defpackage.cm3
    public final String a(Throwable th) {
        th.getClass();
        return b(th).a;
    }

    @Override // defpackage.cm3
    public final tl3 b(Throwable th) {
        yl3.a aVar;
        ApiError apiError;
        th.getClass();
        if (th instanceof q45) {
            aVar = yl3.a.u;
        } else {
            aVar = th instanceof IOException ? yl3.a.t : yl3.a.v;
        }
        int iOrdinal = aVar.ordinal();
        ApiError.Placement.b bVar = this.d;
        if (iOrdinal != 0) {
            String str = this.c;
            if (iOrdinal == 1) {
                q45 q45Var = (q45) th;
                sl5 sl5Var = this.b;
                str.getClass();
                bVar.getClass();
                ru8<?> ru8Var = q45Var.t;
                try {
                    ru8Var.getClass();
                    su8 su8Var = ru8Var.c;
                    su8Var.getClass();
                    String strT = su8Var.t();
                    strT.getClass();
                    JsonElement jsonElement = (JsonElement) sl5Var.b(nm5.a, strT);
                    if (jsonElement instanceof JsonObject) {
                        Object obj = (JsonElement) ((JsonObject) jsonElement).t.entrySet().iterator().next().getValue();
                        if (obj instanceof JsonArray) {
                            ArrayList arrayList = new ArrayList();
                            try {
                                Iterator it = ((Iterable) obj).iterator();
                                while (it.hasNext()) {
                                    arrayList.add(sl5Var.a(ApiError.Companion.serializer(), (JsonElement) it.next()));
                                }
                                apiError = (ApiError) th1.A(arrayList);
                                if (apiError == null) {
                                    apiError = new ApiError(str, bVar);
                                }
                            } catch (Exception unused) {
                                apiError = new ApiError(str, bVar);
                            }
                        } else {
                            apiError = new ApiError(str, bVar);
                        }
                    } else {
                        apiError = new ApiError(str, bVar);
                    }
                } catch (Exception unused2) {
                    String localizedMessage = q45Var.getLocalizedMessage();
                    if (localizedMessage != null) {
                        str = localizedMessage;
                    }
                    apiError = new ApiError(str, bVar);
                }
            } else {
                if (iOrdinal != 2) {
                    u.b();
                    return null;
                }
                String message = th.getMessage();
                if (message != null) {
                    str = message;
                }
                apiError = new ApiError(str, bVar);
            }
        } else {
            String string = this.a.getString(R.string.your_connection_is_lost);
            string.getClass();
            apiError = new ApiError(string, bVar);
        }
        return new tl3(apiError.t, apiError.u.a());
    }
}
