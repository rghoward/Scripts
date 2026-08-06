package io.ably.lib.util;

import android.content.Intent;
import io.ably.lib.types.ErrorInfo;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class IntentUtils {
    public static void addErrorInfo(Intent intent, ErrorInfo errorInfo) {
        intent.putExtra("hasError", errorInfo != null);
        if (errorInfo != null) {
            intent.putExtra("error.message", errorInfo.message);
            intent.putExtra("error.statusCode", errorInfo.statusCode);
            intent.putExtra("error.code", errorInfo.code);
        }
    }

    public static ErrorInfo getErrorInfo(Intent intent) {
        if (intent.getBooleanExtra("hasError", false)) {
            return new ErrorInfo(intent.getStringExtra("error.message"), intent.getIntExtra("error.statusCode", 0), intent.getIntExtra("error.code", 0));
        }
        return null;
    }
}
