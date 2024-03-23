// @ts-ignore
/* eslint-disable */
import { request } from '@umijs/max';

/** healthCheck GET /api/health */
export async function healthCheckUsingGet(options?: { [key: string]: any }) {
  return request<string>('/api/health', {
    method: 'GET',
    ...(options || {}),
  });
}
