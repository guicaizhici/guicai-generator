import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import '@umijs/max';
import React from 'react';

const Footer: React.FC = () => {
  const defaultMessage = '鬼才之刺';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'codeNav',
          title: 'b站',
          href: 'https://www.bilibili.com/',
          blankTarget: true,
        },
        {
          key: 'Ant Design',
          title: '鬼才之刺',
          href: 'https://github.com/guicaizhici',
          blankTarget: true,
        },
        {
          key: 'github',
          title: (
            <>
              <GithubOutlined /> 鬼才之刺
            </>
          ),
          href: 'https://github.com/guicaizhici',
          blankTarget: true,
        },
      ]}
    />
  );
};
export default Footer;
