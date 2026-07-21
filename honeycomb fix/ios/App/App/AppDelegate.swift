import UIKit
import Capacitor
import Photos
import WebKit

@objc(AppViewController)
class AppViewController: CAPBridgeViewController, WKScriptMessageHandler {
    private var pendingPhotoData: Data?
    private var pendingPhotoName = "Honeycomb-photo.jpg"

    override func capacitorDidLoad() {
        super.capacitorDidLoad()
        guard let configuration = webView?.configuration else { return }

        configuration.userContentController.add(self, name: "HoneycombDownloads")
        configuration.userContentController.addUserScript(
            WKUserScript(source: """
            window.HoneycombDownloads = {
              beginCachedSave: function(name, mime) {
                window.webkit.messageHandlers.HoneycombDownloads.postMessage({action:'begin', name:name, mime:mime});
                return true;
              },
              appendCachedChunk: function(data) {
                window.webkit.messageHandlers.HoneycombDownloads.postMessage({action:'append', data:data});
                return true;
              },
              finishCachedSave: function() {
                window.webkit.messageHandlers.HoneycombDownloads.postMessage({action:'finish'});
                return true;
              },
              cancelCachedSave: function() {
                window.webkit.messageHandlers.HoneycombDownloads.postMessage({action:'cancel'});
              }
            };
            """, injectionTime: .atDocumentStart, forMainFrameOnly: true)
        )

        if let themePath = Bundle.main.path(forResource: "login-theme", ofType: "js", inDirectory: "public"),
           let loginTheme = try? String(contentsOfFile: themePath, encoding: .utf8) {
            configuration.userContentController.addUserScript(
                WKUserScript(source: loginTheme, injectionTime: .atDocumentEnd, forMainFrameOnly: true)
            )
        }

        if let path = Bundle.main.path(forResource: "honeycomb", ofType: "js", inDirectory: "public"),
           let dashboard = try? String(contentsOfFile: path, encoding: .utf8) {
            let guardedDashboard = """
            (function(){
              if (window.__HCFD_MOBILE_WATCHING__) return;
              window.__HCFD_MOBILE_WATCHING__ = true;
              var authenticated = false, failures = 0;
              function inject(){
                if (window.__HCFD_MOBILE_INJECTED__) return;
                window.__HCFD_MOBILE_INJECTED__ = true;
                \(dashboard)
              }
              function check(){
                fetch('/api/membership/children', {credentials:'same-origin', headers:{Accept:'application/json'}})
                  .then(function(response){ return response.ok ? response.json() : null; })
                  .then(function(json){
                    if (json && json.Success) {
                      authenticated = true;
                      failures = 0;
                      inject();
                    } else if (authenticated && ++failures >= 2) {
                      authenticated = false;
                      Promise.resolve(window.__HCFD_CLEAR_PRIVATE_DATA__ && window.__HCFD_CLEAR_PRIVATE_DATA__());
                    }
                  })
                  .catch(function(){ /* The user may still be signing in. */ });
              }
              check();
              setInterval(check, 15000);
              setTimeout(function(){
                if (!document.querySelector('input[type="password"]')) inject();
              }, 2500);
            })();
            """
            configuration.userContentController.addUserScript(
                WKUserScript(source: guardedDashboard, injectionTime: .atDocumentEnd, forMainFrameOnly: true)
            )
        }

    }

    func userContentController(_ userContentController: WKUserContentController, didReceive message: WKScriptMessage) {
        guard message.name == "HoneycombDownloads",
              let body = message.body as? [String: Any],
              let action = body["action"] as? String else { return }

        switch action {
        case "begin":
            pendingPhotoData = Data()
            pendingPhotoName = safePhotoName(body["name"] as? String)
        case "append":
            guard let encoded = body["data"] as? String,
                  let chunk = Data(base64Encoded: encoded) else {
                pendingPhotoData = nil
                return
            }
            pendingPhotoData?.append(chunk)
        case "finish":
            savePendingPhoto()
        case "cancel":
            pendingPhotoData = nil
        default:
            break
        }
    }

