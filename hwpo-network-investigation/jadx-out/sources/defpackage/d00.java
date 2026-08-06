package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d00 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        hz1.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                aVar = new hz1.a(clipData, 3);
            } else {
                hz1.c cVar = new hz1.c();
                cVar.a = clipData;
                cVar.b = 3;
                aVar = cVar;
            }
            egb.k(textView, aVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        hz1.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new hz1.a(clipData, 3);
        } else {
            hz1.c cVar = new hz1.c();
            cVar.a = clipData;
            cVar.b = 3;
            aVar = cVar;
        }
        egb.k(view, aVar.build());
        return true;
    }
}
