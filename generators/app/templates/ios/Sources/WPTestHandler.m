//
//  WPTestHandler.m
//  JudPluginTemp
//
//  Created by 齐山 on 17/3/14.
//  Copyright © 2017年 taobao. All rights reserved.
//

#import "WPTestHandler.h"
#import <JudPlugin/JudPlugin.h>

@implementation WPTestHandler

WX_PlUGIN_EXPORT_HANDLER(WPTestHandler, WXImgLoaderProtocol)

- (id<WXImageOperationProtocol>)downloadImageWithURL:(NSString *)url imageFrame:(CGRect)imageFrame userInfo:(NSDictionary *)userInfo completed:(void(^)(UIImage *image,  NSError *error, BOOL finished))completedBlock
{
    // change your code
    return nil;
}

@end