    private func safePhotoName(_ suggestedName: String?) -> String {
        let fallback = "Honeycomb-photo.jpg"
        guard let suggestedName else { return fallback }
        let allowed = CharacterSet.alphanumerics.union(CharacterSet(charactersIn: "._ -"))
        let cleaned = String(suggestedName.unicodeScalars.filter { allowed.contains($0) }.prefix(120))
        return cleaned.isEmpty ? fallback : cleaned
    }

    private func savePendingPhoto() {
        guard let photoData = pendingPhotoData, !photoData.isEmpty else { return }
        pendingPhotoData = nil
        let destination = FileManager.default.temporaryDirectory.appendingPathComponent(UUID().uuidString + "-" + pendingPhotoName)

        do {
            try photoData.write(to: destination, options: .atomic)
        } catch {
            notifyPhotoSaveStatus("Photo save failed: \(error.localizedDescription)")
            return
        }

        PHPhotoLibrary.requestAuthorization(for: .addOnly) { [weak self] status in
            guard status == .authorized || status == .limited else {
                try? FileManager.default.removeItem(at: destination)
                self?.notifyPhotoSaveStatus("Photo save failed: Photos access was not granted")
                return
            }
            PHPhotoLibrary.shared().performChanges({
                PHAssetChangeRequest.creationRequestForAssetFromImage(atFileURL: destination)
            }) { success, error in
                try? FileManager.default.removeItem(at: destination)
                self?.notifyPhotoSaveStatus(success
                    ? "Photo saved to Photos"
                    : "Photo save failed: \(error?.localizedDescription ?? "The photo could not be saved")")
            }
        }
    }

    private func notifyPhotoSaveStatus(_ message: String) {
        let encoded = message
            .replacingOccurrences(of: "\\", with: "\\\\")
            .replacingOccurrences(of: "'", with: "\\'")
            .replacingOccurrences(of: "\n", with: " ")
        DispatchQueue.main.async { [weak self] in
            self?.webView?.evaluateJavaScript("window.__HCFD_DOWNLOAD_STATUS__ && window.__HCFD_DOWNLOAD_STATUS__('\(encoded)')")
        }
    }
}

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {

    var window: UIWindow?

    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        // Override point for customization after application launch.
        return true
    }

    func applicationWillResignActive(_ application: UIApplication) {
        // Sent when the application is about to move from active to inactive state. This can occur for certain types of temporary interruptions (such as an incoming phone call or SMS message) or when the user quits the application and it begins the transition to the background state.
        // Use this method to pause ongoing tasks, disable timers, and invalidate graphics rendering callbacks. Games should use this method to pause the game.
    }

    func applicationDidEnterBackground(_ application: UIApplication) {
        // Use this method to release shared resources, save user data, invalidate timers, and store enough application state information to restore your application to its current state in case it is terminated later.
        // If your application supports background execution, this method is called instead of applicationWillTerminate: when the user quits.
    }

    func applicationWillEnterForeground(_ application: UIApplication) {
        // Called as part of the transition from the background to the active state; here you can undo many of the changes made on entering the background.
    }

    func applicationDidBecomeActive(_ application: UIApplication) {
        // Restart any tasks that were paused (or not yet started) while the application was inactive. If the application was previously in the background, optionally refresh the user interface.
    }

    func applicationWillTerminate(_ application: UIApplication) {
        // Called when the application is about to terminate. Save data if appropriate. See also applicationDidEnterBackground:.
    }

    func application(_ app: UIApplication, open url: URL, options: [UIApplication.OpenURLOptionsKey: Any] = [:]) -> Bool {
        // Called when the app was launched with a url. Feel free to add additional processing here,
        // but if you want the App API to support tracking app url opens, make sure to keep this call
        return ApplicationDelegateProxy.shared.application(app, open: url, options: options)
    }

    func application(_ application: UIApplication, continue userActivity: NSUserActivity, restorationHandler: @escaping ([UIUserActivityRestoring]?) -> Void) -> Bool {
        // Called when the app was launched with an activity, including Universal Links.
        // Feel free to add additional processing here, but if you want the App API to support
        // tracking app url opens, make sure to keep this call
        return ApplicationDelegateProxy.shared.application(application, continue: userActivity, restorationHandler: restorationHandler)
    }

}
